package com.koreait.day01.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class MultiParam {
    String id;
    String name;
    String email;
    int age;
}
