package PatternProblem;

public class Hollow_Rombus {
    public static void HollowRombusPattern(int row,int col){
        for(int i=1;i<=row;i++){
            for(int j=1;j<=row-i;j++){
                System.err.print(" ");
            }
            for(int j=1;j<=col;j++){
                if(i==1 || i==row ||j==1 || j==col){
                    System.err.print("*");
                }else{
                    System.err.print(" ");
                }
                
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        HollowRombusPattern(5, 5);
    }
}
