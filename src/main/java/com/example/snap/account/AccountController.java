package com.example.snap.account;

import com.example.snap.domain.Login;
import com.example.snap.domain.Result;
import com.example.snap.util.MailUtils;
import com.example.snap.util.TempKey;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.*;

import javax.mail.MessagingException;
import javax.validation.Valid;
import java.io.UnsupportedEncodingException;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/")
public class AccountController {

    private static Logger logger = LoggerFactory.getLogger(AccountController.class);

    @Value("${ec2.url}")
    private String url;

    @Autowired
    private AccountRepository accountRepository;
    @Autowired
    private JavaMailSender sender;
//    @PostMapping("/accounts")
//    public void register(@RequestBody Account account){
//
//        accountRepository.save(account);
//    }

    @PostMapping("/accounts/login")
    public Result login(@RequestBody @Valid Login login){
        Result result = new Result();
        Account account = accountRepository.findById(login.getId());
        logger.debug("-----------------------param id: "+login.getId());
        if(account == null){
            result.setCode(HttpStatus.BAD_REQUEST.value());
            result.setMessage("There is no ID");
            return result;
        }

        if(!account.getPassword().equals(login.getPassword())){
            result.setCode(HttpStatus.UNAUTHORIZED.value());
            result.setMessage("Unauthorized login failed");
            return result;
        }

        return result;

    }

    @GetMapping("/accounts")
    public List<Account> getAccounts () {
        return accountRepository.findAll();
    }

    @GetMapping("/accounts/{id}")
    public Result<Account> getAccount(@PathVariable("id") String id){
        Result<Account> result = new Result<>();
        Account account = accountRepository.findById(id);
        if(account == null){
            result.setCode(HttpStatus.BAD_REQUEST.value());
            result.setMessage("There is no ID");
            return result;
        }
        result.setResult(account);
        return result;
    }

    @PostMapping("accounts/create")
    public Result create(@RequestBody @Valid Account accountParam){
        Result result = new Result();
        accountParam.setAuthYN("N");
        if(accountRepository.findById(accountParam.getId()) != null){
            result.setCode(HttpStatus.CONFLICT.value());
            result.setMessage("There is a duplicate ID.");
            return result;
        }
        String key = new TempKey().getKey(50, false);
        accountParam.setAuthKey(key);
        accountRepository.save(accountParam);
        MailUtils sendMail = null;
        try {
            sendMail = new MailUtils(sender);
            sendMail.setSubject("Snap 이메일 인증");
            sendMail.setText(new StringBuffer()
                    .append("저희 snap에 가입해 주셔서 감사합니다.\n")
                    .append("아래 링크를 클릭하시면 이메일 인증이 완료됩니다.\n")
                    .append(url)
                    .append("/api/accounts/")
                    .append(accountParam.getId())
                    .append("/")
                    .append(accountParam.getAuthKey())
                    .toString()
            );
            sendMail.setFrom("test@daum.net", "no-reply");
            sendMail.setTo(accountParam.getEmail());
            sendMail.send();
        } catch (MessagingException | UnsupportedEncodingException e) {
            e.printStackTrace();
            result.setCode(HttpStatus.SERVICE_UNAVAILABLE.value());
            result.setMessage("There is an error about sending an email");
            return result;
        }
        result.setCode(HttpStatus.CREATED.value());
        return result;
    }

    @GetMapping("/accounts/{id}/{authKey}")
    public Result authCompleteEmail(@PathVariable String id, @PathVariable String authKey){
        logger.debug("authCompleteEmail");
        Result result = new Result();
        Account account = accountRepository.findById(id);
        if(!authKey.equals(account.getAuthKey())){
            result.setCode(HttpStatus.CONFLICT.value());
            result.setMessage("There is an error about auth");
            return result;
        }
        account.setAuthYN("Y");
        accountRepository.save(account);
        return result;
    }

//    @GetMapping("/byMail/")
//    public Account getAccountByMail(){
//        String email = "abc@abc.com";
//        Account account = accountRepository.findByMailaa(email);
//        return account;
//    }

    @GetMapping("/accounts/valid/{id}")
    public Result checkValidationId(@PathVariable String id){
        Result result = new Result();
        Account account = accountRepository.findById(id);
//       중복이 없음.
        if (account == null) {
            return result;
        }
        result.setCode(HttpStatus.CONFLICT.value());
        result.setMessage("There is a duplicate ID.");
        return result;
    }

//    @GetMapping("/testMail")
//    public void sendMailTest() throws MessagingException, UnsupportedEncodingException {
//        MailUtils sendMail = new MailUtils(sender);
//        sendMail.setSubject("Test Mail Subject");
//        sendMail.setText("this is test mail contents");
//        sendMail.setFrom("test@daum.net", "관리자");
//        sendMail.setTo("loverman85@hanmail.net");
//        sendMail.send();
//
//    }

    @GetMapping("/test")
    public void test(){
//        Address1 address1 = new Address1();
//        address1.setName("test");
//        address1Repository.save(address1);
//        Address2 address2 = new Address2();
//        address2.setName("testChild");
//        address2.setAddress1(address1);
//        address2Repository.save(address2);
    }

}
