package classes.services;

import classes.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BookService {

    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> getBooksByAuthor(String author) {

        List<Book> result = new ArrayList<>();

        books.forEach(book -> book.getAuthors().stream().filter(author::equals).map(item -> book).forEachOrdered(result::add));

        return result;
    }

    public List<Book> getBooksByPublisher(String publisher) {

        return books.stream().filter(item -> publisher.equals(item.getPublisher())).collect(Collectors.toList());

    }

    public List<Book> getBooksAfterYear(int year) {

        return books.stream().filter(item -> year == item.getYear()).collect(Collectors.toList());
    }
}
