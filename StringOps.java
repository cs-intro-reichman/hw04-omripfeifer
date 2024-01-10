public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////                Reminder:                      ///////
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
    String newStr1 = "";
    String finalStr = "";

    boolean capitalizeNext = true;

    for (int i = 0; i < string.length(); i++) {
        char newChar = string.charAt(i);
        if (newChar >= 'A' && newChar <= 'Z') {
            newChar += 32;
        }

        if (newChar == ' ') {
            capitalizeNext = true;
        } else {
            if (capitalizeNext) {
                newChar -= 32;
                capitalizeNext = false;
            }
            finalStr += newChar;
        }
    }

    return finalStr;
}

    public static String camelCase (String string) {
        String newStr1 = "" ;
        String finalStr = "" ; 

        for ( int i = 0 ; i < string.length() ; i++ ){
            char newChar = string.charAt(i) ;
            if ( newChar >= 'A' && newChar <= 'Z' ){
                newChar += 32; 
            }
            newStr1 += newChar ; 
        } 
        if (newStr1 != "" ){
            finalStr += newStr1.charAt(0);
        }

        for ( int j = 1 ; j < newStr1.length() ; j++ ){

            char newCharfinal = newStr1.charAt(j - 1) ;
            char newCharfinal1 = newStr1.charAt( j ) ; 
            if (newCharfinal == ' ' && j != 1 || newCharfinal1 == ' ' && j != 1 ) {
                newCharfinal1 -= 32 ;
            } 
            finalStr += newCharfinal1 ;
        }

        return finalStr;
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
