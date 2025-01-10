package Function;

public class PrimeNoInRange {
    public static boolean optimalprime(int num){
        for(int i=2;i<Math.sqrt(num);i++){
            if(num%2==0){
                return false;
            }
        }
        return true;
    }
    public static void range(int num){
        for(int i=2;i<num;i++){
            if(optimalprime(i)){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        range(10);
    }
}
