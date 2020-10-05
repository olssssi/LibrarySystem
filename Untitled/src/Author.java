import java.util.ArrayList;
import java.util.List;

public class Author extends Person {

    private List<Book> books = new ArrayList<>();

    public Author(String name, String surname) {
        super(name, surname);
    }

    public List<Book> getBooks() {
        return books;
    }

    @Override
    public String toString() {
        return getName()+" "+getSurname();
    }

    public String toString2() {
        String word = getName()+";"+getSurname()+";"+books.size()+";";
        for(int i = 0;i<books.size();i++)
        {
            word = word + books.get(i).toString3();
        }
        return word;
    }
}
