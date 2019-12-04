package com.example.javabase;


/**
 * 基于数组实现的栈
 * @author XuJD
 * @create 2019-01-17 17:26
 **/
public class StackTest {
    private String[] data = null;
    private int maxSize = 0;
    private int top = -1;

    public StackTest(int maxSize){
        if(maxSize>=0){
            this.maxSize = maxSize;
            data = new String[maxSize];
            top = -1;
        }else{
            throw new RuntimeException("栈空间不能小于0");
        }
    }
    /*判断栈是否为空*/
    public boolean isEmpty(){
        return top==-1;
    }
    /*判断栈是否满了*/
    public boolean isFull(){
        return maxSize-1==top;
    }
    /*入栈*/
    public void push(String param){
        if(isFull()){
            throw new RuntimeException("栈已满");
        }
        data[++top] = param;
    }
    /*出栈*/
    public String pop(){
        String d = data[top];
        data[top] = null;
        top--;
        return d;
    }
    /*返回栈顶元素*/
    public String peek(){
        return data[top];
    }

}
