package com.example.javabase.queueAndStack;

/**
 * @author XuJD
 * @create 2019-11-21 10:11
 * 基于数组实现队列
 **/
public class Queue3 {
    /**
     * 队列
     */
    private String[] data;
    /**
     * 队列最大长度
     */
    private int maxSize;
    /**
     * 队列头节点
     */
    private int first;
    /**
     * 队列尾节点
     */
    private int last;

    public Queue3(int maxSize){
        if(maxSize>=0){
            this.maxSize = maxSize;
            this.first = 0;
            this.last = 0;
            data = new String[maxSize];
        }else{
            throw new RuntimeException("队列大小不能小于0");
        }
    }

    /**
     * 判断队列是否已满
     * @return
     */
    public boolean isFull(){
        return maxSize==(last-first);
    }
    /**
     * 判断队列是否为空
     */
    public  boolean isEmpty(){
        return first==last;
    }

    /**
     * 添加数据到队列尾部
     * @param param
     */
    public void add(String param){
        if(isFull()){
            throw new RuntimeException("队列已满");
        }else{
            data[last++] = param;
        }
    }

    /**
     * 获取队列头部元素
     */
    public String getFirst(){
        if(isEmpty()){
            throw new RuntimeException("队列为空");
        }else{
            return data[first];
        }
    }
    /**
     * 获取尾部元素
     */
    public String getLast(){
        if(isEmpty()){
            throw new RuntimeException("队列为空");
        }else{
            return data[last-1];
        }
    }
    /**
     * 获取头部元素并移除
     */
    public String pop(){
        if(isEmpty()){
            throw new RuntimeException("队列为空");
        }else{
            String val = data[first];
            data[first++] = null;
            return val;
        }
    }
    /**
     * 返回队列长度
     * @return
     */
    public int length(){
        return last-first;
    }


    public static void main(String[] args) {
        Queue3 q = new Queue3(3);
        q.add("1");
        q.add("2");
        q.add("3");
        System.out.println(q.pop());
        System.out.println(q.getFirst());
        System.out.println(q.getLast());
        System.out.println(q.isEmpty());
        System.out.println(q.isFull());
        System.out.println(q.length());
    }
}
