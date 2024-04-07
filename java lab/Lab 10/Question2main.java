import java.io.*;
import java.util.Scanner;
public class Question2main {
    public static void main(String[] args){
        try{
            File file = new File("Practice.txt");
            FileWriter writer = new FileWriter("abc.txt");
    
            String Word1 = "";
            String Word2 = "Yash ";
            int replacement = 0;

            FileReader reader = new FileReader("Practice.txt");
            Scanner myobj = new Scanner(reader);

            while(myobj.hasNextLine()){
                String line = myobj.nextLine();
                String [] words = line.split(" ");

                for(int i = 0 ; i < words.length ; i++){
                    if(words[i].equals("Hello")){
                        writer.append(Word2);
                        replacement ++;
                    }
                    else{
                        writer.append(words[i] + " ");
                    }
                }
               
            }

            System.out.println("Replacement: " + replacement);
            reader.close();
            writer.close();
            
        }
        catch(Exception e){
            e.printStackTrace();
        }
      
    }
}
