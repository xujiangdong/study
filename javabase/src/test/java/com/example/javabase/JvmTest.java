package com.example.javabase;

import org.junit.Test;

/**
 * @author XuJD
 * @create 2018-10-25 13:50
 **/
public class JvmTest {
    /**
     * 自动装箱和拆箱
     */
    @Test
    public void test(){
        Integer a=1;
        Integer b=2;
        Integer c=3;
        Integer d=3;
        Integer e=321;
        Integer f=321;
        Long g=3L;
        System.out.println(c == d);
        System.out.println(e == f);
        System.out.println(c == (a+b));
        System.out.println(c.equals(a+b));
        System.out.println(g == (a+b));
        System.out.println(g.equals(a+b));
    }

    /**
     * 链表反转
     */
    static class Node{//节点类
        Integer data;
        Node next;

        public Integer getData() {
            return data;
        }

        public void setData(Integer data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
    public Node readyNode(){//初始化一个链表
        Node linkNode1 = new Node();
        linkNode1.data = 1;
        Node linkNode2 = new Node();
        linkNode2.data = 2;
        Node linkNode3 = new Node();
        linkNode3.data = 3;
        Node linkNode4 = new Node();
        linkNode4.data = 4;
        Node linkNode5 = new Node();
        linkNode5.data = 5;
        linkNode1.next = linkNode2;
        linkNode2.next = linkNode3;
        linkNode3.next = linkNode4;
        linkNode4.next = linkNode5;
        return linkNode1;
    }

    public Node reverserNode(Node node){//递归算法实现反转  从后往前反转
        if(node==null || node.next==null){
            return node;
        }else{
            Node headNode = reverserNode(node.next);
            node.next.next = node;
            node.next = null;
            return headNode;
        }
    }

    public Node reverserNode1(Node node){//遍历反转  从前往后
        if(node==null || node.next == null){
            return node;
        }else{
            Node pre = node;//上一个节点
            Node cur = node.next;//当前节点
            Node tem;//临时节点
            while(cur!=null){
                tem = cur.next;
                cur.next = pre;//反转指针域指向
                //指针往后移动
                pre = cur;
                cur = tem;
            }
            node.next = null;
            return pre;
        }
    }

    @Test
    public void test2(){
        Node node = readyNode();
        System.out.println("反转前：");
        while (null != node) {
            System.out.print(node.getData() + " ");
            node = node.next;
        }
        Node node1 = readyNode();
        node1 = reverserNode1(node1);
        System.out.println();
        System.out.println("反转后：");
        while (null != node1) {
            System.out.print(node1.getData() + " ");
            node1 = node1.next;
        }
    }

}
