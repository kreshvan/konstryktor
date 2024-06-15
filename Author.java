public class Author {
    private String firstName;
    private String lastName;
    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        Author author1 = new Author("Ivan", "ivanov");
    }
    public String getFirstName() {
        return this.firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
}







