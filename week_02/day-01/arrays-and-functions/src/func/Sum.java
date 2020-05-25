package func;

public class Sum {
    public static void main(String[] args) {
        int param = 13;
        System.out.println(summerFunc(param));
    }
    public static int summerFunc (int a){
        int sum = 0;
        for (int i = 0; i <= a; i++) {
            sum += i;
        }
        return sum;
    }
}
