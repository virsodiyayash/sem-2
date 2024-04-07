import java.util.Scanner;
import java.io.*;
public class Question1main{
    public static void main(String[] args){
        try{
            FileReader reader = new FileReader("Practice.txt");
            Scanner myobj = new Scanner(reader);
                int countwords = 0;
                int countline = 0;
                int countchar = 0;
            while(myobj.hasNextLine()){
                
               
                String line = myobj.nextLine();
                countline++;
                
                char[] arr = line.toCharArray();

                try{
                    for(int j = 0 ; j < line.length(); j++){
                        if(line.charAt(j) == ' ' || line.charAt(j) == '\t' || line.charAt(j) == '\n'){
                            countwords++;
                        }
                        else{
                            countchar++;
                        }
                    }
                }
                catch(Exception e){
                    e.printStackTrace();
                }
               

                System.out.println("The number of words in the file: " + countwords);
                System.out.println("The number of characters in the file: " + countchar);
                System.out.println("The number of lines in the file: " + countline);
            }
            reader.close();
            myobj.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    private static char charAt(int j) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'charAt'");
    }
}