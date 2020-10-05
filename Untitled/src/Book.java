public class Book {
    private Author author;
    private String title;
    private String id;
    private boolean borrowed;
    private boolean isGenre1;
    private boolean isGenre2;
    private boolean isGenre3;
    private boolean isGenre4;
    private boolean isGenre5;
    private boolean isGenre6;
    private boolean isGenre7;
    private boolean isGenre8;
    private boolean isGenre9;
    private boolean isGenre10;


    public Book(Author author, String title) {
        this.author = author;
        this.title = title;
        borrowed = false;
    }

    public Book(Author author, String title, boolean borrowed){
        this.author = author;
        this.title = title;
        this.borrowed = borrowed;
    }

    public boolean isGenre1() {
        return isGenre1;
    }

    public boolean isGenre2() {
        return isGenre2;
    }

    public boolean isGenre3() {
        return isGenre3;
    }

    public boolean isGenre4() {
        return isGenre4;
    }

    public boolean isGenre5() {
        return isGenre5;
    }

    public void setGenre1(boolean genre1) {
        isGenre1 = genre1;
    }

    public void setGenre2(boolean genre2) {
        isGenre2 = genre2;
    }

    public void setGenre3(boolean genre3) {
        isGenre3 = genre3;
    }

    public void setGenre4(boolean genre4) {
        isGenre4 = genre4;
    }

    public void setGenre5(boolean genre5) {
        isGenre5 = genre5;
    }

    public boolean isGenre6() {
        return isGenre6;
    }

    public void setGenre6(boolean genre6) {
        isGenre6 = genre6;
    }

    public boolean isGenre7() {
        return isGenre7;
    }

    public void setGenre7(boolean genre7) {
        isGenre7 = genre7;
    }

    public boolean isGenre8() {
        return isGenre8;
    }

    public void setGenre8(boolean genre8) {
        isGenre8 = genre8;
    }

    public boolean isGenre9() {
        return isGenre9;
    }

    public void setGenre9(boolean genre9) {
        isGenre9 = genre9;
    }

    public boolean isGenre10() {
        return isGenre10;
    }

    public void setGenre10(boolean genre10) {
        isGenre10 = genre10;
    }

    public Author getAutor() {
        return author;
    }

    public void setAutor(Author autor) {
        this.author = autor;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String toString2() {
        if(isBorrowed())
            return author.getName()+";"+author.getSurname()+";"+title+";"+"true"+";";
        else
            return author.getName()+";"+author.getSurname()+";"+title+";"+"false"+";";
    }

    public String toString3() {
        String word="";
        if(isBorrowed())
            word = word + title+";"+"true";
        else
            word = word + title+";"+"false";
        if (isGenre1==true) word = word+";"+"true";
        else word = word+";"+"false";
        if (isGenre2==true) word = word+";"+"true";
        else word = word+";"+"false";
        if (isGenre3==true) word = word+";"+"true";
        else word = word+";"+"false";
        if (isGenre4==true) word = word+";"+"true";
        else word = word+";"+"false";
        if (isGenre5==true) word = word+";"+"true";
        else word = word+";"+"false";
        if (isGenre6==true) word = word+";"+"true";
        else word = word+";"+"false";
        if (isGenre7==true) word = word+";"+"true";
        else word = word+";"+"false";
        if (isGenre8==true) word = word+";"+"true";
        else word = word+";"+"false";
        if (isGenre9==true) word = word+";"+"true";
        else word = word+";"+"false";
        if (isGenre10==true) word = word+";"+"true";
        else word = word+";"+"false";

        return word+";";
    }


    @Override
    public String toString() {
        if(isBorrowed())
        return author.getName()+" "+author.getSurname()+" | "+title+" | wypożyczona |"+writeGenres();
        else
            return author.getName()+" "+author.getSurname()+" | "+title+" | dostępna |"+writeGenres();
    }

    private String writeGenres() {
        String word = "";
        if(isGenre1()) word+=" fantastyka";

            if(isGenre2()) word+=" kryminał";
            if(isGenre3()) word+=" l. młodzieżowa";
            if(isGenre4()) word+=" l. dziecięca";
            if(isGenre5()) word+=" l. historyczna";
            if(isGenre6()) word+=" horror";
            if(isGenre7()) word+=" biografia";
            if(isGenre8()) word+=" l.faktu";
            if(isGenre9()) word+=" l.przygodowa";
            if(isGenre10())  word+=" l.obyczajowa";
            return word;
    }

    public boolean isBorrowed() {
        return borrowed;
    }

    public void setBorrowed(boolean borrowed) {
        this.borrowed = borrowed;
    }
}
