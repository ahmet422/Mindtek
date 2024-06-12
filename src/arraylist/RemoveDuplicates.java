package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates {

    public static void main(String[] args) {

        Integer[] nums={2,6,4,10,10,10,10,2,3,10};
        // {2,6,4,10,2,3,10}; -> {2,6,4,10,3}

        // Array to List
        List<Integer> list=new ArrayList<>(List.of(nums));

        // {2,6,4,10,2,3,10};
        for(int i=0; i<list.size(); i++){
            for(int j=i+1; j<list.size(); j++){
                if(list.get(i)==list.get(j)){
                    list.remove(j);
                    j--;
                }
            }
        }

        // Convert List back to Array
        nums=list.toArray(new Integer[0]);

        System.out.println(Arrays.toString(nums));

    }

}
