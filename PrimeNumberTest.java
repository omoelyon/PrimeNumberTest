import java.util.Scanner;
public class PrimeNumberTest{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter  a number : ");
        int testNumber = input.nextInt();

        for (int i =2; i < testNumber ; i++ );
        if ( testNumber % i == 0) {
            System.out.printLn( i);
        }
         else {
        System.out.printLn(i);
}
}