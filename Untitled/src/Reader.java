import java.util.ArrayList;
import java.util.List;

public class Reader extends Person {

    private String pesel;
    private List<Book> bookList = new ArrayList<>();

    public Reader(String name, String surname, String pesel) {
        super(name, surname);
        this.pesel = pesel;
    }

    public String getPesel() {
        return pesel;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }
    public int howManyBooks(){
        return bookList.size();
    }

    public void borrowBook(Book book){
        bookList.add(book);
        book.setBorrowed(true);
    }

    public void returnBook(Book book){
        try{
            bookList.remove(book);
            book.setBorrowed(false);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return getName()+" "+getSurname()+" | "+pesel+" | "+bookList.size();
    }

    public String toString2() {
        String word=getName()+";"+getSurname()+";"+pesel+";"+bookList.size()+";";
        for(int i=0;i<bookList.size();i++){
            word+=bookList.get(i).toString2();
        }
        return word;
    }
}
