public class work7 {
    
    public static void main(String[] args) {
        
        String[][] students = {
        
            {"Sureeporn", "50" , "50" , "50"}
            {"Supa", "60" , "65" , "75"}
            {"Supot", "77" , "87" , "94"}
        
    };
    //คำณวนค่าเฉลี่ยก่อนเขียนลงไฟล์
    String[] result = new String [students.length];

    for (int i = 0; i <students.length; i++){
        String name = students[i][0]; 
        double  sum =0;
        int numScores = students[i].length -1;




        //loopคะเเนนรวมสอบ
        for (int j = 1; j <numScores;   j++) {
            sum += Integer.parseInt(students)[i][j];
        }
    }
}
