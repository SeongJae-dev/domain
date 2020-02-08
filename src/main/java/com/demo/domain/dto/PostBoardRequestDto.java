package com.demo.domain.dto;


import com.demo.domain.entity.BoardEntity;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class PostBoardRequestDto {

    private String title;
    private String content;
    private int hitcnt=0;
    private String createId;
    private LocalDateTime createDateTime = LocalDateTime.now();

    public BoardEntity toEntity(){
        return BoardEntity.builder()
                .title(title)
                .content(content)
                .hitcnt(hitcnt)
                .build();
    }
}
