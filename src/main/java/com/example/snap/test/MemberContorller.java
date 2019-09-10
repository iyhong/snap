package com.example.snap.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberContorller {

    @Autowired
    private TeamRepository teamRepository;

    @Autowired
    private MemberRepository memberRepository;

    @GetMapping("/member")
    public void member(){
        Team team = new Team();
        team.setId(12L);
        team.setName("A team");
        Member member1 = new Member();
        member1.setName("inyong");
        team.setMembers(member1);
        memberRepository.save(member1);
        Member member2 = new Member();
        member2.setName("mirim");
        team.setMembers(member2);
        memberRepository.save(member2);
        teamRepository.save(team);

    }
}
