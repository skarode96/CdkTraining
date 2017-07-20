import java.util.ArrayList;
import java.util.List;

/**
 * Created by karodes on 7/19/2017.
 */
public class Book {
    long isbn;
    String name;

    public Book(long isbn, String name) {
        this.isbn = isbn;
        this.name = name;
    }

    public long getIsbn() {
        return isbn;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn=" + isbn +
                ", name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }
    public static List<Object> giveTestData() {
        List<Object> bookList = new ArrayList<>();
        bookList.add(new Book(93821,"Superman"));
        bookList.add(new Book(19239,"Dawn of Justice"));
        bookList.add(new Book(23423,"Shiva"));
        bookList.add(new Book(10023,"Harry Potter"));

        return bookList;
    }

}
