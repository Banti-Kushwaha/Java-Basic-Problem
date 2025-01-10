package Function;

public class DecimalNoToBinary {
    public static void decinaltobinary(int n){
        int decNum=n;
        int pow=0;
        int binNum=0;
        int rem;
        while(n>0){
            rem=n % 2;
            binNum=binNum+(rem * (int)Math.pow(10, pow));
            pow++;
            n =n/2;
        }
        System.out.println("Binary of:"+decNum+" = "+binNum);
    }
    public static void main(String args[]){
        decinaltobinary(8);

    }
}
