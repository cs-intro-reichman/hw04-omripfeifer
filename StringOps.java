public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        
    }

    public static String capVowelsLowRest (String string) {
        // Write your code here:
        String newStr = "";
        String newBigStr = "";

        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch += 32;
            }
            newStr += ch;
        }

        for (int j = 0; j < newStr.length(); j++) {
            char chnew = newStr.charAt(j);
            if (chnew == 'a' || chnew == 'i' || chnew == 'e' || chnew == 'o' || chnew == 'u' ) {
                chnew -= 32;
            }
            newBigStr += chnew;
        }

        return newBigStr;
    } 

    public static String camelCase (String string) {
        boolean nextUpperCase = false;
        String camelCaseWord = "";
    
        for (int i = 0; i < string.length(); i++) {
            char currentChar = string.charAt(i);
    
            if (currentChar >= 'A' && currentChar <= 'Z') {
                camelCaseWord += (char) (currentChar + 32);  // Convert  to lowercase
            } else if (currentChar == ' ') {
                nextUpperCase = true;
            } else {
                if (nextUpperCase) {
                    camelCaseWord += (char) (currentChar - 32);  // Convert vowels to uppercase
                    nextUpperCase = false;
                } else {
                    camelCaseWord += currentChar;
                }
            }
        }
    
        return camelCaseWord;
    } 

    public static int[] allIndexOf (String string, char chr) {
        int count = 0 ; 
        for (int i = 0 ; i < string.length() ; i++ ) {
            if ( string.charAt(i) == chr ){
                count++;
            }
        }
        int [] indx = new int [count] ;
        int current = 0 ; 
        
        for (int i = 0 ; i < string.length(); i++ ){
            if (string.charAt(i) == chr ){
                indx[current] = i ;
                current++ ;
            }
        }
        return indx;
    }
}