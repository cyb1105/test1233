package com.myproject.demo.springboot.service;

import com.myproject.demo.springboot.entity.Member;
import com.myproject.demo.springboot.repository.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MemberService {
    @Autowired
    private MemberMapper mapper;

    public List<Member> findAll() {
        List<Member> members = new ArrayList<>();
        mapper.selectAllMembers().forEach(e -> members.add(e));

        return members;
    }

    public Member findByIdx(Long idx) {
        Member member = mapper.selectMemberByIdx(idx);
        return member;
    }
}
