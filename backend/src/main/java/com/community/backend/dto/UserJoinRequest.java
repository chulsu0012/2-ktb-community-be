package com.community.backend.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.web.multipart.MultipartFile;

@Getter
@AllArgsConstructor
public class UserJoinRequest {
    private String email;
    private String password;
    private String nickname;
    private MultipartFile profileImg;
}
