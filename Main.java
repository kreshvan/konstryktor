public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Gold", "Alexey Ivanov", 1980);
        Book book2 = new Book("Loft", "Petr Cars", 1992);
        book1.setYear(2000);
        System.out.println("book1.getYear() = "+book1.getYear());
        Author author1 = new Author("Robert", "Dayny");
        Author author2 = new Author("Kris", "Kandy");
    }
}