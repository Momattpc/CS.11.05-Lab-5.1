public class ArrayUtility {

    public static void print(int[] array) {

    }

    public static int sum(int[] array) {
        int result = 0;
        for (int i = 0; i < array.length; i++){
            result += array[i];
        }

        return result;
    }

    public static double average(int[] array) {
        double result = 0;
        for (int i = 0; i < array.length; i++){
            result += array[i];
        }
        double avg = result/array.length;
        String check = String.valueOf(avg);
        int sto = 0;
        for (int i = 0; i < check.length(); i++){
            if (check.charAt(i) == '.'){
                sto = i;
                break;
            }
        }
        String done = check;
        if (check.length() > 5){
            done = check.substring(0,sto+3);
        }


        if (done.charAt(done.length() -1) == '0'){
            done = done.substring(0,done.length()-1);
        }
        double fin = Double.valueOf(done);
        return fin;
    }

    public static int minimum(int[] array) {
        int result = array[0];
        for (int i = 0; i < array.length; i++){
            if (array[i] < result) {
                result = array[i];
            }
        }

        return result;


    }

    public static int maximum(int[] array) {
        int result = array[0];
        for (int i = 0; i < array.length; i++){
            if (array[i] > result) {
                result = array[i];
            }
        }

        return result;
    }

    public static int evenCount(int[] array) {
        int result = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] % 2 == 0 ) {
                result++;
            }
        }

        return result;
    }

    public static int[] reverseOne(int[] array) {
        int [] reversedOne = array;
        reversedOne = new int [array.length];
        if (array.length > 1){

            for (int i = 0; i < array.length; i++){
                reversedOne[i] = array[array.length-1-i];
            }
        }

        return reversedOne;
    }

    public static void reverseTwo(int[] array) {
        int[] reversedTwo;
        reversedTwo = new int[array.length];
        if (array.length > 1) {

            for (int i = 0; i < array.length; i++) {
                reversedTwo[i] = array[array.length - 1 - i];
            }

        }

        for (int j = 0; j < array.length; j++) {
            array[j] = reversedTwo[j];
        }
    }

    public static boolean linearSearchInt(int[] array, int num) {
        for (int i = 0; i < array.length; i++){
            if (array[i] == num){
                return true;
            }
        }
        return false;
    }

    public static boolean linearSearchString(String[] array, String str) {
        for (int i = 0; i < array.length; i++){
            if (array[i].equals(str)){
                return true;
            }
        }
        return false;
    }

    public static void multiplyByTwo(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] *2;
        }
    }

    public static void multiplyByN(int[] array, int n) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] *n;
        }
    }

    public static String toString(int[] array) {
        String output = "";
        for (int i = 0; i < array.length; i++){
            if (i == array.length-1){
                output += String.valueOf(array[i]);
            }
            else {
                output += String.valueOf(array[i]) + "," + " ";
            }

        }
        return output;
    }

    public static boolean twoSum(int[] array, int num) {
        for (int i = 0; i < array.length/2; i++){
            for (int j = 1; j < array.length -1; j++){
                if (array[i] + array[j] == num){
                    return true;
                }
            }
        }
        return false;
    }

    public static void shiftRight(int[] array) {
        int notSplice[];
        notSplice = new int[array.length];
        notSplice[0] = array[array.length-1];
        for (int i = 0; i < array.length -1; i++){
            notSplice[i+1] = array[i];

        }
        for (int j = 0; j < array.length; j++){
            array[j] = notSplice[j];
        }




    }

    public static void shiftLeft(int[] array) {
        int notSplice[];
        notSplice = new int[array.length];
        notSplice[notSplice.length-1] = array[0];
        for (int i = 0; i < array.length -1; i++){
            notSplice[i] = array[i+1];

        }
        for (int j = 0; j < array.length; j++){
            array[j] = notSplice[j];
        }
    }

    public static void shiftRightNTimes(int[] array, int n) {
        int notSplice[];
        notSplice = new int[array.length];

        for (int i = 0; i < array.length; i++){
            if (i+n > array.length){
                int residue = i+n-array.length;
                notSplice[0 + residue] = array[i];
            }
            else if (i+n == array.length){
                notSplice[0] = array[i];
            }
            else{
                notSplice[i+n] = array[i];
            }

        }
        for (int j = 0; j < array.length; j++){
            array[j] = notSplice[j];
        }
    }

    public static void shiftLeftNTimes(int[] array, int n) {
        int notSplice[];
        notSplice = new int[array.length];

        for (int i = 0; i < array.length; i++){
            if (i-n < 0){
                int residue = (i-n)*-1;
                notSplice[array.length - residue] = array[i];
            }
            else if (i-n == 0){
                notSplice[0] = array[i];
            }
            else{
                notSplice[i-n] = array[i];
            }

        }
        for (int j = 0; j < array.length; j++){
            array[j] = notSplice[j];
        }
    }


}
