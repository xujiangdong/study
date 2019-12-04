package com.example.javabase.model;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * @author XuJD
 * @create 2019-11-07 14:04
 **/
@Data
@Accessors(chain = true)
public class User {
    private String name;
    private Integer age;
    private Date birthday;
    private String sex;
}
