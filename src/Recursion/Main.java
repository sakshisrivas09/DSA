package Recursion;

public class Main {
    static void printMyName(int n){
        if(n==0) {
            return;
        }
        System.out.println("Sakshi Srivastava");
        printMyName(n-1);



    }

    public static void main(String[] args) {
        printMyName(10);
    }
}
