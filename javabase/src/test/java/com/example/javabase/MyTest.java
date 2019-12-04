package com.example.javabase;

import org.junit.Test;

/**
 * @author XuJD
 * @create 2019-01-17 17:49
 **/
public class MyTest {

    @Test
    public void test(){
        StackTest stackTest = new StackTest(11);
        for(int i=0;i<10;i++){
            stackTest.push("------"+i);
        }
        System.out.println(stackTest.isFull());
        while (!stackTest.isEmpty()){
            System.out.println(stackTest.pop());
        }
        System.out.println(stackTest.isEmpty());
    }
    @Test
    public void test1(){
        StackTest1 stackTest1 = new StackTest1();
        for(int i=0;i<10;i++){
            stackTest1.push("------"+i);
        }
        System.out.println(stackTest1.peek());
        System.out.println(stackTest1.isEmpty());
        while (!stackTest1.isEmpty()){
            System.out.println(stackTest1.pop());
        }
        System.out.println(stackTest1.isEmpty());
    }
    @Test
    public void test2(){
        StackTest2 stackTest2 = new StackTest2();
        for(int i=0;i<10;i++){
            stackTest2.push("------"+i);
        }
        System.out.println();
        System.out.println(stackTest2.isEmpty());
        while (!stackTest2.isEmpty()){
            System.out.println(stackTest2.pop());
        }
        System.out.println(stackTest2.isEmpty());
    }

    @Test
    public void test3(){
        Queue1 queue1 = new Queue1(10);
        for(int i=0;i<10;i++){
            queue1.push("---------"+i);
        }
        System.out.println(queue1.peek());
        System.out.println(queue1.isFull());
        while (!queue1.isEmpty()){
            System.out.println(queue1.pop());
        }
        System.out.println(queue1.isFull());
    }
}
