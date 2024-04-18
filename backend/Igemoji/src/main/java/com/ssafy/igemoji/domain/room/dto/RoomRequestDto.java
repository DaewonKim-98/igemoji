package com.ssafy.igemoji.domain.room.dto;

import lombok.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Getter
public class RoomRequestDto {
    private Integer memberId;
    private String title;
    private Integer questionNum;
    private Boolean isOpen;
    private String password;
}
