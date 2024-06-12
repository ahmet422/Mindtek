package arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PracticeList {

    public static void main(String[] args) {

        List<String> companies=new ArrayList<>(List.of("Google","Apple","Tesla","Meta","Mindtek","Netflix","Amazon"));

        System.out.println(companies);

        // Without looping find the order number of Amazon in list.
        System.out.println("Order number of Amazon: "+(companies.indexOf("Amazon")+1));

        // Replace companies that starts with letter 'N' with Microsoft
//        for(int i=0; i<companies.size(); i++){
//            if(companies.get(i).startsWith("N")){
//                companies.set(i, "Microsoft");
//            }
//        }

        for(String c : companies){
            if(c.startsWith("N")){
                companies.set(companies.indexOf(c),"Microsoft");
            }
        }

        System.out.println(companies);

        // Remove companies that has 5 characters (for traditional)
        // [Google, Tesla, Meta, Mindtek, Microsoft, Amazon]
        for(int i=0; i<companies.size(); i++){
            // i=0 -> i=1
            if(companies.get(i).length()==5){
                companies.remove(companies.get(i));
                i--;
            }
        }
        System.out.println(companies);

        // Concatenate first and last character of each company and replace that with company name
        // [Google, Meta, Mindtek, Microsoft, Amazon]
        // [Ge, Ma, Mk, Mt, An]

        for(int i=0; i<companies.size(); i++){
                    //   Google            "" + 'G'    +   'e'  = "Ge"
            String chars=""+companies.get(i).charAt(0) + companies.get(i).charAt(companies.get(i).length()-1);
            companies.set(i,chars);
        }
        System.out.println(companies);

    }

}












