public class ArrayOps {
    public static void main(String[] args) {
        
    }
    
    public static int findMissingInt (int [] array) {
        
        int sumFullArray = 0 ;
        int sumArray = 0 ;  
        for (  int i = 0 ; i < array.length; i ++ ){
            sumArray += array[i];
        }
        for ( int i = 1; i <= array.length; i++ ){
            sumFullArray += i ;
        }
        int missInteg = sumFullArray - sumArray ; 
        return missInteg;
    }

    public static int secondMaxValue(int [] array) {
        int maxValue = 0 ; 
        int secondMaxValue = 0 ; 
        if ( array[0] >= array[1]){
            maxValue = array[0] ;
            secondMaxValue = array[1] ;
        } else {
            maxValue = array[1] ;
            secondMaxValue = array[0] ;
        }
        for ( int i = 2 ; i <  array.length ; i++ ){
            if ( array[i] > secondMaxValue && array[i] < maxValue ){
                 secondMaxValue = array[i] ;
            } else if ( array[i] >= maxValue){
                secondMaxValue = maxValue ;
                maxValue = array[i];
            }
        }
        return secondMaxValue ;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
      boolean check = false ;

       for ( int i = 0 ; i < array1.length ; i++ ){
        for ( int j = 0 ; j < array2.length ; j++){
            if ( array1[i] == array2[j]){
                check = true ;
            }
        }
        if ( check == false ){
            return false ; 
        }
        check = false ; 

       } 

       for ( int i = 0 ; i < array2.length ; i++ ){
        for ( int j = 0 ; j < array1.length ; j++){
            if ( array1[i] == array2[j]){
                check = true ;
            }
        }
        if (!check){
            return false ; 
        }
    }     
        return true ;
    }

    public static boolean isSorted(int [] array) {
        // Write your code here:
        return false;
    }

}
