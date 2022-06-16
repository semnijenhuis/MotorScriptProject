import java.util.Scanner;

public class Must4 {

    public static void main(String[] args) {
        int guess;
        guess = 4;
        Scanner scanner = new Scanner(System.in);
        int answer1;
        String feedback = "Wrong answer\n";
        answer1 = scanner.nextInt();
        while(answer1 != guess) {
            System.out.println(feedback);
            answer1 = scanner.nextInt();
        }
        System.out.println("Correct");
    }
}
