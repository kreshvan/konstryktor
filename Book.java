public class Book {
    private String name;
    private Author1 author;
    private int year;
    public String toString() {
        Author1 Do = new Author1("Do", "Li");
        return "Название книги" + " " + name + "." + " " + "Автор" + " " + author + "." + " " + "год создания" + " " + year + ".";
    }
    public Book(String name, Author1 author, int year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }
    public String getName() {
        return this.name;
    }
    public Author1 getAuthor() {
        return this.author;
    }
    public int getYear() {
        return this.year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || other.getClass() != getClass())
            return false;
        Book otherBook = (Book) other;
        return name.equals(otherBook.name) && author.equals(otherBook.author) && year == otherBook.year;
    }
    @Override
    public int hashCode() {
        return java.util.Objects.hash(name, author, year);
    }
}








