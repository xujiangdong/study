package com.example.javabase;

import org.junit.Test;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

@SpringBootTest
public class BptconfigApplicationTests {
	private final org.slf4j.Logger logger = LoggerFactory.getLogger(this.getClass());
	@Test
	public void contextLoads() {
		logger.error("我是一个bug");
	}
	@Test
	public void outPut() throws IOException {
		/*ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(new File("G://text.txt")));
		User user = new User();
		user.setName("张三");
		user.setId(999L);
		user.setMail("queueAndStack.changingedu.com");
		objectOutputStream.writeObject(user);
		System.out.println("----User对象序列化成功");
		objectOutputStream.close();*/
	}
	@Test
	public void inPut() throws IOException, ClassNotFoundException {
		/*ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(new File("G://text.txt")));
		User user = (User) objectInputStream.readObject();
		System.out.println("-------User对象反序列化成功-----");
		System.out.println(JSONObject.toJSON(user));*/
	}
}
