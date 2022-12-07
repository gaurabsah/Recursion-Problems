import java.util.Scanner;

public class ReverseLinearNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        printName(n,n);


    }

    private static void printName(int i, int n) {
        if(i<1){
            return;
        }
        System.out.println(i);
        printName(i-1,n);
    }
}
