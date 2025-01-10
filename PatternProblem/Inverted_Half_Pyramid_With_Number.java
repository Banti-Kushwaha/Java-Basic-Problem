package PatternProblem;

public class Inverted_Half_Pyramid_With_Number {
    public static void InvertedHalfPyramidWithNumber(int n){
        int num=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j+" ");
            }
        System.out.println();
        }
    }
    public static void InvertedHalfPyramidWithIncNumber(int n){
        int num=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++,num++){
                System.out.print(num+" ");
            }
        System.out.println();
        }
    }

    public static void main(String[] args) {
        InvertedHalfPyramidWithNumber(5);
    }
}
