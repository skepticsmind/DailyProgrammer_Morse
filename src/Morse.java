import java.util.*;

class Main {

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
        TODO Figure out without using GOTO how make program restart after user puts in non-letter. Probably easy but i need to sleep.
        TODO  Want to make a function that converts morse code to english alphabet. Problem being there will be conflicts for which letter is which without spaces
         */
        String answer = "";
        Scanner userInput = new Scanner(System.in);
        while (true) {
            System.out.println("Enter some text to be translated to morse code");
            if (!userInput.hasNext("[A-Za-z]+")) {
                System.out.println("Can only convert letters!");
                break;
            }
            String text = userInput.nextLine();
            for (int j = 0; j < text.length(); j++) {
                //this is really ugly
                String thisChar = Character.toString(text.charAt(j)).toUpperCase();
                answer += englishMorse.valueOf(thisChar).toMorse();
            }
            System.out.println(answer);
            answer = "";
        }
    }
}


