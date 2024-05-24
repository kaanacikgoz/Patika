package Week5.BookSorter;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        sortingByName();
        System.out.println("------------------------------------------");
        sortingByPageNum();
    }

    //Create Book Objects
    static void getBooks(Set<Book> treeSet) {
        treeSet.add(new Book("Harry Potter and the Chamber of Secrets",251,"J.K.Rowling",1998));
        treeSet.add(new Book("Cosmos",365,"Carl Sagan",1981));
        treeSet.add(new Book("Jaws",278,"Peter Benchley",1974));
        treeSet.add(new Book("Pride and Prejudice",340,"Jane Austen",1853));
        treeSet.add(new Book("Angels & Demons",768,"Dan Brown",2000));
    }

    //Method that sorts books by name
    static void sortingByName() {
        Set<Book> nameTreeSet = new TreeSet<>();
        getBooks(nameTreeSet);
        for (Book book:nameTreeSet) {
            System.out.println("Book Name: "+book.getName());
        }
    }

    //Method that sorts books by page numbers
    static void sortingByPageNum() {
        Comparator<Book> pageComparator = new Comparator<>() {
            @Override
            public int compare(Book b1, Book b2) {
                return Integer.compare(b1.getPageNum(),b2.getPageNum());
            }
        };
        Set<Book> pageTreeSet = new TreeSet<>(pageComparator);
        getBooks(pageTreeSet);
        for (Book book:pageTreeSet) {
            System.out.println("PageNum: "+book.getPageNum());
        }
    }

}
