import java.io.*;
public class StudentInformation{
    public static void main(String[] args){
        try{
            FileReader reader = new FileReader("Student.txt");
            FileWriter writer = new FileWriter("StudentDemo.txt");
            BufferedReader br = new BufferedReader(reader);
            BufferedWriter bw = new BufferedWriter(writer);

           
            String s;
           while((s=br.readLine()) != null){
            String[] arr = s.split("\\s+");
            for(int i = 0 ; i < arr.length ; i++){
                System.out.println(arr[i]);
                bw.write(arr[i] + "\n");
            }
            System.out.println();
           }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}