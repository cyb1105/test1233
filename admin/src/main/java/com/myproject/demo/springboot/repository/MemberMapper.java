package com.myproject.demo.springboot.repository;

import com.myproject.demo.springboot.entity.Member;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface MemberMapper {
    List<Member> selectAllMembers();

    Member selectMemberByIdx(Long idx);

    void insertMember(Member user);
}
