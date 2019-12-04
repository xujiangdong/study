package com.example.javabase.model;

import lombok.Data;

/**
 * @author XuJD
 * @create 2019-11-07 14:06
 **/
@Data
public class UserVO extends User {
    private String nameVO;
    private Integer ageVO;
    private Book book;
}
