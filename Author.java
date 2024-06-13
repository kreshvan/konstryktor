public class Author  {
    private String firstName;//privatee
    private String lastName;
    public Author (String firstName,String lastName) {//метод
        this.firstName = firstName;
        this.lastName = lastName;
        Author author = new Author("Ivan", "ivanov");//метод Author переменная author = равна новому вварианту метода
        // где происходит смена переменных firstName и lastName на ту котолрая будет использоваться в программе ()
    }
        public  String getFirstName (){
    return this.firstName;
        }
    public  String getLastName() {
        return this.lastName;
    }
    }







