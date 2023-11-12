package countwords;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountWordsStream {
    
    public static void main(String[] args) {
        try {
    FileReader fr = new FileReader(args[0]);
    BufferedReader br = new BufferedReader(fr);

    Optional<Integer> opt = br.lines()
        .map(line -> line.trim().replaceAll("[^\\sa-zA-Z0-9]", ""))
        .filter(line -> line.length() > 0)
        .map(word -> word.split(" "))
        .map(word -> word.length)
        .reduce((acc, x) -> acc+x)
    ;
    int count = 0 ;

    // test for optional
    if (opt.isPresent()){
        count = opt.get();
        System.out.printf("Total number of words = %d", count);
    }
    else{
        System.out.println("No Result");
    } 
    
    //////////////////////////////////////////////////////////////////////////////////////


    FileReader fr = new FileReader(args[0]);
    BufferedReader br = new BufferedReader(fr);

    List<String> uniqueList = br.lines()
        .map(lines -> lines.trim().replaceAll("[^\\sa-zA-Z0-9]",""))
        .filter(lines -> lines.length()>0)
        .map(lines -> lines.split(" "))
        .flatMap(word -> Stream.of(word))
        .map(word -> word.toLowerCase())
        .distinct()
        //.forEach(word -> {System.out.println(word);})
        .toList()
        
    
        ;
        System.out.printf("Total number of words = %d\n", uniqueList.size());

        // print each word
        uniqueList.forEach(word ->System.out.println(word)); 


}
    catch(Exception e){
        System.out.println("key text file name as argument");
    }

    }
    

}


