package Opgave01;

import java.util.Scanner;

public class indlaesning extends Thread {

    private MyString myString;

    public indlaesning(MyString myString) {
        this.myString = myString;
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String tekst = scanner.nextLine();

            myString.setString(tekst);
        }
    }
}
