package com.example.javabase.queueAndStack;

/**
 * @author XuJD
 * @create 2019-11-21 10:51
 * 基于数组实现栈
 **/
public class Stack3 {
    /**
     * 栈元素数组
     */
    private String[] data;
    /**
     * 栈大小
     */
    private int maxSize;
    /**
     * 栈顶节点
     */
    private int top;

    public Stack3(int maxSize){
        if(maxSize>=0){
            this.maxSize = maxSize;
            this.top = 0;
            data = new String[maxSize];
        }else{
            throw new RuntimeException("栈初始化小大不能小于0");
        }
    }

    /**
     * 判断是否为空栈
     */
    public boolean isEmpty(){
        return top==0;
    }

    /**
     * 判断栈是否已满
     */
    public boolean isFull(){
        return maxSize==top;
    }

    /**
     * 元素入栈
     */
    public void push(String param){
        if(isFull()){
            throw new RuntimeException("栈已满");
        }else{
            data[top++] = param;
        }
    }

    /**
     * 出栈
     * @return
     */
    public String pop(){
        if(isEmpty()){
            throw new RuntimeException("空栈");
        }else{
            String val = data[top-1];
            data[top-1] = null;
            top--;
            return val;
        }
    }

    /**
     * 返回栈顶元素
     * @return
     */
    public String peek(){
        return data[top-1];
    }

    public static void main(String[] args) {
        Stack3 s = new Stack3(3);
        s.push("1");
        s.push("2");
        s.push("3");
        System.out.println(s.pop());
        System.out.println(s.peek());
        System.out.println(s.isEmpty());
        System.out.println(s.isFull());
    }
}
