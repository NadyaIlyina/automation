package classes.services;

import classes.Book;

import java.util.ArrayList;
import java.util.List;

public class BookService {

    private Book[] books;

    public BookService(Book[] books) {

        this.books = books;

    }

    public List<Book> getBooksByAuthor(String author) {

        List<Book> result = new ArrayList<>();

        for (Book book : books) {
            for (String item : book.getAuthors()) {
                if (author.equals(item)) {
                    result.add(book);
                }
            }
        }

        return result;
    }

    public List<Book> getBooksByPublisher(String publisher) {

        List<Book> result = new ArrayList<>();

        for (Book item : books) {
            if (publisher.equals(item.getPublisher())) {
                result.add(item);
            }
        }

        return result;
    }

    public List<Book> getBooksAfterYear(int year) {

        List<Book> result = new ArrayList<>();

        for (Book item : books) {
            if (year < item.getYear()) {
                result.add(item);
            }
        }

        return result;
    }
}
