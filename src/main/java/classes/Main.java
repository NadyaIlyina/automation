package classes;

import classes.services.BookService;

import java.util.Arrays;

/**
 * Создать классы, спецификации которых приведены ниже. Определить конструкторы и методы setТип(), getТип(), toString().
 * Определить дополнительно методы в классе, создающем массив объектов. Задать критерий выбора данных и вывести эти
 * данные на консоль. В каждом классе, обладающем информацией, должно быть объявлено несколько конструкторов.
 *
 *  Book: id, Название, Автор (ы), Издательство, Год издания, Количество страниц, Цена, Тип переплета.
 *
 * Создать массив объектов. Вывести:
 *
 * a) список книг заданного автора;
 *
 * b)   список книг, выпущенных заданным издательством;
 *
 * c)   список книг, выпущенных после заданного года.
 * */
public class Main {

    public static void main(String[] args) {
        Book[] books = new Book[3];
        BookService service = new BookService(books);
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
