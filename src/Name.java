import java.util.Scanner;

public class Name {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        printName(1,n);


    }

    private static void printName(int i, int n) {
        if(i>n){
            return;
        }
        System.out.println("gaurab");
        printName(i+1,n);
    }
}
