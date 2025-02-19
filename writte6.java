import java.io.BufferedWriter;
import java.io.IOException;
import java.io.FileWriter;
public class writte6 {
    public static void main(String[] args) {

        //งาน Exception Handling   *ส่งก่อน 13:00


        String filePath = "C:\\Users\\COM\\Documents\\111.txt"; // ไฟล์ที่อยู่ในเอกสาร โฟรเดอร์111.Txt

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write("Hello, Java!\n");
            writer.write("This is a test file.\n");
            writer.write("Writing to a file is easy!\n");
            System.out.println("Write Success: " + filePath);
        }     catch (IOException e) {
     System.out.println("Error: " + e.getMessage());
        }
    }
}
    

