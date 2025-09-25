import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args){
        System.out.println("Let's reverse your number");

        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a couple of numbers: ");
        int number = input.nextInt();

        String newNumber = Integer.toString(number);
        String ReverseNo = "";
        
        for ( int i = newNumber.length() -1 ; i >=0 ; i--){
        ReverseNo += newNumber.charAt(i);
        }
        System.out.println("The New Reversed Number= "+ReverseNo);
    }
}
