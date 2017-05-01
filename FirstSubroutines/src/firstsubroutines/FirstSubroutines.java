package firstsubroutines;

public class FirstSubroutines {
    /**
     * The reverse subroutine takes in a string that has been pre-formated
     * to only contain lowercase letters, iterates through the string
     * in reverse order and creates a new string that is the reverse of the
     * original string. It then returns the reversed string.
     */
    static String reverse(String s){
        String r = "";
        //Go through original string backwards to create reversed string
        for(int i = s.length()-1; i >= 0; i--){
            r += s.charAt(i);
        }
        return r;
    }
    
    /**
     * The formatString subroutine takes in a string, converts it to lowercase,
     * then creates and returns a new version of the original string with all
     * punctuation and whitespace removed.
     */
    static String formatString(String s){
        s = s.toLowerCase();
        String f = "";
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            //Add character to string only if it is an alpha character
            if(c >= 'a' && c <= 'z'){
                f += c;
            }
        }
        return f;
    }
    
    public static void main(String[] args) {
        String originalString; //Holds user's original input
        String formatedString; //Contains only lowercase characters from original
        String reverseString; //Reverse of formatedString
        Boolean testingStrings; //Determines when to quit program
        
        do{
            //Prompt user to input a string
            System.out.println("Enter a string: ");
            originalString = TextIO.getln();
            //Use formatString subroutine to remove any nonlowercase alpha characters
            formatedString = formatString(originalString);
            //Use reverseString subroutine to reverse formatedString
            reverseString = reverse(formatedString);

            //Display formated and reverse formated strings
            System.out.printf("Stripped: %s%n", formatedString);
            System.out.printf("Reversed: %s%n", reverseString);
            
            //Test if formated and reverse formated strings are equal
            if(formatedString.equals(reverseString)){
                //If they are equal it is a palindrome
                System.out.printf("\'%s\' is a palindrome.%n%n", originalString);
            } else{
                System.out.printf("\'%s\' is NOT a palindrome.%n%n", originalString);
            }
            
            //Prompt user to indicate if they want to test another string
            System.out.println("Would you like to test another string?");
            testingStrings = TextIO.getBoolean();
            TextIO.getln();
            System.out.println();
        } while(testingStrings);
        
        //End program
        System.out.println("Goodbye!");
    }
    
}
