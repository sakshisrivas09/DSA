package Stacks;

import java.util.Scanner;

public class FiboSeries {
    public int nthfib(int n){
        if(n==0||n==1){
            System.out.println(n);

        }
      return nthfib(n-1) + nthfib(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n);
    }
}
