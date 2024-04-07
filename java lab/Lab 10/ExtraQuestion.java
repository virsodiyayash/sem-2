import java.io.*;
import java.util.Scanner;
public class ExtraQuestion {
    public static void main(String[] args){
        try{
            FileReader reader = new FileReader("Extra.txt"); 
            FileWriter writer = new FileWriter("NewExtra.txt");

            Scanner myobj = new Scanner(reader);
            while(myobj.hasNextLine()){
                String line = myobj.nextLine();
                
                String [] words = line.split("");
                try{
                    for(int i = 0 ; i < words.length ; i++){
                        if(line.charAt(i) == ' ' || line.charAt(i) == '\t'){
                            writer.append(" , ");
                        }
                        else{
                            writer.append(words[i] + "");
                        }
                    }
                }
                catch(Exception e){
                    e.printStackTrace();
                }
            }
            writer.close();
            reader.close();
            
        }
        catch(Exception e){
            e.printStackTrace();
        }
       
    }
}
