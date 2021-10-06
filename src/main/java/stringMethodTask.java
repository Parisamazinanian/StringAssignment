package main.java;
import java.util.Scanner;
public class stringMethodTask {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        String text, phrase1,phrase2,phrase3,phrase4,deletphrase;
        char char1, char2, char3, char4;
        System.out.println("please enter a text:");
        text=sc.nextLine();
        NumberOfChars(text);
        System.out.println("Please enter the Character you wish to replace:");
        char1=sc.nextLine().charAt(0);
        System.out.println("Please enter the Character you wish to replace with:");
        char2=sc.nextLine().charAt(0);
        System.out.println("The result of replacing only one character is: \n" +replaceChar(text, char1,char2));
        System.out.println("Please enter the Character you wish to replace the new character with all of it:");
        char3=sc.nextLine().charAt(0);
        System.out.println("Please enter the Character you wish to replace with all the previous selected character:");
        char4=sc.nextLine().charAt(0);
        System.out.println("The result of replacing one character with all is: \n" +replaceAllChar(text, char3,char4));
        System.out.println("Please enter the phrase you wish to replace:");
        phrase1=sc.nextLine();
        System.out.println("Please enter the phrase you wish to replace with:");
        phrase2=sc.nextLine();
        System.out.println("The result of replacing only one phrase is: \n" +replacePhrase(text, phrase1,phrase2));
        System.out.println("Please enter the phrase you wish to replace the new phrase with all of it:");
        phrase3=sc.nextLine();
        System.out.println("Please enter the phrase you wish to replace with all the previous selected phrase:");
        phrase4=sc.nextLine();
        System.out.println("The result of replacing one phrase with all is: \n" +replacePhraseAll(text, phrase3,phrase4));
        System.out.println("Please enter the phrase you wish to delete: ");
        deletphrase=sc.nextLine();
        System.out.println("The result of Deleting is: \n"+ deletePhrase(text, deletphrase));


        //System.out.println("The result of replacing only one character is: \n" +replaceChar(text, char1,char2));
        //System.out.println("The result of replacing one character with all is: \n" +replaceAllChar(text, char3,char4));
        //System.out.println("The result of replacing only one phrase is: \n" +replacePhrase(text, phrase1,phrase2));
        //System.out.println("The result of replacing one phrase with all is: \n" +replacePhraseAll(text, phrase3,phrase4));
        //System.out.println("The result of Deleting is: \n"+ deletePhrase(text, deletphrase));

    }
    public static void NumberOfChars(String inputText) {
        if (inputText.length() > 500) {
            System.out.println("Please enter a text with maximum 500 characters");
        }
        return;
    }

        public static String replaceChar (String inputText, char firstchar, char secondchar){
            StringBuilder result = new StringBuilder(inputText);
            int index = inputText.indexOf(firstchar);
            result.replace(index, index+1, String.valueOf(secondchar));
            return result.toString();

        }

        public static String replaceAllChar(String inputText, char firstchar, char secondchar){
            String newreplaced = inputText.replace(firstchar, secondchar);
            return newreplaced;

        }
        public static String replacePhrase(String inputText, String phraseReplaced, String phraseWith){
            StringBuilder result = new StringBuilder(inputText);
            int index = inputText.indexOf(phraseReplaced);
            result.replace(index, index + phraseReplaced.length(), phraseWith);
            return result.toString();
        }
        public static String replacePhraseAll(String inputText, String phraseFirst, String phraseAll){
            String newrPhrase = inputText.replace(phraseFirst, phraseAll);
            return newrPhrase;

        }
        public static String deletePhrase (String inputText, String phraseDelete){
            String str=inputText.replaceAll(phraseDelete, "");
            return str;
        }

    }

