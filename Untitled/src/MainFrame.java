import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame{

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
    private JTabbedPane tabbedPane2;
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

    public static final int WIDTH = 900;
    public static final int HEIGHT = 600;

    public MainFrame() {
        add(panel1);
        setLocationRelativeTo(null);
        Dimension DimMax = Toolkit.getDefaultToolkit().getScreenSize();
        setMaximumSize(DimMax);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        //setSize(MAXIMIZED_BOTH);
    }

    public JPanel getPanel1() {
        return panel1;
    }

    public JTabbedPane getMainMenu() {
        return mainMenu;
    }

    public JTextField getLoginTextField() {
        return loginTextField;
    }

    public JPasswordField getPasswordField() {
        return passwordField;
    }

    public JButton getLoginButton() {
        return loginButton;
    }

    public JPanel getPanel2() {
        return panel2;
    }

    public JFormattedTextField getAuthorNameTextField() {
        return authorNameTextField;
    }

    public JTextField getTitleTextField() {
        return titleTextField;
    }

    public JTextField getAuthorSurnameTextField() {
        return authorSurnameTextField;
    }

    public JButton getAddBookButton() {
        return addBookButton;
    }


    public JList getBookList() {
        return bookList;
    }

    public JButton getRemoveBookButton() {
        return removeBookButton;
    }

    public JTabbedPane getTabbedPane1() {
        return tabbedPane1;
    }

    public JFormattedTextField getReaderPeselTextField() {
        return readerPeselTextField;
    }

    public JFormattedTextField getReaderSurnameTextField() {
        return readerSurnameTextField;
    }

    public JButton getAddReaderButton() {
        return addReaderButton;
    }

    public JList getReadersList() {
        return readersList;
    }

    public JButton getRemoveReaderButton() {
        return removeReaderButton;
    }

    public JComboBox getReadersComboBox() {
        return readersComboBox;
    }

    public JList getReadersBookList() {
        return readersBookList;
    }

    public JButton getChooseReaderButton() {
        return chooseReaderButton;
    }

    public JButton getReturnBookButton() {
        return returnBookButton;
    }

    public JComboBox getBooksComboBox() {
        return booksComboBox;
    }

    public JButton getBorrowBookButton() {
        return borrowBookButton;
    }

    public JFormattedTextField getReaderNameTextField() {
        return readerNameTextField;
    }

    public JFormattedTextField getAuthorsNameTextField() {
        return authorsNameTextField;
    }

    public JFormattedTextField getAuthorsSurnameTextField() {
        return authorsSurnameTextField;
    }

    public JButton getAddAuthorButton() {
        return addAuthorButton;
    }

    public JComboBox getAuthorsComboBox() {
        return authorsComboBox;
    }

    public JComboBox getAuthorsComboBox2() {
        return authorsComboBox2;
    }

    public JButton getRemoveAuthorButton() {
        return removeAuthorButton;
    }

    public JPanel getPanelA() {
        return panelA;
    }

    public JPanel getPanelB() {
        return panelB;
    }

    public JCheckBox getGenre9CheckBox() {
        return genre9CheckBox;
    }

    public JCheckBox getGenre10CheckBox() {
        return genre10CheckBox;
    }

    public JCheckBox getGenre8CheckBox() {
        return genre8CheckBox;
    }

    public JCheckBox getGenre7CheckBox() {
        return genre7CheckBox;
    }

    public JCheckBox getGenre6CheckBox() {
        return genre6CheckBox;
    }

    public JCheckBox getGenre5CheckBox() {
        return genre5CheckBox;
    }

    public JCheckBox getGenre3CheckBox() {
        return genre3CheckBox;
    }

    public JCheckBox getGenre2CheckBox() {
        return genre2CheckBox;
    }

    public JCheckBox getGenre1CheckBox() {
        return genre1CheckBox;
    }

    public JCheckBox getGenre4CheckBox() {
        return genre4CheckBox;
    }

    public JComboBox getGenreComboBox() {
        return genreComboBox;
    }

    public JList getGenreList() {
        return genreList;
    }

    public JButton getSaveChangesButton() {
        return saveChangesButton;
    }

    public JComboBox getCategoryComboBox() {
        return categoryComboBox;
    }
}
