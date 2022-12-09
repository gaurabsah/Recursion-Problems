import java.util.Scanner;

public class Fibonnaci {
    public static int multipleRecursion(int n){
        if(n<=1){
            return n;
        }
        int last = multipleRecursion(n-1);
        int secondLast = multipleRecursion(n-2);
        return last + secondLast;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the position: ");
        int n = scn.nextInt();
//        System.out.println("Enter the first number: ");
//        int first = scn.nextInt();
//        System.out.println("Enter the second number: ");
//        int second = scn.nextInt();
//
//        for(int i=1;i<=n;i++){
//            int third = first + second;
//            first = second;
//            second = third;
//            System.out.println(third);
//        }

        System.out.println("The element at "+n+"th index is: "+multipleRecursion(n));
    }
}
