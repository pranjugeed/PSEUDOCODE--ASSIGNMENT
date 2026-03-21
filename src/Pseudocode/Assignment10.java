package Pseudocode;
/*write a reverse number
Start
        n = 1234
rev = 0
While n > 0
digit = n mod 10
rev = rev * 10 + digit
        n = n / 10
End while
Print rev
End*/

public class Assignment10 {
        public static void main(String[] args) {
            int n = 1234;
            int rev = 0;
            int digit;

            while (n > 0) {
                digit = n % 10;
                rev = rev * 10 + digit;
                n = n / 10;
            }

            System.out.println("Reverse Number = " + rev);
        }
    }

