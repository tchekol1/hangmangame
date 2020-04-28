import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class SimpleHangman {
    public static void main(String[] args) {
        ArrayList <String>arrayList= new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int numGuess=0;
        String  guess;
        char entry;
        String word = "";
        arrayList.add("tree");
        arrayList.add("rain");
        arrayList.add("bear");
        arrayList.add("encourage");
        arrayList.add("promise");
        arrayList.add( "soup");
        arrayList.add( "chess");
        arrayList.add("insurance");
        arrayList.add("pancakes");
        arrayList.add("stream");
        Random random= new Random();
        int r= random.nextInt(arrayList.size());
        String str= arrayList.get(r);
        char[]chars=new char[str.length()];
        for (int i = 0; i <chars.length ; i++) {
            chars[i]='_';
        }

        System.out.println("Welcome, let's play hangman! ");
        System.out.print("Here is the word I am thinking of: ");
        for (int i = 0; i <chars.length ; i++) {
            System.out.print(chars[i]+ " ");
        }
        while(numGuess<6) {
            System.out.println("\nEnter your guess");
            guess = scanner.nextLine();
            if(guess.equalsIgnoreCase(str)){
                System.out.println("You've won! The word was " + str);
                System.out.println("Thank you for playing!");
                break;
            }
            entry= guess.charAt(0);

            if ((String.valueOf(chars).equalsIgnoreCase(str))) {
                System.out.println("You've won! The word was " + str);
                System.out.println("Thank you for playing!");
                break;
            } else if (str.contains(guess)) {
                int j = str.indexOf(guess);

                while (j >= 0) {
                    chars[j] = guess.charAt(0);
                    j = str.indexOf(guess, j + 1);

                }
                System.out.println("You guessed so far ");
                System.out.println(String.valueOf(chars));
                if (String.valueOf(chars).equalsIgnoreCase(str)) {
                    System.out.println("You've won! The word was " + str);
                    System.out.println("Thank you for playing!");
                    break;
                } }else {
                numGuess++;
                System.out.println("You have guessed incorrectly " + numGuess + " times.");
                // System.out.println("You guessed so far "+ word);
            }
        }
        if(numGuess==6)
            System.out.println("Sorry, you have no more guesses left. The word was . "+ str);


    }}


