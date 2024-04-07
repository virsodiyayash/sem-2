import java.io.*;
public class Student {
    public static void main(String[] args){
        try{
            FileInputStream fis = new FileInputStream("NewStudent.txt");
            FileOutputStream fos = new FileOutputStream("NewStudentPrint.txt");

            byte data = (byte)0;

            while((data = (byte)fis.read()) > -1){
                fos.write(data);
            }
            fis.close();
            fos.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        

        
    }
}
