package com.myproject.demo.springboot.controller;

import com.myproject.demo.springboot.entity.Member;
import com.myproject.demo.springboot.service.MemberService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/admin")
public class APIMemberController {
    @Autowired
    MemberService service;

    @GetMapping(value = "/members", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<List<Member>> getAllMembers() {
        List<Member> members = service.findAll();

        return new ResponseEntity<List<Member>>(members, HttpStatus.OK);
    }

    @GetMapping(value = "/members/{idx}", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<Member> getMember(@PathVariable(value = "idx") Long idx) {
        Member member = service.findByIdx(idx);

        return new ResponseEntity<Member>(member, HttpStatus.OK);
    }
}
