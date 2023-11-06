package numberfilter;

import java.util.LinkedList;
import java.util.List;

public class NumberLoop {

    public static void main(String[] args) {
        
        List<Integer> numList = new LinkedList<>();
        for (int i = 1; i<=10; i++){
            numList.add(i);
        }
        
        int total =0;

        for(int i=0; i<numList.size(); i++){
            
            int currentInt = numList.get(i);

            if ((currentInt%2)>0){
                continue;
            }
            total += currentInt;
        }

        System.out.printf("Total even numbers = %d\n", total);
    }
    
}
