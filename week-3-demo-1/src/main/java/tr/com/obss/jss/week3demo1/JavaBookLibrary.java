package tr.com.obss.jss.week3demo1;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class JavaBookLibrary implements BookLibrary{

    @Override
    public List<Book> listBook() {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Son Ada",12));
        books.add(new Book("Bir Kedi, Bir Adam, Bir Ölüm",15));

        return books;
    }
}
