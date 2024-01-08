import java.util.Scanner;

class PrimeorNot {
    public static void main(String[] args) {
        int number,count=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number to check if it is truly prime number or not: ");
        number= sc.nextInt();
        if(number>1){
            for(int i = 1;i<=number;i++){
                if(number % i==0){      //number divisible by 1 and itself is prime number
                    count++;        //so count value is 2 become prime or else not prime number
                }
            }
        }else{
            System.out.println("Not a prime number");
        }
        if (count==2){
            System.out.println(number +" Is a prime number");
        }else{
            System.out.println("not a prime number");
        }
    }
    


}