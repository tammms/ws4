package numberfilter;

import java.util.LinkedList;
import java.util.List;

public class NumberStream {

    public static void main(String[] args) {
        
        List<Integer> numList = new LinkedList<>();

        for(int i =0; i<=10; i++){
            numList.add(i);
        }

        List<Integer> processed =numList.stream()
            .filter(num -> (num%2)==0)
            .toList()
            ;

        System.out.printf("Even numbers = %s\n", processed);

        int total = numList.stream()
            .filter(num -> (num%2) ==0)
            
            //if you want to apply a function to individual numbers (like multiply)
            .map(num -> {return num*2;})
            
            /*
            reduce(a,b,c)
            a = initial value of the reduction operation or the default result when the 
                stream of integer values is empty
            b = a function that represents the partial sum of integer values and the next element in the stream
            c = a function that operates on the accumulated value and the next element in stream
            
             */
            .reduce(0, (acc,x) -> acc+x)
            ;

        System.out.printf("Total value of even numbers *2 = %d\n", total);

        


    }
    
}
