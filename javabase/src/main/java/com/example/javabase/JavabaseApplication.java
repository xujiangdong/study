package com.example.javabase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavabaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavabaseApplication.class, args);
	}

	/**
	 * 队列
	 */
	public static class Queue{
		private String[] data;
		private int maxSize;
		private int first;
		private int last;

		public Queue(int maxSize) {
			if(maxSize<0){
				throw new RuntimeException("初始化队列大小不能小于0");
			}else{
				this.maxSize = maxSize;
				data = new String[maxSize];
				this.first = 0;
				this.last = 0;
			}
		}

		public boolean isEmpty(){
			return first == last;
		}
		public boolean isFull(){
			return last-first == maxSize;
		}
		public void add(String s){
			if(isFull()){
				throw new RuntimeException("队列已满");
			}else{
				data[last++] = s;
			}
		}
		public String getFirst(){
			return data[first];
		}
		public String getLast(){
			return data[last-1];
		}
		public String pop(){
			if(isEmpty()){
				throw new RuntimeException("空队列");
			}else{
				String s = data[first];
				data[first++] = null;
				return s;
			}
		}
	}

	/**
	 *
	 */
	public static class Stack{
		private String[] data;
		private int maxSize;
		private int top;

		public Stack(int maxSize) {
			if(maxSize<0){
				throw new RuntimeException("栈初始化大小不能小于0");
			}else{
				this.maxSize = maxSize;
				this.top = 0;
				this.data = new String[maxSize];
			}
		}

		public boolean isEmpty(){
			return top == 0;
		}
		public boolean isFull(){
			return top == maxSize;
		}
		public void add(String s){
			if(isFull()){
				throw new RuntimeException("栈已满！");
			}else{
				data[top++] = s;
			}
		}
		public String pop(){
			return data[--top];
		}

	}



}

