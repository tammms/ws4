//package ws4;

import java.util.Scanner;
import java.io.File; 

public class book{
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("C:\\Users\\tammy\\OneDrive\\Documents\\VTTP\\workshop\\ws4\\books.csv"));
        sc.useDelimiter(",");
        
        String str = sc.nextLine()
        .map(line -> line.substring(line.lastIndexOf(" ")+1))
        .map(line -> line.toLowerCase())
        .map(word -> word.split(" ")[0])
        .




        // use loop to access each line
        // take item after the last comma of each line
        // store item as a list
    }
}