import java.util.Scanner;

public class JavaStringIntroduction {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        int sum = A.length() + B.length(); //calculating sum
        System.out.println(sum);
        
        if(A.compareTo(B) > 0){ //compare strings
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        //space between the words and first letter is capital
        System.out.println(A.substring(0 , 1).toUpperCase() + A.substring(1) + " " + B.substring(0 , 1).toUpperCase() + B.substring(1));
    }
}
