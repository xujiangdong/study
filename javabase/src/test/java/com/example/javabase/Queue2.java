package com.example.javabase;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 基于LinkList实现的队列
 * @author XuJD
 * @create 2019-01-18 9:58
 **/
public class Queue2<E> {
    private Queue<E> queue = new LinkedList<E>();

    // 将指定的元素插入此队列（如果立即可行且不会违反容量限制），在成功时返回 true，
    //如果当前没有可用的空间，则抛出 IllegalStateException。
    public boolean push(E e){
        return queue.add(e);
    }

    //获取，但是不移除此队列的头。
    public E element(){
        return queue.element();
    }

    //将指定的元素插入此队列（如果立即可行且不会违反容量限制），当使用有容量限制的队列时，
    //此方法通常要优于 add(E)，后者可能无法插入元素，而只是抛出一个异常。
    public boolean offer(E e){
        return queue.offer(e);
    }

    //获取但不移除此队列的头；如果此队列为空，则返回 null
    public E peek(){
        return queue.peek();
    }

    //获取并移除此队列的头，如果此队列为空，则返回 null
    public E poll(){
        return queue.poll();
    }

    //获取并移除此队列的头
    public E remove(){
        return queue.remove();
    }

    //判空
    public boolean empty() {
        return queue.isEmpty();
    }
}
