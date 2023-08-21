import java.util.Scanner;

public class DataTypes {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i=0; i<n; i++){
            try{
            long data = scan.nextLong();
            System.out.println(data + " can be fitted in:");
            if(data >= -128 && data <= 127)
                System.out.println("* byte");
            if(data >= -32768 && data <= 32767)
                System.out.println("* short");
            if(data >= -2147483648 && data <= 2147483647)
                System.out.println("* int");
            if(data >= -9223372036854775808l && data <= 9223372036854775807l)
                System.out.println("* long");
            
        }
        catch(Exception e){
            System.out.println(scan.next() + " can't be fitted anywhere.");
        }
        }
    }
}