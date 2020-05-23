package loops;

public class DrawChessTable {
    public static void main(String[] args) {
        for (byte i = 0; i < 8; i++) {
            for (byte j = 0; j < 8; j++) {
                boolean even = ((j + i) % 2 == 0);
                char symbol = even ? ' ' : '%';

                System.out.print(symbol);

//                boolean jEven = ((j % 2) == 0);
//                boolean iEven = ((i % 2) == 0);
//                if (iEven) {
//                    if (jEven) {
//                        System.out.print(" ");
//
//                    } else {
//                        System.out.print("%");
//                    }
//                } else {
//                    if (jEven) {
//                        System.out.print("%");
//
//                    } else {
//                        System.out.print(" ");
//                    }
//                }


            }
            System.out.println();
        }
    }
}
