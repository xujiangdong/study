package com.example.javabase;

/**
 * 基于链表实现的栈
 * @author XuJD
 * @create 2019-01-17 18:30
 **/
public class StackTest2<E> {
    //链栈的节点
    private class Node<E>{
        E e;
        Node<E> next;
        public Node(){}
        public Node(E e, Node next){
            this.e = e;
            this.next = next;
        }
    }
    private Node<E> top;   //栈顶元素
    private int size;  //当前栈大小

    public StackTest2(){
        top = null;
    }

    //当前栈大小
    public int length(){
        return size;
    }

    //判空
    public boolean isEmpty(){
        return size==0;
    }

    //入栈：让top指向新创建的元素，新元素的next引用指向原来的栈顶元素
    public boolean push(E e){
        top = new Node(e,top);
        size ++;
        return true;
    }

    //查看栈顶元素但不删除
    public Node<E> peek(){
        if(isEmpty()){
            throw new RuntimeException("空栈异常！");
        }else{
            return top;
        }
    }

    //出栈
    public Node<E> pop(){
        if(isEmpty()){
            throw new RuntimeException("空栈异常！");
        }else{
            Node<E> value = top; //得到栈顶元素
            top = top.next; //让top引用指向原栈顶元素的下一个元素
            value.next = null;  //释放原栈顶元素的next引用
            size --;
            return value;
        }
    }

}
