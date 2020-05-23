package loops;

public class DrawPyramid {
    public static void main(String[] args) {
        int row = 4;
        int space = row -1;
        int stars = row - space;
        for (int i = 1; i <= row; i++) {
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