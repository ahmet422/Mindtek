package leetcode;

import java.util.HashMap;

public class Fib {

    public int fibA(int n) {
        if(n==0) return 0;
        if(n==1) return 1;

        int n1= 0, n2=1, n3 = 0;
        for(int i = 2; i <= n; i++){
            n3 = n1+n2;
            n1 = n2;
            n2 = n3;
        }
        return n3;
    }

    public int fib(int n) {
        if(n<=1) return n;
        return fib(n-1) + fib(n-2);
    }

    public int fib3(int n) {
        return fib4(n, new HashMap<>());
    }

    public int fib4(int n, HashMap<Integer,Integer> map){
        if(n<=1) return n;
        if(map.containsKey(n)) return map.get(n);
        int res = fib(n-1) + fib(n-2);
        map.put(n,res);
        return res;
    }
}
