public class Main {
    public static void main(String[] args) {
        book book1 = new book("Gold", "Alexey Ivanov", 1980);
        book book2 = new book("Loft", "Petr Cars", 1991);
        book1.setYear(2000);//изменение годаа
        System.out.println("book1.getYear() = "+book1.getYear());
        Author author1 = new Author("Robrrt", "Dauny");
        Author author2 = new Author("Kris", "Kandy");
    }
}