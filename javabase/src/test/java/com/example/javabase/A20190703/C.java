package com.example.javabase.A20190703;

import org.junit.Test;
import org.springframework.util.StringUtils;

/**
 * @author XuJD
 * @create 2019-07-05 16:15
 **/
public class C {

    @Test
    public void a(){
        System.out.println(isValid("()"));
    }

    public boolean isValid(String s) {
        while (s.contains("{}")||s.contains("[]")||s.contains("()")){
            if(s.contains("{}")) s = s.replaceAll("\\{}","");
            if(s.contains("[]")) s = s.replaceAll("\\[]","");
            if(s.contains("()")) s = s.replaceAll("\\(\\)","");
        }
        return s.isEmpty();
    }
}
