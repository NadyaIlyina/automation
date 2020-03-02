package classes;

import java.util.List;

public class Book {

    private int id;
    private String name;
    private List<String> authors;
    private String publisher;
    private int year;
    private int pages;
    private double cost;
    private String bindingType;

    public Book(int id, String name, List<String> authors, String publisher, int year, int quantityOfSheets,
                double cost, String type) {
        this.id = id;
        this.name = name;
        this.authors = authors;
        this.publisher = publisher;
        this.year = year;
        this.pages = quantityOfSheets;
        this.cost = cost;
        this.bindingType = type;
    }

    public Book() {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getBindingType() {
        return bindingType;
    }

    public void setBindingType(String bindingType) {
        this.bindingType = bindingType;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", authors=" + authors +
                ", publisher='" + publisher + '\'' +
                ", year=" + year +
                ", pages=" + pages +
                ", cost=" + cost +
                ", bindingType='" + bindingType + '\'' +
                '}';
    }
}
