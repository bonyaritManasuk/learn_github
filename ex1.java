public class ex1 {
public static void main(String[] args) {

         int []numbers={10,20,30};
    for (int i = 0; i <numbers.length; i++ ) {
System.err.println("Message is "+numbers[i]);

numbers [1]=100;
for (int n :numbers){
    System.out.println("En for :"+n);
}
    }
  }
}