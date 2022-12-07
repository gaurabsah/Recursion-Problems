import java.util.Scanner;

public class ReverseNumberBackTracking {
    private static void printName(int i, int n) {
        if(i>n){
            return;
        }

        printName(i+1,n);
        System.out.println(i);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        printName(1,n);
    }
}
