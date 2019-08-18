package com.example.snap.account;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import javax.transaction.Transactional;

public interface AccountRepository extends JpaRepository<Account, Long> {
//    @Query("SELECT id, password FROM Account account WHERE account.id =:id")

    @Transactional
    Account findById(String id);

//    select * => select account
//    query binding 할때 =: email 은 에러남 = :email 로 해야됨 띄어쓰기 유의
    @Transactional
    @Query("SELECT account FROM Account account where account.email = :email")
    Account findByMailaa(@Param("email") String email);
}
