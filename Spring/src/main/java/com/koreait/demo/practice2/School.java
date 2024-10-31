package com.koreait.demo.practice2;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Component
public class School {
    @Autowired
    private Person person;
}





