package StringProblem;

public class SubString{
    public static String substring(String str , int si , int en){
        String subString="";
        for(int i=si ; i<en ; i++){
            subString+=str.charAt(i);
        }
        return subString;
    }
    public static void main(String[] args) {
        String str="Hello World";
        System.out.println(substring(str, 0, 5));
    }
}