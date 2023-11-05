package countwords;
import java.io.BufferedReader;
import java.io.FileReader;

// to count the number of words in the text file

public class CountWordsLoop {
    
    
    public static void main(String[] args) throws Exception{
        
        FileReader fr = new FileReader(args[0]);
        BufferedReader br = new BufferedReader(fr);

        String line;
        int total = 0;

        while((line = br.readLine())!= null){
            
            line = line.trim().replaceAll("[^\\sa-zA-Z0-9]", "");
        
            /////TAKE NOTE/////
            // MUST REMOVE EMPTY LINES
            if (line.length() <= 0){
                continue;
            }
            String[] splitted = line.split(" ");

            total += splitted.length;

        }

        br.close();

        System.out.printf("Total number of words in %s file is %d\n", args[0], total);



        

        

    }
    
}
