package com.koreait.demo.practice1;

import lombok.*;

import java.util.Date;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Animal {
    private String eyeColor;
    private Date birthday;
}
