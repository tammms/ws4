package ws4;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedList;

public class WordCountStream{
    public static void main(String[] args) throws Exception{
        
        Path file = Path.of(
            "C:\\Users\\tammy\\OneDrive\\Documents\\VTTP\\workshop\\ws4\\road_not_taken.txt");
        //BufferedReader br = new BufferedReader(new FileReader(file));

        LinkedList<String> al=new LinkedList<String>();
        String str = Files.readString(file);


        int total =
        str.
        stream().
        filter(w -> !w.isEmpty()).
        map(w -> w.split(" ")).
        count();
    }
}

/*acc represents accumulator
.map(line -> line.split(" "))
.reduce ((accumulator, x) -> acc + x)
problem - need to add list to the accumulator (acc+x) 
- need the length of the line (x) - but x that you pass in now is a string array

so:
.map(line -> line.split(" ").length)
or
.map(line -> line.split(""))
.map(words -> words.legnth)
.reduce ((accumulator, x) -> acc + x);

- this will return Optional<Integer> opt = br.lines() at the top
 ---- if read empty file - does not produce result, cannot represent it with 0
 e.g. ask to do something, but the thing may or may not produce a result

int count = opt.get();
*/ 


/*
 convert the array into individual words - convert each element into a stream
 using flatmap

 Stream(String[]) - stream of strings
 after flatmap will become: Stream<String>

 String[] - stream.of(array) - stream<String>

 */

 /*consumer - takes a value and returns void (nothing) - 
 e.g. want to print out distinct words - convert words into list
 
 if
 List<String> wordlist = br.lines()
 ...
 .distinct()
 .toList()

 for (String w:wordList)
 System.out.printf("word = %s\n", w)
but will only get wordList when it stops - but what if it does not stops, won't get result
this method assumes that the code will stop
e.g. if track airplane flying for 16 hours, won't get your answer only after 16 hours
this method assumes everything will stop - if does not stop, cannot even print out intermediate results

so need a consumer


....
..
.distinct()
.forEach(word-> {System.oput.printf(forEach = %s\n, word);)

  */

/*
 * TAKE NOTEEE
 * the chunk of code is just the processing of the code
 * it does not mean the stream has ended - each thing will go through the code chunk
 */

 /*
*********IMPORTANT*************** 
pattern for stream
1. source of stream: (any of this operation will produce a stream)
stream.of()
List.stream() - when have list
set.stream()
reader.lines()

2. stream operations - will get individual data coming in
 - performs on individual element as they come through
 - can chain the operations together
map()
flatmap()
fileter()
count()
distinct()
skip()
order()
take()
max/min...

3. collector - stream needs to terminate (terminate the operation)
 - once you have this it means the stream has eneded
toList()
reduce()
forEach()
groupingBy()


Source --stream--> stream operations --stream--> collector
  */


 /* go to file system and create 1 directory - C:\users\fred\vttp
 
 vttp (under vttp everyday create 1 directory)
  - day01, day02 - make each of this into a repository in git
  
  day01
  1. git init
  2. create a repo in Git
  3. 'link' your local repo to git:
  git remote add origin __
  4. git add .
  git commit -m "__"
  get pursh origin master/main
 */

/*
 repository root: day01

 everyday in repository root, create 2 directories
1. create 2 directories (folder)
- src, classes

e.g. day01 (repository root)
    - src (hold java source : .java)
    - classes (complie classes store here - the .class file that is compiled (generated) from the source)

    2. add a .gitignore (to prevent committing classes file to git)
    can go into visual studio to create inside the folder is ok
     - list files or directories you don't want it to commit inside
     - write one on each line: (any files that matches these will be ignored)
     classes
     *.log (any file that ends with this)
     *.tmp
     tmp*
 */
