package collections;

import java.util.ArrayList;
import java.util.Stack;

public class Intro {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);

        Stack<Integer> stack = new Stack<>();
        System.out.println(stack);
        // add : push(el)
        stack.push(5);
        stack.push(7);
        stack.push(2);
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);




    }

    public static boolean isValid(String s) {

        return false;
    }
}
