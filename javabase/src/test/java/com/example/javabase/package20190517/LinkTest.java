package com.example.javabase.package20190517;

import org.junit.Test;

/**
 * @author XuJD
 * @create 2019-05-24 11:00
 **/
public class LinkTest {

    //单链表反转
    @Test
    public void a(){
        LinkDo d1 = new LinkDo(1);
        LinkDo d2 = new LinkDo(2);
        LinkDo d3 = new LinkDo(3);
        LinkDo d4 = new LinkDo(4);
        d1.next = d2;
        d2.next = d3;
        d3.next = d4;
        System.out.println(d1.getData());
        System.out.println(d1.next.getData());
        System.out.println(d1.next.next.getData());
        System.out.println(d1.next.next.next.getData());
        System.out.println("-------单链表反转------");
        LinkDo newD = reserveLink(d1);
        System.out.println(newD.getData());
        System.out.println(newD.next.getData());
        System.out.println(newD.next.next.getData());
        System.out.println(newD.next.next.next.getData());
    }

    private LinkDo reserveLink(LinkDo head) {
        if(head == null || head.next==null){
            return head;
        }
        LinkDo newD = reserveLink(head.next);
        head.next.next = head;
        head.next = null;
        return newD;
    }
}
