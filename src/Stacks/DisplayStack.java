package Stacks;

import java.util.Stack;

public class DisplayStack {
    public static void displayReverseRec(Stack<Integer> st) {
        if(st.size()==0){
            int top = st.pop();
            System.out.println(top+"" );
            displayReverseRec(st);//baar baar function call hoga recursion
            st.push(top);

        }
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st);
        displayReverseRec(st);
        System.out.println(st);
        //System.out.println(st);
        //Stack<Integer> rt = new Stack<>();
        //while(st.size()>0){
          //  int x = st.pop();
            //rt.push(x);
       // }
        //while(rt.size()>0){
           // int x = rt.pop();
            //System.out.print(x+"");
            //st.push(x);
       // }
        //System.out.println(st);
       //int n = st.size();
       //int[] arr = new int[n];
       //for(int i = n-1;i>=0;i++){
         //  arr[i] = st.pop();
       //}
       //for(int i =0;i<n;i++){
         //  System.out.println(arr[i]+"");
           //st.push(arr[i]);
      // }


    }
}

