package Loops;

import java.util.Scanner;

public class AP1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 99; i<=103-4*n; i-=4){
            System.out.println(i);
        }
    }
}
