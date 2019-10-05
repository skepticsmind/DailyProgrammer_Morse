import java.util.*;

class Main {

    public static String translator(Scanner s){
        String text = "";
        String translation = "";
        System.out.println("Enter some text to be translated to morse code, enter \"quit\" to quit");
        if (s.hasNext("[A-Za-z]+")) {
            if (s.hasNext("quit")) {
                System.out.println("Program Terminating");
                System.exit(0);
            }
            System.out.println("Converting English Alphabet to Morse Code");
            text = s.nextLine().toUpperCase();
            for (Character c : text.toCharArray()) {
                translation += englishMorse.valueOf(c.toString()).toMorse();
            }
        }else if(s.hasNext("[.-]+")){
            System.out.println("Converting Morse Code to English Alphabet");
            text = s.nextLine();
            translation = translateMorse(text);

        }else{
            System.out.println("Invalid Text. Enter some text to be translated");
            s.nextLine();
        }
        return translation;
    }

    public static String translateMorse(String s){
    //TODO Fix workaround

        String english = "";
        char translatedChar;
        String chunk = "";
        int remainingLength = s.length();

        while (remainingLength > 0){

            if(remainingLength >= 4){
                chunk = s.substring(0,3);
            }else {
                chunk = s.substring(s.length()-remainingLength);
            }

            translatedChar = chunkTranslator(chunk);
            english += translatedChar;
            String workaround = Character.toString(translatedChar).toUpperCase();
            remainingLength = remainingLength- englishMorse.valueOf(workaround).toMorse().length();
        }
        return english;
    }

    public static char chunkTranslator(String s){
        char english = 0;
        boolean found = false;
        while(!found) {
            for (englishMorse m : englishMorse.values()) {
                if (m.toMorse().equals(s)) {
                    english = m.toEnglish();
                    found = true;
                }
            }
            s = s.substring(0,s.length()-1);
        }

        /*
        for(char c : s.toCharArray()){
            test += c;
            for(englishMorse m : englishMorse.values()){
                if(m.toMorse().equals(test)){
                    morse += m.toEnglish();
                    test = "";
                }
            }
        }\

         */

        return english;
    }

    public static void main(String[] args) {
        //Attempt 1 used a two arrays mapped. Kept it in for remembering my solutions.
        /*
        String[] commonAlphabet = new String[]{"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        String[] morseAlphabet = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Map<String, String> map = new HashMap<>();
        for(int i = 0; i < commonAlphabet.length; i++) {
            map.put(commonAlphabet[i], morseAlphabet[i]);
        }
        */

        /*At the moment the program will read in any letter the user puts in and will spit out morse code with no spaces.
        This is the beginning of the project detailed here https://www.reddit.com/r/dailyprogrammer/comments/cmd1hb/20190805_challenge_380_easy_smooshed_morse_code_1/
        If the user doesnt cooperate and puts in a non-letter value the program will shut down.
        TODO  Want to make a function that converts morse code to english alphabet. Problem being there will be conflicts for which letter is which without spaces
         */
        String userInput = "";
        Scanner inputScanner = new Scanner(System.in);
        while (true) {
            userInput = translator(inputScanner);
            System.out.println(userInput);
        }
    }
}


