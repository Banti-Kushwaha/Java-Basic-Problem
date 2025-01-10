package Function;

public class BinaryToDecimal {
    public static void binaryTodecimal(int binNum){
        int myNum=binNum;
        int DecNum=0;
        int Pow=0;
        while(binNum>0){
            int LastDigit=binNum%10;
            DecNum = DecNum + (LastDigit *(int) Math.pow(2,Pow));
            Pow++;
            binNum=binNum/10;
        }
        System.out.println("decimal of " + myNum + " =" +DecNum);
    }
    public static void main(String[] args) {
        binaryTodecimal(1000);
    }
}
