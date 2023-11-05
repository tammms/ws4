package ws4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class WordCountLoop {
    public static void main(String[] args) throws Exception{
        
        /*File file = new File(
            "C:\\Users\\tammy\\OneDrive\\Documents\\VTTP\\workshop\\ws4\\road_not_taken.txt");
        File file = new File(
            "road_not_taken.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));

        String line;
        
        while((line = br.readLine())!= null){
            System.out.println(line);
        }*/

        Scanner scanner = new Scanner( new File("C:\\Users\\tammy\\OneDrive\\Documents\\VTTP\\workshop\\ws4\\road_not_taken.txt") );
        String text = scanner.useDelimiter("\\A").next();
        scanner.close(); // Put this call in a finally block

        int total = 0;
        String[] tokens= text.split(" ");

        for (int i=0; i<=tokens.length; i++){
            total += 1;
        }
        System.out.printf("word count = %d", total);
        


        

        
    }
}

