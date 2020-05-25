package func;

public class AppendAFunction {
    public static void main(String[] args) {
        String typo = "chinchill";
        System.out.println(appendAFunction(typo));
    }
    public static String appendAFunction  (String input){
        String appendA = input + "a";
        return appendA;
    }
}
