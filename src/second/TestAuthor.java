package second;

public class TestAuthor {

    public static void main(String[] args){
        Author author = new Author("Ramil Nig", null, 'm');
        author.setEmail("ramil@mail.ru");
        System.out.println("email "+author.getEmail());
        System.out.println("name "+author.getName());
        System.out.println("gender "+author.getGender());
    }
}
