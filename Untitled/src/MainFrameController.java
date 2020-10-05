import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MainFrameController {

    protected MainFrame mainFrame;
    System system = new System();

    private JPanel panel1;
    private JTabbedPane mainMenu;
    private JTextField loginTextField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JPanel panel2;
    private JFormattedTextField authorNameTextField;
    private JTextField titleTextField;
    private JTextField authorSurnameTextField;
    private JButton addBookButton;
    private JFormattedTextField bookIdTextField;
    private JList bookList;
    private JButton removeBookButton;
    private JTabbedPane tabbedPane1;
    private JFormattedTextField readerPeselTextField;
    private JFormattedTextField readerSurnameTextField;
    private JButton addReaderButton;
    private JList readersList;
    private JButton removeReaderButton;
    private JComboBox readersComboBox;
    private JList readersBookList;
    private JButton chooseReaderButton;
    private JButton returnBookButton;
    private JComboBox booksComboBox;
    private JButton borrowBookButton;
    private JFormattedTextField readerNameTextField;
    private JFormattedTextField authorsNameTextField;
    private JFormattedTextField authorsSurnameTextField;
    private JButton addAuthorButton;
    private JComboBox authorsComboBox;
    private JComboBox authorsComboBox2;
    private JButton removeAuthorButton;
    private JPanel panelA;
    private JPanel panelB;
    private JCheckBox genre9CheckBox;
    private JCheckBox genre10CheckBox;
    private JCheckBox genre8CheckBox;
    private JCheckBox genre7CheckBox;
    private JCheckBox genre6CheckBox;
    private JCheckBox genre5CheckBox;
    private JCheckBox genre3CheckBox;
    private JCheckBox genre2CheckBox;
    private JCheckBox genre1CheckBox;
    private JCheckBox genre4CheckBox;
    private JComboBox genreComboBox;
    private JList genreList;
    private JButton saveChangesButton;
    private JComboBox categoryComboBox;


    public MainFrameController() {
        initComponents();
        initListeners();
        mainMenu.setEnabledAt(1,false);
        mainMenu.setEnabledAt(2,false);
        saveChangesButton.setEnabled(false);
        genreComboBox.setVisible(false);
        authorsComboBox.setVisible(false);
        removeAuthorButton.setVisible(false);
    }

    public void showMainFrameWindow() {
        mainFrame.setVisible(true);
    }

    public void refreshBooks(){
        int index = genreComboBox.getSelectedIndex();
        DefaultListModel dlm = new DefaultListModel();
        for(int i = 0 ; i < system.getBooks().size() ; i++){
            Book book = (Book) system.getBooks().get(i);
            if(index == 0 ){ if(book.isGenre1()) dlm.addElement(book); }
            else{
                if(index == 1 ){ if(book.isGenre2()) dlm.addElement(book); }
                else{
                    if(index == 2 ){ if(book.isGenre3()) dlm.addElement(book); }
                    else{
                        if(index == 3 ){ if(book.isGenre4()) dlm.addElement(book); }
                        else{
                            if(index == 4 ){ if(book.isGenre5()) dlm.addElement(book); }
                            else{
                                if(index == 5 ){ if(book.isGenre6()) dlm.addElement(book); }
                                else{
                                    if(index == 6 ){ if(book.isGenre7()) dlm.addElement(book); }
                                    else{
                                        if(index == 7 ){ if(book.isGenre8()) dlm.addElement(book); }
                                        else{
                                            if(index == 8 ){ if(book.isGenre9()) dlm.addElement(book); }
                                            else{
                                                if(index == 9 ){ if(book.isGenre10()) dlm.addElement(book); }
                                                else{
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            // genreList.setModel(dlm);
            bookList.setModel(dlm);
        }
    }

    private void initListeners() {
        genreComboBox.addItem("fantastyka");
        genreComboBox.addItem("kryminał");
        genreComboBox.addItem("l. młodzieżowa");
        genreComboBox.addItem("l. dziecięca");
        genreComboBox.addItem("l. historyczna");
        genreComboBox.addItem("horror");
        genreComboBox.addItem("biografia");
        genreComboBox.addItem("l. faktu");
        genreComboBox.addItem("l. przygodowa");
        genreComboBox.addItem("l. obyczajowa");

        removeBookButton.addActionListener(new removeBookButtonListener());
        removeReaderButton.addActionListener(new removeReaderButtonListener());
        addBookButton.addActionListener(new addBookButtonListener());
        addReaderButton.addActionListener(new addReaderButtonListener());
        //chooseReaderButton.addActionListener(new chooseReaderButtonListener());
        borrowBookButton.addActionListener(new borrowBookButtonListener());
        returnBookButton.addActionListener(new returnBookButtonListener());
        readersComboBox.addActionListener(new readersComboBoxListener());
        addAuthorButton.addActionListener(new addAuthorButtonListener());
        removeAuthorButton.addActionListener(new removeAuthorButtonListener());
        authorsComboBox.addActionListener(new authorsComboBoxListener());
        loginButton.addActionListener(new loginButtonListener());
        genreComboBox.addActionListener(new genreComboBoxListener());
        saveChangesButton.addActionListener(new saveChangesButtonListener());
        categoryComboBox.addActionListener(new categoryComboBoxListener());


        bookList.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                if(bookList.isSelectionEmpty()){
                    removeBookButton.setEnabled(false);
                }
                else{
                    removeBookButton.setEnabled(true);
                }
            }
        });


        readersBookList.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                if(readersBookList.isSelectionEmpty()){
                    returnBookButton.setEnabled(false);
                }
                else{
                    returnBookButton.setEnabled(true);
                }
            }
        });

        readersList.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                if(readersList.isSelectionEmpty()){
                    removeReaderButton.setEnabled(false);
                }
                else{
                    removeReaderButton.setEnabled(true);
                }
            }
        });
    }

    public class categoryComboBoxListener implements ActionListener{
        public void actionPerformed (ActionEvent e){
            if(categoryComboBox.getSelectedItem().equals("gatunek")) {genreComboBox.setVisible(true); authorsComboBox.setVisible(false);
                removeAuthorButton.setVisible(false);
            DefaultListModel d = new DefaultListModel();
            bookList.setModel(d);
            }
            else {
                if (categoryComboBox.getSelectedItem().equals("autor")) {
                    authorsComboBox.setVisible(true);
                    removeAuthorButton.setVisible(true);
                    genreComboBox.setVisible(false);
                    DefaultListModel d = new DefaultListModel();
                    bookList.setModel(d);
                }
                else
                {
                    genreComboBox.setVisible(false);
                    authorsComboBox.setVisible(false);
                    removeAuthorButton.setVisible(false);
                    DefaultListModel dlm = new DefaultListModel();
                    for(int i = 0 ; i < system.getBooks().size(); i++){
                        dlm.addElement(system.getBooks().get(i));
                    }
                    bookList.setModel(dlm);
                }
            }
        }
    }

    public class loginButtonListener implements ActionListener {
        public void actionPerformed (ActionEvent e){

            String login = loginTextField.getText();
            String password = String.valueOf(passwordField.getPassword());
            try{
                Scanner log = new Scanner(new File("data.txt"));
                boolean i = logScan(log, login, password);
                if(i == true){
                    try{
                        Scanner readers = new Scanner(new File("readers.txt"));
                        Scanner authors = new Scanner(new File("authors.txt"));
                        if(authors.hasNext()) {downloadAuthors(authors);}
                        if(readers.hasNext()) {downloadReaders(readers);}

                    }catch(IOException v){
                        v.printStackTrace();
                    }
                }
            }catch(FileNotFoundException ex){
                ex.printStackTrace();
            }

        }
        private void downloadAuthors(Scanner authors) {
            authors.useDelimiter(";");
            while(authors.hasNext()){
                String name = authors.next();
                String surname = authors.next();
                int quanity = authors.nextInt();
                Author author = new Author(name,surname);
                system.getAuthors().add(author);
                authorsComboBox2.addItem(author);
                authorsComboBox.addItem(author);

                for(int i = 0 ; i < quanity ; i++){
                    String title = authors.next();
                    boolean isBorrowed = authors.nextBoolean();
                    Book book = new Book (author,title,isBorrowed);
                    boolean a = authors.nextBoolean();
                    book.setGenre1(a);
                    a=authors.nextBoolean();
                    book.setGenre2(a);
                    a=authors.nextBoolean();
                    book.setGenre3(a);
                    a=authors.nextBoolean();
                    book.setGenre4(a);
                    a=authors.nextBoolean();
                    book.setGenre5(a);
                    a=authors.nextBoolean();
                    book.setGenre6(a);
                    a=authors.nextBoolean();
                    book.setGenre7(a);
                    a=authors.nextBoolean();
                    book.setGenre8(a);
                    a=authors.nextBoolean();
                    book.setGenre9(a);
                    a=authors.nextBoolean();
                    book.setGenre10(a);

                    system.addBook(book);
                    author.getBooks().add(book);
                    booksComboBox.addItem(book);
                }

                DefaultListModel dlm = new DefaultListModel();
                for(int i = 0 ; i < system.getBooks().size(); i++){
                    dlm.addElement(system.getBooks().get(i));
                }
                bookList.setModel(dlm);
            }
            authors.close();
        }

        private void downloadReaders(Scanner readers) {
            readers.useDelimiter(";");
            while(readers.hasNext()){
                String name = readers.next();
                String surname = readers.next();
                String pesel = readers.next();
                int size = readers.nextInt();

                Reader reader = new Reader(name,surname,pesel);
                system.addReader(reader);
                readersComboBox.addItem(reader);

                for(int j = 0 ; j < size ; j++){
                    String nameA = readers.next();
                    String surnameA = readers.next();
                    String title = readers.next();
                    boolean isBorrowed = readers.nextBoolean();

                    Author temp = new Author(nameA,surnameA);
                    for(int i=0;i<system.getBooks().size();i++){
                        Book t = system.getBooks().get(i);
                        if(t.getAutor().getName().equals(temp.getName()) && t.getAutor().getSurname().equals(temp.getSurname()) && t.getTitle().equals(title)){
                            reader.getBookList().add(system.getBooks().get(i));
                        }
                    }
                }


            }

            DefaultListModel dlm = new DefaultListModel();
            for(int i = 0 ; i < system.getReaders().size(); i++){
                dlm.addElement(system.getReaders().get(i));
            }
            readersList.setModel(dlm);

            readers.close();
        }
    }

    private boolean logScan(Scanner sc, String login, String password) {
        try{
            sc.useDelimiter(";");
            while (sc.hasNext()) {
                String loginsc = sc.next();
                String passwordsc = sc.next();
                if(loginsc.equals(login) && passwordsc.equals(password)){
                    JOptionPane.showMessageDialog(loginButton,"Zalogowano poprawnie");
                    loginTextField.setText("");
                    passwordField.setText("");
                    loginTextField.setEnabled(false);
                    passwordField.setEnabled(false);
                    loginButton.setEnabled(false);

                    sc.close();
                    mainMenu.setEnabledAt(1,true);
                    mainMenu.setEnabledAt(2,true);
                    saveChangesButton.setEnabled(true);
                    return true;
                }
            }
            JOptionPane.showMessageDialog(loginButton,"Niepoprawne dane logowania");
            sc.close();
            return false;
        }catch(NumberFormatException e){
            e.printStackTrace();
        }
        return false;
    }


    public class removeAuthorButtonListener implements ActionListener{
        public void actionPerformed (ActionEvent e){

            Author author = (Author) authorsComboBox.getSelectedItem();
            system.getAuthors().remove(author);
            authorsComboBox.removeItem(author);
            authorsComboBox2.removeItem(author);

        }
    }

    public class addAuthorButtonListener implements ActionListener{
        public void actionPerformed (ActionEvent e){
            String name = authorsNameTextField.getText();
            String surname = authorsSurnameTextField.getText();

            Author author = new Author(name, surname);
            system.getAuthors().add(author);
            authorsComboBox.addItem(author);
            authorsComboBox2.addItem(author);

            authorsNameTextField.setText("");
            authorsSurnameTextField.setText("");

        }
    }

    public class returnBookButtonListener implements ActionListener{
        public void actionPerformed (ActionEvent e){

            Reader reader = (Reader) readersComboBox.getSelectedItem();
            Book book = (Book) readersBookList.getSelectedValue();

            reader.returnBook(book);
            booksComboBox.addItem(book);
            DefaultListModel dlm = new DefaultListModel();
            for(int i = 0 ; i < reader.getBookList().size() ; i ++){
                book = reader.getBookList().get(i);
                dlm.addElement(book);
            }
            readersBookList.setModel(dlm);
        }
    }

    public class authorsComboBoxListener implements ActionListener{
        public void actionPerformed (ActionEvent e){

            Author author = (Author) authorsComboBox.getSelectedItem();
            DefaultListModel dlm = new DefaultListModel();
            for(int i = 0 ; i < author.getBooks().size() ; i ++){
                Book book = author.getBooks().get(i);
                dlm.addElement(book);
            }
            bookList.setModel(dlm);

        }
    }


    public class genreComboBoxListener implements ActionListener{
        public void actionPerformed (ActionEvent e){
            refreshBooks();
        }
    }

    public class readersComboBoxListener implements ActionListener{
        public void actionPerformed (ActionEvent e){
            int index = readersComboBox.getSelectedIndex();
            Reader reader = system.getReaders().get(index);
            DefaultListModel dlm = new DefaultListModel();
            if(reader.getBookList().size()!=0){
                for(int i = 0 ; i < reader.getBookList().size() ; i++){
                    Book book = reader.getBookList().get(i);
                    dlm.addElement(book);
                }
                readersBookList.setModel(dlm);
            }
            else{
                readersBookList.setModel(dlm);
            }
        }
    }

    public class borrowBookButtonListener implements ActionListener{
        public void actionPerformed (ActionEvent e){

           Reader reader = (Reader) readersComboBox.getSelectedItem();
           Book book = (Book) booksComboBox.getSelectedItem();

            if(book.isBorrowed()){
                JOptionPane.showMessageDialog(borrowBookButton,"Książka jest już wypożyczona");
            }else{
                reader.borrowBook(book);
                booksComboBox.removeItem(book);
                DefaultListModel dlm = new DefaultListModel();
                for(int i = 0 ; i < reader.getBookList().size() ; i ++){
                    book = reader.getBookList().get(i);
                    dlm.addElement(book);
                }
                readersBookList.setModel(dlm);
            }
        }
    }

    public class removeBookButtonListener implements ActionListener {
        public void actionPerformed (ActionEvent e) {

            //int index = bookList.getSelectedIndex();
            //Book book = system.getBooks().get(index);
            Book book = (Book) bookList.getSelectedValue();
            system.removeBook(book);
            Author author = book.getAutor();
            author.getBooks().remove(book);

            if(categoryComboBox.getSelectedItem().equals("gatunek")){
                refreshBooks();
            }
            else
            {DefaultListModel dlm = new DefaultListModel();
            for(int i = 0 ; i < system.getBooks().size(); i++){
                dlm.addElement(system.getBooks().get(i));
            }
            bookList.setModel(dlm);}
            booksComboBox.removeItem(book);

        }
    }

    public class removeReaderButtonListener implements ActionListener {
        public void actionPerformed (ActionEvent e) {

            int index = readersList.getSelectedIndex();
            Reader reader = system.getReaders().get(index);
            system.removeReader(reader);

            DefaultListModel dlm = new DefaultListModel();
            for(int i = 0 ; i < system.getReaders().size(); i++){
                dlm.addElement(system.getReaders().get(i));
            }
            readersList.setModel(dlm);
            readersComboBox.removeItem(reader);

        }
    }

    public class addBookButtonListener implements ActionListener {
        public void actionPerformed (ActionEvent e) {

            Author author = (Author) authorsComboBox2.getSelectedItem();
            String title = titleTextField.getText();

            Book book = new Book(author,title);
            system.addBook(book);
            author.getBooks().add(book);
            booksComboBox.addItem(book);

            if(genre1CheckBox.isSelected()) book.setGenre1(true);
            if(genre2CheckBox.isSelected()) book.setGenre2(true);
            if(genre3CheckBox.isSelected()) book.setGenre3(true);
            if(genre4CheckBox.isSelected()) book.setGenre4(true);
            if(genre5CheckBox.isSelected()) book.setGenre5(true);
            if(genre6CheckBox.isSelected()) book.setGenre6(true);
            if(genre7CheckBox.isSelected()) book.setGenre7(true);
            if(genre8CheckBox.isSelected()) book.setGenre8(true);
            if(genre9CheckBox.isSelected()) book.setGenre9(true);
            if(genre10CheckBox.isSelected()) book.setGenre10(true);


            if(categoryComboBox.getSelectedItem().equals("gatunek")) {
                refreshBooks();
            }
            else {
                DefaultListModel dlm = new DefaultListModel();
                for(int i = 0 ; i < system.getBooks().size(); i++){
                    dlm.addElement(system.getBooks().get(i));
                }
                bookList.setModel(dlm);
            }



            JOptionPane.showMessageDialog(addBookButton,"Dodano książkę");
            titleTextField.setText("");
            genre1CheckBox.setSelected(false);
            genre2CheckBox.setSelected(false);
            genre3CheckBox.setSelected(false);
            genre4CheckBox.setSelected(false);
            genre5CheckBox.setSelected(false);
            genre6CheckBox.setSelected(false);
            genre7CheckBox.setSelected(false);
            genre8CheckBox.setSelected(false);
            genre9CheckBox.setSelected(false);
            genre10CheckBox.setSelected(false);


        }
    }

    public class addReaderButtonListener implements ActionListener {
        public void actionPerformed (ActionEvent e) {

            String name = readerNameTextField.getText();
            String surname = readerSurnameTextField.getText();
            String pesel = readerPeselTextField.getText();

            Reader reader = new Reader(name,surname,pesel);
            system.addReader(reader);
            readersComboBox.addItem(reader);

            JOptionPane.showMessageDialog(addReaderButton,"Dodano czytelnika");

            readerNameTextField.setText("");
            readerSurnameTextField.setText("");
            readerPeselTextField.setText("");


            DefaultListModel dlm = new DefaultListModel();
            for(int i = 0 ; i < system.getReaders().size(); i++){
                dlm.addElement(system.getReaders().get(i));
            }

            readersList.setModel(dlm);

        }
    }

    public class saveChangesButtonListener implements ActionListener{
        public void actionPerformed (ActionEvent e){
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(saveChangesButton, "Czy na pewno chcesz zapisać? To spowoduje nadpisanie poprzedniego stanu", "UWAGA", dialogButton);
            if(dialogResult == 0) {
                JOptionPane.showMessageDialog(saveChangesButton,"Zmiany zostały zapisane");
                try{
                    FileWriter readers = new FileWriter("readers.txt");
                    saveReaders(readers);
                    FileWriter authors = new FileWriter("authors.txt");
                    saveAuthors(authors);

                    readers.close();
                    authors.close();
                }catch(IOException v){
                    v.printStackTrace();
                }
            } else {
                JOptionPane.showMessageDialog(saveChangesButton,"Zmiany nie zostały zapisane");
            }


            
        }

        private void saveAuthors(FileWriter authors) {
            for (int i = 0; i < system.getAuthors().size(); i++)
            {
                try{
                    authors.write(system.getAuthors().get(i).toString2());
                }catch(IOException e){
                    e.printStackTrace();
                }
            }
        }

        private void saveReaders(FileWriter readers) {
            for(int i = 0 ; i <system.getReaders().size();i++)
            {
                try{
                    readers.write(system.getReaders().get(i).toString2());
                }catch(IOException e){
                    e.printStackTrace();
                }
            }
        }
    }



    private void initComponents() {

        mainFrame = new MainFrame();

        panel1 = mainFrame.getPanel1();
        mainMenu = mainFrame.getMainMenu();
        loginTextField = mainFrame.getLoginTextField();
        passwordField = mainFrame.getPasswordField();
        loginButton = mainFrame.getLoginButton();
        panel2 = mainFrame.getPanel2();
        authorNameTextField = mainFrame.getAuthorNameTextField();
        titleTextField = mainFrame.getTitleTextField();
        authorSurnameTextField = mainFrame.getAuthorSurnameTextField();
        addBookButton = mainFrame.getAddBookButton();
        bookList = mainFrame.getBookList();
        removeBookButton = mainFrame.getRemoveBookButton();
        tabbedPane1 = mainFrame.getTabbedPane1();
        readerPeselTextField = mainFrame.getReaderPeselTextField();
        readerSurnameTextField = mainFrame.getReaderSurnameTextField();
        addReaderButton = mainFrame.getAddReaderButton();
        readersList = mainFrame.getReadersList();
        removeReaderButton = mainFrame.getRemoveReaderButton();
        readersComboBox = mainFrame.getReadersComboBox();
        readersBookList = mainFrame.getReadersBookList();
        chooseReaderButton = mainFrame.getChooseReaderButton();
        returnBookButton = mainFrame.getReturnBookButton();
        booksComboBox = mainFrame.getBooksComboBox();
        borrowBookButton = mainFrame.getBorrowBookButton();
        readerNameTextField = mainFrame.getReaderNameTextField();
        authorsNameTextField = mainFrame.getAuthorsNameTextField();
        authorsSurnameTextField = mainFrame.getAuthorsSurnameTextField();
        addAuthorButton = mainFrame.getAddAuthorButton();
        authorsComboBox = mainFrame.getAuthorsComboBox();
        authorsComboBox2 = mainFrame.getAuthorsComboBox2();
        removeAuthorButton = mainFrame.getRemoveAuthorButton();
        panelA = mainFrame.getPanelA();
        panelB = mainFrame.getPanelB();
        genre9CheckBox = mainFrame.getGenre9CheckBox();
        genre10CheckBox = mainFrame.getGenre10CheckBox();
        genre8CheckBox = mainFrame.getGenre8CheckBox();
        genre7CheckBox = mainFrame.getGenre7CheckBox();
        genre6CheckBox = mainFrame.getGenre6CheckBox();
        genre5CheckBox = mainFrame.getGenre5CheckBox();
        genre3CheckBox = mainFrame.getGenre3CheckBox();
        genre2CheckBox = mainFrame.getGenre2CheckBox();
        genre1CheckBox = mainFrame.getGenre1CheckBox();
        genre4CheckBox = mainFrame.getGenre4CheckBox();
        genreComboBox = mainFrame.getGenreComboBox();
        genreList = mainFrame.getGenreList();
        saveChangesButton = mainFrame.getSaveChangesButton();
        categoryComboBox = mainFrame.getCategoryComboBox();

    }

}
