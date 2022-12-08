import java.util.Scanner;

public class FunctionalRecursion {
    public static int sumN(int n){
        if(n<0){
            return 0;
        }
        return n+sumN(n-1);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();

        System.out.println(sumN(n));
    }
}
