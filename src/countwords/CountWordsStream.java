package countwords;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Optional;

public class CountWordsStream {

    public static void main(String[] args) throws Exception{
        
        FileReader fr = new FileReader(args[0]);
        BufferedReader br = new BufferedReader(fr);

        int total = 0;
        
        Optional <Integer> opt = br.lines()
            .map(line -> line.trim().replaceAll("[^\\sa-zA-Z0-9]",""))
            .filter(line -> line.length() > 0)
            .map(line -> line.split(" "))
            .map(line -> line.length)
            .reduce((acc,x)-> acc + x);

        if(opt.isPresent()){
            total = opt.get();
            System.out.printf("Number of words in %s is %d\n", args[0], total);
         }
         
         else {
            System.out.println("No result");
         }
        



        

    }
    
}
