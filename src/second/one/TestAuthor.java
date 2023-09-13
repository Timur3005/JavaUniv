package second.one;

import second.one.Author;

public class TestAuthor {

    public static void main(String[] args){
        Author author = new Author("Ramil Nig", null, 'm');
        author.setEmail("ramil@mail.ru");
        System.out.println(author);
    }
}
