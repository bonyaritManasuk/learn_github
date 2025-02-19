public class class5 {
    public static void main(String[] args)
    โจทย์ข้อที่1
     {
        /* 
    int[] a = new int[5];
            a[6] = 9;
        System.out.println(a);
 }
            
}
*/
//วิธีเเก้ 
String input = "akid"; 
        
        try {
            int number = Integer.parseInt(input); // พยายามแปลง String เป็น int
            System.out.println(": " + number);
        } catch (NumberFormatException e) {
            System.out.println("  :    '" + input + "' ");
           
        }
        
        System.out.println("The program works normally.");
    }
}







