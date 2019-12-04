package com.example.javabase;

import org.junit.Test;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author XuJD
 * @create 2019-01-11 10:19
 **/
public class FileStreamTest {

    public static void main(String[] arg) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(inputStreamReader);
        String s = null;
        s = br.readLine();
        while (s != null){
            System.out.println(s.toUpperCase());
            s = br.readLine();
            if(s.equalsIgnoreCase("exit")){
                break;
            }
        }
    }

    @Test
    public void a() throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("G://text.txt",true);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
        FileInputStream fileInputStream = new FileInputStream("G://text1.txt");
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
        int b = 0;
        while ((b = inputStreamReader.read()) != -1){
            bufferedOutputStream.write(b);
            System.out.println(b);
        }
        fileInputStream.close();
        fileOutputStream.close();
    }
}
