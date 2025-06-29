import java.awt.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        for (int i =1;i<=50;i++) {
            if (i %15 == 0) {
                System.out.println(i+" fizzbuzz");
            }

            else if (i%3 == 0) {
                System.out.println(i+" fizz");
            }

            else if (i%5 == 0) {
                System.out.println(i+" buzz");
            }

            else {
                System.out.println(i);
            }
        }

    }
}