package com.example.snap.Login;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;
import java.util.Collection;

public interface AccountRepository extends JpaRepository<Account, Long> {
    @Transactional
//    @Query("SELECT id, password FROM Account account WHERE account.id =:id")
    Account findById(String id);
}
