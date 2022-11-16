package com.Ezenweb.domain.entity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<MemberEntity,Integer> {
    // extends JpaRepository<매핑할클래스명, @ID필드의 자료형>
}