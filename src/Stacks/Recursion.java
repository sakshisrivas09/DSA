package Stacks;

import java.util.Scanner;

public class Recursion {
    public static void printIncreasing(int n ){
        if(n==1){
            System.out.println(1);
            return;
        }

        printIncreasing(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n);
        printIncreasing(n);


    }
}
