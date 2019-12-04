package com.example.javabase;

import com.example.javabase.model.User;
import com.example.javabase.model.UserVO;
import org.springframework.beans.BeanUtils;
import org.springframework.cglib.beans.BeanCopier;


import java.util.Date;

/**
 * @author XuJD
 * @create 2019-11-07 15:19
 **/
public class TestMain {

    public static void main(String[] args) {
        User user = new User()
                .setAge(12)
                .setName("张三")
                .setSex("男")
                .setBirthday(new Date());
        UserVO userVO = new UserVO();
        BeanCopier copier = BeanCopier.create(User.class,UserVO.class,false);
        copier.copy(user,userVO,null);
        System.out.println(user.toString());
        System.out.println(userVO.toString());
    }

}
