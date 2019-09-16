package com.example.snap.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MemberContorller {

    @Autowired
    private TeamRepository teamRepository;

    @Autowired
    private MemberRepository memberRepository;

    @GetMapping("/member/{id}")
    public List<Member> member(@PathVariable Long id){
        Team team = new Team();
        team.setId(id);
        team.setName("A team");
        teamRepository.save(team);
        Member member1 = new Member();
        member1.setName("inyong");
        member1.setTeam(team);
        memberRepository.save(member1);
        Member member2 = new Member();
        member2.setName("mirim");
        member2.setTeam(team);
        memberRepository.save(member2);

        return memberRepository.findByTeam_Id(id);

    }
}
