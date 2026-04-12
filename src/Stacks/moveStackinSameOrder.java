package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class moveStackinSameOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//input
        Stack<Integer> st = new Stack<>();
        // int n;
        //System.out.println("Enter the number elements you want to enter ");
        //n = sc.nextInt();
        //   System.out.println("Enter the elements: ");
        //for(int i = 1;i<=n;i++){
        // int x = sc.nextInt();
        //st.push(x);
        //}
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        System.out.println(st);
        Stack<Integer> rt = new Stack<>();
        while (st.size() > 0) {
            int x = st.peek();
            rt.push(x);
            st.pop();

        }
        Stack<Integer> gt = new Stack<>();
        while (rt.size() > 0) {
            int y = rt.peek();
            gt.push(y);
            rt.pop();
        }
        System.out.println(gt);
    }
}









