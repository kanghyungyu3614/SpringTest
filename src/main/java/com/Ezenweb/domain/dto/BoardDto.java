package com.Ezenweb.domain.dto;

import com.Ezenweb.domain.entity.BoardEntity;
import lombok.*;

// 롬북 : 생성자, GET/SET, ToString, 빌더패턴
@NoArgsConstructor @AllArgsConstructor
@Getter @Setter @ToString @Builder
public class BoardDto {
    private String btitle;
    private String bcontent;

    // * dto ---> entity 변환
    public BoardEntity toEntity(){
        return BoardEntity.builder()
                .btitle(this.btitle)
                .bcontent(this.bcontent)
                .build();
    }


}