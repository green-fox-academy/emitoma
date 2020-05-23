package loops;

public class DrawDiamond {

    static int diamondHeight = 7;
    static String star = "*";
    static String space = " ";

    public static void main(String[] args) {
        // First half (1-3 rows)
        //(n+1)/2
        int firstHalfLimit = (diamondHeight + 1) / 2;
        // loop
        for (int i = 0; i < firstHalfLimit; i++) {
            // number of stars
            printRow(i);
        }
        // Second half (4-5 rows)
        int secondHalfLimit = diamondHeight - firstHalfLimit;
        //loop
        for (int i = secondHalfLimit - 1; i >= 0; i--) {
            printRow(i);
        }
    }

    private static void printRow(int rows) {
        int starCounter = (rows * 2) + 1;
        int spaceCounter = (diamondHeight - starCounter) / 2;
        System.out.println(space.repeat(spaceCounter) + star.repeat(starCounter));
    }
}
