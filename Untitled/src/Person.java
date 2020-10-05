public class Person {
    private String name;
    private String surname;
    private int code;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
        code = hashCode();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getCode() {
        return code;
    }
}