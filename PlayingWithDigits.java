public class PlayingWithDigits {
    public static void main(String[] args) {

        System.out.println(digPow(46288,3));
    }

    public static long digPow(int n, int p) {
        int sumOfPowers =  0;
        //  Add all the numbers raised to their respective powers
        for(int x = 0; x < Integer.toString(n).length(); x++){
            sumOfPowers +=  Math.pow( Character.getNumericValue(Integer.toString(n).charAt(x)),p);
            p++;
        }
        if(sumOfPowers == (n * (sumOfPowers/n) )){
            return (sumOfPowers/n);
        }
        return -1;
    }

}
