import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class System {

    private List<Reader> readers = new ArrayList<>();
    private List<Book> books = new ArrayList<>();
    private List<Author> authors = new ArrayList<>();
    private List<Librarian> librarians = new ArrayList<>();

    public List<Reader> getReaders() {
        return readers;
    }

    public void setReaders(List<Reader> readers) {
        this.readers = readers;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    public List<Librarian> getLibrarians() {
        return librarians;
    }

    public void setLibrarians(List<Librarian> librarians) {
        this.librarians = librarians;
    }

    public void addBook(Book book){
        books.add(book);
    }

    public void removeBook(Book book){
        try{
            books.remove(book);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void addReader (Reader reader){
        readers.add(reader);
    }

    public void removeReader (Reader reader){
        try{
            readers.remove(reader);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
