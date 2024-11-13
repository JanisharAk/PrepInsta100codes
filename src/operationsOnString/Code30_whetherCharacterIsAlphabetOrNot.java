package operationsOnString;

import java.util.Scanner;

public class Code30_whetherCharacterIsAlphabetOrNot {
    /*
    Condition: ('A' >= 'A' && 'A' <= 'Z') → True
    Output: "Alphabet character"
    Condition: '1'
    Output: Not Alphabet
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Character: ");
        char ch = sc.next().charAt(0);
        if((ch>=65 && ch<=90) || (ch>=97 && ch<=122)){ // range of alphabet
            System.out.println("Character is Alphabet");
        }
        else{
            System.out.println("Character is not Alphabet");
        }
    }
}
