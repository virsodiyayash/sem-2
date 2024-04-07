import java.io.*;
public class Question4{
    public static void main(String[] args){
        String filename = "Student.txt";

        try{
            FileOutputStream fos = new FileOutputStream("Student.txt");
            DataOutputStream dos = new DataOutputStream(fos);
            dos.writeUTF("Yash");
            dos.writeInt(221);
            dos.writeUTF("Mann");
            dos.writeInt(220);
            System.out.println("Data written successfully.");
            dos.close();
            fos.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}