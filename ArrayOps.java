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
        int maxValue = array[0] ; 
        int secondMaxValue = array[0] ; 
        for ( int i = 1 ; i <  array.length ; i++ ){
            if ( array[i] > maxValue ){
                 secondMaxValue = maxValue ;
                 maxValue = array[1] ; 
            } else if ( array[i] > secondMaxValue && array[i] < maxValue ){
                secondMaxValue = array[i];
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
       } 
       for ( int i = 0 ; i < array2.length ; i++ ){
        for ( int j = 0 ; j < array1.length ; j++){
            if ( array1[i] == array2[j]){
                check = true ;
            }
        }
    }     
        return check ;
    }

    public static boolean isSorted(int [] array) {
        // Write your code here:
        return false;
    }

}
