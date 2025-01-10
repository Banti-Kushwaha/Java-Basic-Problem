package PatternProblem;

public class Solid_Rombus_Pattern {
    public static void SolidRombusPattern(int row,int col){
        for(int i=1;i<=row;i++){
            for(int j=1;j<=row-i;j++){
                System.err.print(" ");
            }
            for(int j=1;j<=col;j++){
                System.err.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        SolidRombusPattern(5,5);
    }
}
