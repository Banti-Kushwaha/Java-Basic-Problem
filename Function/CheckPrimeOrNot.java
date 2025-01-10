package Function;

public class CheckPrimeOrNot {
    public static boolean primeornot(int num){
        boolean isPrime=true;
        for(int i=2;i<num-1;i++){
            if(num%2==0){
            isPrime=false;
            }
        }
        return isPrime;
    }
    //we can write also this type
    public static boolean PrimeorNot(int num){
        for(int i=2;i<num-1;i++){
            if(num%2==0){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        boolean isPrime=primeornot(34);
        if(isPrime){
            System.out.print("Num is Prime:");
        }else{
            System.out.print("Num is not a Prime");
        }
    }
}
