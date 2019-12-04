package com.example.javabase.package20190517;

/**
 * @author XuJD
 * @create 2019-05-24 10:59
 **/
public class LinkDo {
    int data;
    LinkDo next;

    public LinkDo(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public LinkDo getNext() {
        return next;
    }

    public void setNext(LinkDo next) {
        this.next = next;
    }
}
