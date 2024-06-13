import java.awt.print.Book;
public class book {
    private String name;
    private String Author;
    private int year;
    public book(String name, String Author, int year) {
        this.name = name;
        this.Author = Author;
        this.year = year;
        //book BOOK = new book ("Car","Ivan Ivanov", 2000 );
    }
    public String getName() {
        return this.name;
    }
    public String getAuthor() {
        return this.Author;
    }
    public int getYear() {
        return this.year;
    }
    public void setYear(int year) {
        this.year = year;
    }
}
