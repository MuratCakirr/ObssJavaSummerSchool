package tr.com.obss.jss.week3demo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class Week3Demo1Application {

	public static void main(String[] args) {
		//SpringApplication.run(Week3Demo1Application.class, args);

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Week3Demo1Application.class);
		BookLibrary bookLibrary = context.getBean(BookLibrary.class);
		List<Book> books = bookLibrary.listBook();

		for (Book book:books) {
			System.out.println(book.getName());
			System.out.println(book.getPrice());
		}
	}

	@Bean
	public BookLibrary bookLibrary(){
		return new JavaBookLibrary();
	}

}
