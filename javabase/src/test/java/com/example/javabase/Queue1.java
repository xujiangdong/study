package com.example.javabase;

/**
 * 基于数组实现的队列
 * @author XuJD
 * @create 2019-01-17 19:15
 **/
public class Queue1 {
    private String[] data = null;
    private int maxSize;//队列大小
    private int front;//队列首部
    private int rear;//队列尾部

    Queue1(int maxSize){
        if(maxSize>=0){
            this.maxSize = maxSize;
            front=rear=0;
            data = new String[maxSize];
        }else{
            throw new RuntimeException("初始化大小不能小于0");
        }
    }
    /*判断队列是否为空*/
    public boolean isEmpty(){
        return front==rear;
    }
    /*判断队列是否已满*/
    public boolean isFull(){
        return maxSize==rear;
    }
    /*往队列尾部添加元素*/
    public void push(String param){
        if(isFull()){
            throw new RuntimeException("队列已满");
        }else{
            data[rear++] = param;
        }
    }
    /*返回队列首元素 并删除*/
    public String pop(){
        if(isEmpty()){
            throw new RuntimeException("空队列异常");
        }else{
            String value = data[front];
            data[front++] = null;
            return value;
        }
    }
    /*返回队列首元素*/
    public String peek(){
        if(isEmpty()){
            throw new RuntimeException("空队列异常");
        }else{
            return data[front];
        }
    }
    /*返回队列长度*/
    public int length(){
        return rear-front;
    }
}
