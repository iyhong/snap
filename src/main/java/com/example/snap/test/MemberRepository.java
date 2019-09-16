package com.example.snap.test;

import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;
import java.util.List;

public interface MemberRepository extends JpaRepository<Member, Team> {
    @Transactional
    List<Member> findByTeam_Id(Long id);

}
