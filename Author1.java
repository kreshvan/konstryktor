public class Author1 {
    private String firstName;
    private String lastName;
    public Author1(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getFirstName() {
        return this.firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    // public static void main(String[] arg) {
    //Author1 author1 = new Author1("Ivan", "ivanov");
    // }
    public String toString() {
        return this.firstName + " " + this.lastName;
    }
    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || other.getClass() != getClass())
            return false;
        Author1 otherAuthor1 = (Author1) other;
        return firstName.equals(otherAuthor1.firstName) && lastName.equals(otherAuthor1.lastName);
    }
    @Override
    public int hashCode() {
        return java.util.Objects.hash(firstName,lastName);
    }
}










