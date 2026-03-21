package Pseudocode;
/*sum of 1 to 10
start
set sum=0;
set number=1;
while number<=10
sum=sum+number
number=number+1
        print sum
                end*/

 class Assigement1 {
    public static void main(String[]args){
        int sum=0;
        int number=1;
        while(number<=10){
            sum=sum+number;
            number++;
        }
        System.out.println(sum);
    }
}
