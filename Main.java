import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
         //Create new scanner
    Scanner input = new Scanner(System.in);

    //Values of each digit
    int tenThousands, thousands, hundreds, tens, ones;

    //Prompt user to input 5 digit number
       
    int number = input.nextInt();
    if (number > 99999) {
        System.out.println("\nError! Number more than 5 digits.");
        }
    else if (number < 10000) {
        System.out.println("Error! Number less than 5 digits.");
        }
    else if (10000<=number&&number<=99999){
        //WRITE YOUR CODE HERE
    ones = number/10000%10;
    tens = number/1000%10;
    hundreds = number/100%10;
    thousands =  number/10%10;
    tenThousands = number%10;
    System.out.println(ones);
    System.out.println(tens);
    System.out.println(hundreds);
    System.out.println(thousands);
    System.out.println(tenThousands);
        }
     }
}

