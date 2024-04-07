import java.io.*;
public class Question1{
    public static void main(String[] args) {
        try{
            File f1 = new File("Practice.txt");
            FileWriter fw = new FileWriter(f1);
            fw.write("Your intension is the most important thing for your carrer.");
            fw.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}