import java .io.*;
import java.util.Scanner;
public class Count5FromFile {
    public static void main(String[] args){
        try{
            FileReader reader = new FileReader("Count5.txt"); 

            Scanner myobj = new Scanner(reader);
            int count = 0;

            while(myobj.hasNextLine()) {
                String line = myobj.nextLine();
                char[] arr = line.toCharArray();

                for(int i = 0 ; i < arr.length ; i++){
                    if(line.charAt(i) == '5'){
                        count++;
                    }
                }
            }
            System.out.println("The number of 5 in file = " + count);

        }
        catch(Exception e){
            e.printStackTrace();
        }
        

    }
}
