package Stacks;

import java.util.Stack;

public class basisofstack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        System.out.println(st.isEmpty());
        st.push(1);
        st.push(4);
        st.push(6);
        System.out.println(st.peek());
        System.out.println(st);
        //st.pop();
        System.out.println(st);
        System.out.println("size is :"+st.size());
        while(st.size()>2){
            st.pop();

        }
        System.out.println(st.peek());
        System.out.println(st);
        System.out.println(st.isEmpty());
    }
}
