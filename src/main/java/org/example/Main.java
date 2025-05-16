package org.example;
import java.util.Scanner;
public class Main {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        int menu;
        System.out.print("Choose which of the following code to run: \n 1. Further Substring fun \n 2. Run of integers \n 3. Sum of a range of sequential integers \n 4. Repeatedly echo a word \n 5. Words separated by dots \n 6. Adding up integers \n 7. Shipping cost calculator ");
        menu = input.nextInt();
       if (menu == 1) {
       String sentence;
       int start;
       int end;
       System.out.print("Enter a string:") ;
       sentence = scanner.nextLine() ;
       System.out.print("Enter beginning index: ");
       start = input.nextInt() ;
       System.out.print("Enter ending index: ");
       end = input.nextInt() ;
       System.out.println("Original string:");
       System.out.println(sentence);
       System.out.println("Substring: ");
       sentence = sentence.substring(start,end);
       System.out.println(sentence);

       }
        if (menu == 2) {
       int start;
       int end;
       System.out.println("Enter Start:");
       start = input.nextInt();
       System.out.println("Enter End:");
       end = input.nextInt();
       while (start <= end) {
           System.out.println(start) ;
           start ++;
        
        }
        }
    if (menu == 3) {
            
      int low;
      int high;
      int sum = 0;
      System.out.println("Enter low:");
      low = input.nextInt();
      System.out.println("Enter high:");
      high = input.nextInt();
      while (low <= high) {
          sum = sum + low;
         low ++;
      }
      System.out.println("Sum = " + sum);

    }
    if (menu == 4) {
       String word;
       int length;
       System.out.println("Enter a word:");
       word = scanner.nextLine();
       length = word.length();
       for (int i = 0; i<length; i++) {
           System.out.println(word);
       }

    }
    if (menu == 5) {
        System.out.println("Enter first word:");
        String word1 = scanner.nextLine();


        System.out.println("Enter second word:");
        String word2 = scanner.nextLine();


        int totalLength = 30;
        int numDots = totalLength - word1.length() - word2.length();


        System.out.print(word1);




        for (int i = 0; i < numDots; i++) {
            System.out.print(".");
        }


        System.out.println(word2);

    }
    if(menu == 6) {
        //Exercise — Adding up Integers
        int numberOfInt;
        int currentInt;
        int sum=0;
        System.out.println("How many integers will be added:");
        numberOfInt = input.nextInt();
        for (int i =0; i<numberOfInt; i++){
            System.out.println("Enter an integer:");
            currentInt = input.nextInt();
            sum = sum + currentInt;
        }
        System.out.print("The sum is " + sum);

    }
    if (menu == 7){
         Double weight;
        Double newWeight;
        Double cost = 3.00;
        do{
            System.out.println("Weight of Order:");
            weight = input.nextDouble();
            cost = 3.00;
            newWeight=weight-10;
            if (newWeight>0){
                cost = 3.00 + newWeight*.25;
            }
            System.out.println("Shipping Cost: $" + cost +"0");
        }while (weight>0);
    }
    }
}

    




    

