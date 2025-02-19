public class test4 {
    public static void main(String[] args) {
        try{
        int result = 10/0;
        System.out.println(result);
        }catch (Exception e) { //ดับจับข้อยกเว้นนน

            System.out.println("Error!" +e.getMessage());
        }

        System.out.println("The program continues to run...");
        


        }
    }


