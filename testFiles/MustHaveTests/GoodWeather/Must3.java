import java.util.Scanner;

public class Must3 {


    public static void main(String[] args) {
        boolean test;
        Scanner scanner = new Scanner(System.in);
        int answer1;
        answer1 = scanner.nextInt();
        int answer2;
        answer2 = scanner.nextInt();
        test =  answer1 > answer2 || answer2 < 0;
        if (test) {
            System.out.println("You made a mistake");
        } else {
            System.out.println(test);
        }
        test =  answer1 > answer2 && answer2 < 0;
        if (test) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
