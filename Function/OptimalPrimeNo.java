package Function;

public class OptimalPrimeNo {
    public static boolean optimalprime(int num){
        for(int i=2;i<Math.sqrt(num);i++){
            if(num%2==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        optimalprime(23);
    }
}
