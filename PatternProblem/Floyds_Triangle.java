package PatternProblem;

public class Floyds_Triangle {
    public static void FloydsTriangle(int n){
        int num=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++,num++){
                System.out.print(num+" ");
            }
        System.out.println();
        }
    }
    public static void main(String[] args) {
        FloydsTriangle(5);
    }
}
