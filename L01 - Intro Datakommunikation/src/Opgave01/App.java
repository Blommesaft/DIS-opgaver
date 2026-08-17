package Opgave01;

public class App {

    public static void main(String[] args) {
        MyString ms = new MyString();

        indlaesning il = new indlaesning(ms);
        udskrivning us = new udskrivning(ms);

        il.start();
        us.start();
    }
}
