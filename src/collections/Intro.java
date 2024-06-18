package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Intro {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);

        Stack<Integer> stack = new Stack<>();
    //    System.out.println(stack);
        // add : push(el)
        stack.push(5);
        stack.push(7);
        stack.push(2);
//        System.out.println(stack);
//        System.out.println(stack.pop());
//        System.out.println(stack);

        Stack<String> words = new Stack<>();
        System.out.println(words);
        if(!words.isEmpty()) words.peek();


        List<Integer> list1 = new ArrayList<>();
        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(4);
        list1.add(5);
        list1.add(1,8);
        for (int el : list1) list2.add(el);
        System.out.println(list2);


    }

    public static boolean isValid(String s) {
        // if opening then put into the stack
        // else get the el from stack and check types:
                // if types match then continue
                // else return false
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char par = s.charAt(i);
            if(par=='(' || par=='[' || par=='{') stack.push(par);
            else{
                if(stack.isEmpty()) return false;
                char el = stack.pop();
                if(par == ')' && el != '(' || par == ']' && el != '[' || par == '}' && el != '{' ) return false;
            }
        }
        return stack.isEmpty();
    }
}
