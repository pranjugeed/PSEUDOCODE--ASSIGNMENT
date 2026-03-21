import java.util.Scanner;
public class Loop {
//   public static void main(String [] args) {
//        int counter=0;...........................................while loop.....................
//        while(counter<=100){
//            System.out.println("hello word");
//            counter++;
//        }
//       int i=1;
//       while(i<=100){
//           System.out.println("hello word");
//           i++;
//       }

//       int counter=0;
//       while(counter<100){
//           System.out.println("hello word");
//           counter++;
//       int counter=0;.........................................PRINT OF NUMBER
//       while(counter<=10){
//           System.out.println(counter +"");
//           counter++;
//       }

//       int counter=1;...................................................number 1 and 2.............
//       while(counter<=10){
//           System.out.println(counter);
//           counter++;
//       }
//       Scanner sc=new Scanner(System.in);........................usre se value infinite
//       int counter=1;
//       int range=sc.nextInt();
//       while(counter<=range){
//           System.out.println(counter);
//           counter++;

//       }
//       Scanner sc=new Scanner(System.in);
//       int n=sc.nextInt();
//       int sum=0;
//       int i=1;
//       while( i<=n){
//           sum=sum+i;
//           i++;

//       }
//       System.out.println(sum);
//for(int i=1;i<10;i++){......................................................for loop
//    System.out.println("hello word");
//}
//for(int line=1;line<=4;line++){
//           System.out.println("****");
//       }
//int n=10899;
//while(n>0){
//    int lastDigit=n%10;
//    System.out.print(lastDigit);
//    n=n/10;
//}
//       int n=10899;
//       int rer=0;
//       while(n>0){
//           int lastdigit=n%10;
//           rer=(rer*10)+lastdigit;
//           n=n/10;

//       }
//       System.out.println(rer);
//int counter=0;
//do{
//    System.out.println("hello word");
//    counter++;
//}
//while(counter<10);...................................................................do while......


//Scanner sc=new Scanner(System.in);
//int n=sc.nextInt();
//int sum =0;
//int i=1;
//while(i<=n){
//    sum=sum+i;
//    i++;
//}
//       System.out.println(sum);
//       public static int factorial ( int n){.....................................factorial
//           int f = 1;
//           for (int i = 1; i <= n; i++) {
//               f = f * i;
//           }
//           return f;
//       }
//       public static void main (String[]args){
//           System.out.println(factorial(4));
//       }
//   }
//public static int  factorial(int n) {............................factorial bianomial
//    int fact=1;
//    for(int i=1;i<=n;i++){
//        fact=fact*i;
//    }
//    return fact;
//}

//public static int bianomial(int n,int r) {
//    int nfact=factorial(n);
//    int rfact=factorial(r);
//    int nrfact=factorial(n-r);
//    int result=nfact/(rfact*nrfact);
//    return result;

//}

//public static void main(String[] args) {
//    int n=5;
//    int r=2;
//    int result=bianomial(n,r);
//    System.out.println(result);

//}
//}
//public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
//    int n = sc.nextInt();
//    int sum = 0;
//for( int i=1;i<=n;i++){
//        sum = sum + i;
//}
//    System.out.println(sum);


//}
//}
//public static void main(String[] args) {
//    int n=10899;
//    int rev=0;
//    while(n>0){
//        int lastdigit=n%10;
//         rev=(rev*10)+lastdigit;
//        n=n/10;
//    }
//    System.out.println(rev);

//}

//}
//public static void binTodec(int binnum) {
//    int myNum = binnum;
//    int pow = 0;
//    int decNUm = 0;
//    while (binnum > 0) {
//        int lastdigit = binnum % 10;
//        decNUm = decNUm + (lastdigit * (int) Math.pow(2, pow));
//        pow++;
//        binnum = binnum / 10;

//    }
//    System.out.println("desimal of" + myNum + "=" + decNUm);
//}
//    public static void main(String[] args) {
//        binTodec(101);
//    }

//}
//public static int factorial(int n) {
//    int fact = 1;
//    for (int i = 1; i <= n; i++) {
//        fact = fact * i;

//    }
//    return fact;
//}
//public static void main(String[] args){
//        System.out.println(factorial(4));
//    }
//}
//public static int factorial(int n){..........................................bianomialcofficient
//int fact=1;
//for(int i=1;i<=n;i++){
//    fact=fact*i;
//}
//return fact;
//}
//public static int binomialCofficient(int n,int r){
//    int nfact=factorial(n);
//    int rfact=factorial(r);
//    int nminusrFact=factorial(n-r);
//    int result=nfact/(rfact*nminusrFact);
//    return  result;
//}
//
//    public static void main(String[] args) {
//    int n=5;
//    int r=2;
//    int ans=binomialCofficient(n,r);
//        System.out.println("binomial of(ncr)="+ans);

//    }
//}
//public static int  sum(int a,int b) {...............................same fuction diffient parameter
//    return a+b;
//}

//    public static int sum(int a, int b,int c){
//    return a+b+c;
//    }

//    public static void main(String[] args) {
//        System.out.println(sum(2,3));
//        System.out.println(sum(2,3,5));
//    }

//public static boolean isprime(int n){
//boolean isprime=true;
//for(int i=2;i<=n-1;i++){
//    if(n%i==0){
//    return false;
//  }

//}
//return true;
//}

//    public static void main(String[] args) {
//        System.out.println(isprime(5));
//    }
//}

//public static boolean isPrime(int n){
//boolean isPrime=true;
//for(int i=2;i<=n-1;i++){
//    if(n%i==0){
//        isPrime=false;
//    }

//return isPrime;
//}

//    public static void main(String[] args) {
//        System.out.println(isPrime(12));

//    }


//   public static boolean isPrime(int n){
//       if(n <= 1)
//         return false;

//       for(int i = 2; i <= n - 1; i++){
//          if(n % i == 0)
//                return false;

//      }
//      return true;
//    }
//    public static void primeRange(int n){
//        for(int i = 2; i <= n; i++){
//            if(isPrime(i))
//               System.out.println(i);

//        }
//    }

//   public static void main(String[] args){
//       primeRange(10);
//   }
//    public static void  calculatesum(){
//        int a=10;
//        int b=20;
//        int sum=a+b;
//        System.out.println("sum="+sum);;
//    }

//    public static void main(String[] args) {
//        calculatesum();
//public static void main(String[] args) {
//    int p;
//    int q;
//    int r;
//    q=13;
//    for(p=1;p<=4;p++){
//        r=q%p;
//        p=p+5;
//        q=p+r;

//    r=q/5;
//    System.out.println(q);
//    System.out.println(r);

//    }
//  }
//public static void main(String[]args ){
//    int counter=0;
//    while(counter<=10){
//        System.out.println(counter);
//        counter++;
//    public static void main(String[]args){
//        Scanner sc=new Scanner(System.in);
//        int range=sc.nextInt();
//        int counter=1;
//        while(counter<=range){
//            System.out.println(counter);
//            counter++;
//        }
//    }
    public static void main(String[]args){
        int sum=0;
        int number=1;
        while (number <= 10) {
            sum=sum+number;
            number++;

        }
        System.out.println(sum);
    }
    }










