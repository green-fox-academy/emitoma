package loops;

public class DrawPyramid {
    public static void main(String[] args) {
        int num = 4;
        int space = num -1;
        int stars = num - space;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            space--;
            stars += 2;
            System.out.println(" ");
        }
    }
}
//    *
//   ***
//  *****
// *******