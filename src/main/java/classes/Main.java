package classes;

import classes.services.BookService;

import java.util.Arrays;

public class Main {

    static Book[] books = new Book[3];
    static BookService service = new BookService(books);

    public static void main(String[] args) {

        books[0] = new Book(0, "Hi", Arrays.asList("J", "S", "B"), "S.Peter", 2020,
                205, 23.6, "no");
        books[1] = new Book(1, "Hello", Arrays.asList("A", "S", "G"), "Minsk", 2015,
                205, 23.6, "no");
        books[2] = new Book(2, "GladToSeeYou", Arrays.asList("J", "B", "A"), "S.Peter", 2018,
                205, 23.6, "no");

        for (int i=0;i<3;i++){
            System.out.println(books[i].getName());
        }

        System.out.println("Books by Author: " + service.getBooksByAuthor("B"));
        System.out.println("Books by Publisher: " + service.getBooksByPublisher("S.Peter"));
        System.out.println("Books after 2009: " + service.getBooksAfterYear(2018));

    }
}
