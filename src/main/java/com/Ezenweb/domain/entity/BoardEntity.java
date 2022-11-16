package com.Ezenweb.domain.entity;


import com.Ezenweb.domain.dto.MemberDto;
import lombok.*;

import javax.persistence.*;

@Entity @Table(name="board") @NoArgsConstructor @AllArgsConstructor @Getter @Setter @ToString @Builder
public class BoardEntity {
    // 1. 필드
    @Id // 엔티티당 무조건 1개이상[ PK ]
    @GeneratedValue( strategy = GenerationType.IDENTITY ) // 자동번호 부여
    private int bno;        // 게시판 번호
    // not null;
    @Column(nullable = false)
    private String btitle;  // 게시판 제목

    @Column(nullable = false) // not null;
    private String bcontent; // 게시판 내용
    public MemberDto toDto(){
        return MemberDto.builder().memail(this.btitle).mpassword(this.bcontent).build();
    }

}
