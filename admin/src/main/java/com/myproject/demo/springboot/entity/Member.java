package com.myproject.demo.springboot.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@Data
@AllArgsConstructor
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idx;


    private String name;
    private String username;
    private String email;
    private String password;
    private String userkey;



    @Builder
    public Member(String name, String username, String email, String password,String userkey) {

        this.name = name;
        this.username = username;
        this.email = email;
        this.password = password;
        this.userkey = userkey;
    }
}
