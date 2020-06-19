package com.myproject.demo.springboot.controller;

import com.myproject.demo.springboot.entity.Member;
import com.myproject.demo.springboot.service.MemberService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@Slf4j
@RequestMapping("/admin")
public class MemberController {
    @Autowired
    MemberService service;

    @GetMapping(value = "/dashboard")
    public String dashabord(Model model) {
        List<Member> members = service.findAll();
        model.addAttribute("count", members != null ? members.size() : 0);

        return "admin";
    }

    @GetMapping(value = "/users")
    public String getAllMembers(Model model) {
        List<Member> members = service.findAll();
        model.addAttribute("list", members);

        return "users";
    }
}
