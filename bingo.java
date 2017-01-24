import java.util.*;
public class bingo {
    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int cartones[][];
        int numCarton;
        int numRandom = 0;

        System.out.print("Introduce el numero de cartones: ");
        numCarton = input.nextInt();
        cartones = new int[numCarton][15];

        random(numRandom);
        fillArray(cartones);
        sortArray(cartones);
        printArray(cartones);

    }

    /**
     *
     * @param num
     * @return
     */
    static int random (int num){
        num = ((int) (1+Math.random() * 90));
        return num;
    }

    /**
     *
     * @param cartones
     */
    static void fillArray(int cartones[][]) {
        int num = 0;

        boolean check = false;


        for (int i = 0; i < cartones.length ; i++) {
            for (int j = 0; j < cartones[i].length ; j++) {
                do {
                    num = random(num);

                }while (check == true);
                cartones[i][j] = num;
            }
        }
    }

    /**
     *
     * @param arrayOrdenar
     */
    static void sortArray(int arrayOrdenar[][]) {
        for (int i = 0; i < arrayOrdenar.length; i++) {

            Arrays.sort(arrayOrdenar[i]);
        }
    }

    /**
     *
     * @param arrayImprimir
     */
    static void printArray(int arrayImprimir[][]) {
        int numerocarton = 0;

        for (int i = 0; i < arrayImprimir.length; i++) {
            System.out.println("Carton " + i);
            for (int j = 0; j < arrayImprimir[0].length; j++) {
                System.out.print(arrayImprimir[i][j] + " ");
                numerocarton++;
                if (numerocarton == 5) {
                    System.out.println();
                    numerocarton = 0;
                }
            }
            System.out.println();
        }
    }
}


