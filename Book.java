public class Book {
    private String name;
    private Author author;
    private int year;
    public Book(String name, String Author, int year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }
    public String getName() {
        return this.name;
    }
    public Author getAuthor() {
        return this.author;
    }
    public int getYear() {
        return this.year;
    }
    public void setYear(int year) {
        this.year = year;
    }
}
