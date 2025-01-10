package PatternProblem;

public class Inverted_Rotated_Half_Pyramid {
    public static void InvertedRotatedHalfPyramid(int row){
        for(int i=1;i<=row;i++){
            for(int j=1;j<=(row-i);j++){
                System.err.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        InvertedRotatedHalfPyramid(4);
    }
}
