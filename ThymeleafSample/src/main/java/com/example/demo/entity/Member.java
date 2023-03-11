package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor //모든 필드값을 파라미터로 받는 생성자를 만듦.
public class Member {
    private Integer id;
    private String name;
}
