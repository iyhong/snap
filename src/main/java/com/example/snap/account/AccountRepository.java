package com.example.snap.account;

import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

public interface AccountRepository extends JpaRepository<Account, Long> {
    @Transactional
//    @Query("SELECT id, password FROM Account account WHERE account.id =:id")
    Account findById(String id);

}
