import java.util.Scanner;

public class NunberBackTracking {
    private static void printName(int i, int n) {
        if(i<1){
            return;
        }
        printName(i-1,n);
        System.out.println(i);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        printName(n,n);
    }


}
