package com.demo.FirstSpringBootDemo;

import com.demo.FirstSpringBootDemo.services.Book;
import com.demo.FirstSpringBootDemo.services.Message;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FirstSpringBootDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(FirstSpringBootDemoApplication.class, args);

		System.out.println();
		Message message = context.getBean("message",Message.class);
		System.out.println(message.getMessage());

		Book book = context.getBean("book",Book.class);
		book.setBookId(101);
		book.setBookName("Harry Potter");

		System.out.println();
		System.out.println("Book Id = " + book.getBookId());
		System.out.println();
		System.out.println("Book Name = " + book.getBookName());
		System.out.println();
		System.out.println(book);
	}

}
