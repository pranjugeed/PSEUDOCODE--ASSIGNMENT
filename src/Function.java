public class Function {
//    public static void hellowordPrint(){
//        System.out.println("hello word");
//    }
//    public static void main(String[]args){.......................................method1
//        hellowordPrint();
//    public static void print(){
//        System.out.println("hello word");
//        System.out.println("hello word");


//    }

//    public static void main(String[] args) {
//        print();

//    public static void sum(int a,int b) {..............................................method2
//        int sum=a+b;
//        System.out.println(sum);


//    }

//    public static void main(String[] args) {
//        int a=10;
//        int b=20;
//        sum(a,b);


//    }
//public static int pritSum( int a,int b) {,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,3
//    int sum=a+b;
//    return sum;
//
//
//}

//    public static void main(String[] args) {
//    int a =5;
//    int b=10;
//    int sum=pritSum(a,b);
//        System.out.println(sum);
//
//public static int multiple(int a,int b) {...........................................PRODUCT
//    int product=a*b;
//    return product;


//    public static void main(String[] args) {
//    int a=20;
//    int b=20;
//    int product=multiple(a,b);
//        System.out.println(product);

//    public static void main(String[] args) {..................................swap 2 number
//        int a=10;
//        int b=20;
//        int tem=a;
//        a=b;
//        b=tem;
//        System.out.println(a);
//        System.out.println(b);


    public static void main(String[] args) {
     int n = 10899;
     int rev=0;
       while (n > 0) {
         int lastdigit = n % 10;
         rev=(rev*10)+lastdigit;
         n=n/10;
        }
        System.out.println(rev);
       


  }
}







