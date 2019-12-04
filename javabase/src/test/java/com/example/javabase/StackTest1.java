package com.example.javabase;

import java.util.LinkedList;

/**
 * 基于LinkList实现的栈
 * @author XuJD
 * @create 2019-01-17 18:07
 **/
public class StackTest1<E> {
    private LinkedList<E> linkedList = new LinkedList<>();

    public boolean isEmpty(){
        return linkedList.isEmpty();
    }
    /*在链表首部添加一个元素*/
    public void push(E param){
        linkedList.addFirst(param);
    }
    /*返回链表第一个元素  并删除*/
    public E pop(){
        return linkedList.removeFirst();
    }
    /*返回链表第一个元素*/
    public E peek(){
        return linkedList.getFirst();
    }
}
