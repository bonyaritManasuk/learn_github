import java.lang.reflect.Array;

public class ex8 {
    public static void main(String[] args) {
        String text = "Hello";
        char[]charArray = text.toCharArray();
        System.out.println(Array.toString(charArray));
        System.out.println(text);
        charArray[0]='j';
        System.out.println(Arrays.toString(charArray));
        
String text1 = new String(charArray);
System.out.println(text);


    }
}
