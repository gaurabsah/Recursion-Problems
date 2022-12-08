import java.util.Scanner;

public class ParameterisedRecursion {
    public static void sumN(int i,int sum){
        if(i<1){
            System.out.println(sum);
            return;
        }
        sumN(i-1,sum+i);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();

        sumN(n,0);
    }
}
