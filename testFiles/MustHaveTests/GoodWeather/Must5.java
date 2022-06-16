public class Must5 {


    public static int power(int a, int b) {
        int result = 1;
        while(b > 0) {
            result = result * a;
            b = b - 1;
        }
        return result;
    }


    public static void main(String[] args) {
        int data = power(2,8);
        if (data == 256) {
            System.out.println("Correct");
        } else {
            System.out.println("Incorrect");
        }
    }
}
