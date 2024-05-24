package Week5.BookSorter;

public class Book implements Comparable<Book> {

    private String name;
    private int pageNum;
    private String author;
    private int releaseDate;

    Book(String name, int pageNum, String author, int releaseDate) {
        this.name = name;
        this.pageNum = pageNum;
        this.author = author;
        this.releaseDate = releaseDate;
    }

    @Override
    public int compareTo(Book b) {
        return Integer.compare(this.getName().charAt(0),b.getName().charAt(0));
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    int getPageNum() {
        return pageNum;
    }

    void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    String getAuthor() {
        return author;
    }

    void setAuthor(String author) {
        this.author = author;
    }

    int getReleaseDate() {
        return releaseDate;
    }

    void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

}
