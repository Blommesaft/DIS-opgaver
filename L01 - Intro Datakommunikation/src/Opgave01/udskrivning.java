package Opgave01;

public class udskrivning extends Thread{

    private MyString myString;

    public udskrivning(MyString myString) {
        this.myString = myString;
    }

    public void run() {
        while (true) {
            try {
                this.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(myString);

        }
    }
}
