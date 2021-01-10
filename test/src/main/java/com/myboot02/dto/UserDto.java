package com.myboot02.dto;

import com.myboot02.domain.User;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

public class UserDto {

    @Data
   // @Builder
    public static class signUpDto implements Serializable { //Serializable 하나의 객체로 보낼 수 있게 해주므로 더 효율적
        private String userName;
        private String userId;
        private String password;
        private String nickname;
        private String email;
        private String certificationNo;

        public User addUser(){//dto를 vo로 converting하는 것
            return new User(this.getUserId(),this.getUserName(),this.getPassword()
                    ,this.getNickname(),this.getEmail(),this.getCertificationNo());
        }
    }

//    @Data
//    public static class loginDto{
//        private String userId;
//        private String password;
//
//        public User login(){
//            return new User(this.getUserId(),this.getPassword());
//        }
//
//    }
}
