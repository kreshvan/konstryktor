public class Main {
    public static void main(String[] arg) {
        Author Do = new Author("Do", "Li");
        Book book1 = new Book("Car", Do, 2000);
        Author Ivanov = new Author("Alexey", "Ivanov");
        Book book2 = new Book("Loft", Ivanov, 1992);
        book1.setYear(2000);
        System.out.println("book1.getYear() = " + book1.getYear());
        Author author0 = new Author("Robert", "Dayny");
        Author author10 = new Author("Kris", "Kandy");
    }
}