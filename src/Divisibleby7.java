import java.util.Scanner;
public class Divisibleby7 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Number enter : ");
            int num = sc.nextInt();

            int result = num;

            while (Math.abs(result) > 9) {
                int lastDigit = result % 10;
                int remaining = result / 10;

                result = remaining - (2 * lastDigit);
            }

            if (result % 7 == 0) {
                System.out.println("Number divisible by 7 ");
            } else {
                System.out.println("Number divisible by not 7 hai");
            }
        }
    }

