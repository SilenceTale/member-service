package org.koreait.member.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity

public class TempToken {

    @Id
    @Column(length = 45)
    private String token;

    @ManyToOne(fetch = FetchType.LAZY)
    private Member member;

    private LocalDateTime expireTime
}
