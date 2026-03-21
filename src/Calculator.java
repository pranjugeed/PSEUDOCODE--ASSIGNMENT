import java.util.Scanner;
//public class Calculator {

//    Scanner sc=new Scanner(System.in);
//    System.out.println("enter a:");
//    int a=sc.nextInt();
//    System.out.println("enter b:");
//    int b=sc.nextInt();
//    System.out.println("enter operator:");
//    char operator=sc.next().charAt(0);
//    switch(operator){
//        case '+':
//            System.out.println(a+b);
//            break;
//        case '-':
//            System.out.println(a-b);
//            break;
//        case'*':
//            System.out.println(a*b);
//            break;
//        case '/':
//            System.out.println(a/b);
//            break;
//        case '%':
//            System.out.println(a%b);
//            break;
//            default:
//                System.out.println("wrong operator");

//
//        int counter = 1;
//        while (counter <= 10) {
//            System.out.println(counter);
//            counter++;
//        }
//        Scanner sc=new Scanner(System.in);
//        int range=sc.nextInt();
//        int counter=1;
//        while(counter<=range){
//            System.out.println(counter);
//            counter++;
//        }


//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int sum=0;
//        int i=1;
//        while(i<=n){
//            sum=sum+i;
//            i++;
//        }
//        System.out.println(sum);
//        int n=10899;
//        int rev=0;
//        while(n>0){
//            int lastdigit=n%10;
//            rev=(rev*10)+lastdigit;
//            n=n/10;

//        }
//        System.out.println(rev);


//    public static int calculateSum(int a, int b) {
//        int sum = a + b;
//        System.out.println(sum);
//        return sum;

//    }

//    public static void main(String[] args) {
//        int a = 16;
//        int b = 34;
//        int sum=calculateSum(a,b);
//public static void swp(int a,int b) {
//    int tem=a;
//    a=b;
//    b=tem;
//    System.out.println(a);
//    System.out.println(b);


//}

//    public static void main(String[] args) {
//        int a=10;
//        int b=20;
//        swp(a,b);
//    }


//    }
//public static int multiple(int a,int b) {
//    int product=a*b;
//    return product;

//}

//    public static void main(String[] args) {
//        int a=10;
//        int b=20;
//        int product=multiple(a,b);
//        System.out.println(product);
//        product=multiple(12,12);
//        System.out.println(product);
//public static int factorial(int n) {
//    int fact=1;
//    for(int i=1;i<=n;i++){
//        fact=fact*i;
//        i++;

//}
//    return fact;
//    }

//    public static void main(String[] args) {
//        System.out.println(factorial(5));
//    public static int factorial(int n){
//        int fact=1;
//        for(int i=1;i<=n;i++){
//            fact=fact*i;

//        }
//        return fact;

//    }
//    public static int bianomialCofficient(int n,int r){
//        int nfact=factorial(n);
//        int rfact=factorial(r);
//        int min=factorial(n-r);
//        int result=nfact/(rfact*min);
//        return result;

//    }

//    public static void main(String[] args) {
//        int n=5;
//        int r=2;
//        int ans=bianomialCofficient(n,r);
//        System.out.println(ans);


//    public static void binToDec(int binNum){
//        int myNum = binNum;
//        int pow = 0;
//        int dec = 0;

//        while(binNum > 0){
//            int lastDigit = binNum % 10;   // ✔ binary ka last digit
//            dec = dec + (lastDigit * (int)Math.pow(2, pow));   // ✔ correct logic
//            pow++;
//            binNum = binNum / 10;          // ✔ next digit
//        }

//        System.out.println(dec);
//    }

//    public static void main(String[] args) {
//        binToDec(101);
//    }

//    public static void decToBin(int decNum) {
//        int myNum = decNum;
//        int bin = 0;
//        int pow = 0;

//        while (decNum > 0) {
//            int remainder = decNum % 2;
//            bin = bin + remainder * (int) Math.pow(10, pow);
//            pow++;
//            decNum = decNum / 2;
//        }

//        System.out.println("Binary of " + myNum + " = " + bin);
//    }

//    public static void main(String[] args) {
//        decToBin(13);
//    }
//}
//    public static int factorial(int n){
//        int f=1;
//        for(int i=1;i<=n;i++){
//            f=f*1;
//        }
//        return f;
//    }
//}
//public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in) ;
//    System.out.println("enter a:");
//        int a = sc.nextInt();
//    System.out.println("enter b:");
//        int b = sc.nextInt();
//    System.out.println("enter operator:");
//        int operator = sc.next().charAt(0);
//switch(operator)

//        {
//            case '+':
//                System.out.println(a + b);
//        }
//    System.out.println(factorial(4));
//}












