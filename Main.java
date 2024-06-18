public class Main {
    public static void main(String[] arg) {
        Author1 Do = new Author1("Do", "Li");
        Book book1 = new Book("Car", Do, 2000);
        Author1 Ivanov = new Author1("Alexey", "Ivanov");
        Book book2 = new Book("Loft", Ivanov, 1992);
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book1.equals(book2));
        System.out.println(book1.equals(book2) );
        //book1.setYear(2001);
        // System.out.println("book1.getYear() = "+book1.getYear());
        Author1 author0 = new Author1("Robert", "Dayny");
        System.out.println(author0);
        Author1 author10 = new Author1("Kris", "Kandy");
        System.out.println(author10);
        System.out.println(author0.equals(author10));
    }
}