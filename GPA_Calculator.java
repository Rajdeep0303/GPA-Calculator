import java.util.Scanner;
public class GPA_Calculator {
    public static void main (String[] args) {
        double data = 0;                        // data equal to 0
        double sum = 0;                         // define sum 
        int count = 1;                          // count 1 
        double average = 0;                 // set the average equal to 0

        Scanner input = new Scanner(System.in);                             // user input
        do{
            System.out.println("Enter GPA of your subject " + (count) + ":");                   // print statement
            data = input.nextDouble();                                  // user input
            if (data > 4 || data < 1) {                                     // if data great than 4 or less than 1 break the ask for other number
                if (data == 0) {                                // data not equal 0
                    break;                                          // break the if statemnet
                }
                System.out.println("Enter the number between 1.0 to 4.0 ");
                continue;                                       // continue the the looop
            } 
            sum += data;                                                                // sum = sum + data
            average = sum/count++;                                                      // sum/ count++ to get the average
    } while (data != 0);                                                // when data eqaul to 0 count the average
        System.out.println("The Average CGPA of " + count + " subject is " + average);          // print statement
    } 
}