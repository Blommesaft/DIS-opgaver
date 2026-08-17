package Opgave01;

public class MyString {

    private String string = "a";

    public synchronized String getString() {
        return string;
    }

    public synchronized void setString(String string) {
        this.string = string;
    }

    @Override
    public String toString() {
        return string;
    }
}
