package com.example.team_pro_ex.com.Entity.Base;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.time.LocalDateTime;
import java.util.Date;

public class member_BaseEntity {

    @CreatedDate
    private Date join_D; //--가입날짜

    //08.24 생각해야할 부분 : 회원 탈퇴를 어떻게 할 지 생각을 해보자
    @CreatedDate
    private Date join_O; //--탈퇴날짜
}
