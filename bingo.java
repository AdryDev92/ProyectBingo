import java.util.*;
import java.util.Arrays;

public class bingo {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int cartones[][];
        int numCarton;
        int numRandom = 0;

        System.out.print("Introduce el numero de cartones: ");
        numCarton = input.nextInt();
        cartones = new int[numCarton][15];

        //métodos para los cartones
        random(numRandom);
        fillArray(cartones);
        CheckArray(cartones);
        sortArray(cartones);
        printArray(cartones);

        //metodo para la generación de bolas
        GenerateBalls();
        checkCartones(cartones);

    }

    /**
     *
     * @param num
     * @return
     */
    public static int random (int num){
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

    static void CheckArray(int arrayCarton[][]){
        int num = 0;
        boolean check = false;

        for (int i = 0; i < arrayCarton.length; i++) {
            for (int j = 0; j < arrayCarton[i].length; j++) {

                do {
                    num = random(num);
                    check = checknumber(arrayCarton, num, i);
                }while (check == true);
                arrayCarton[i][j] = num;
            }

        }

    }

    static boolean checknumber(int arrayCarton[][], int num, int NCarton){
        boolean comprobado = false;

        for (int i = 0; i < arrayCarton[NCarton].length; i++) {
            if (num == arrayCarton[NCarton][i]){
                comprobado = true;
            }
        }
        return comprobado;
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

    static int GenerateBalls(){
        int bolas = 0;
        int almacenarBolas [] = new int [90];

        for (int i = 0; i < almacenarBolas.length; i++) {
            
                do {
                    bolas = (int)(Math.random()*90+1);
                }while (checkBolas(almacenarBolas, bolas));
            almacenarBolas[i] = bolas;
            
            System.out.println("\n"+almacenarBolas[i]);
        }

        return bolas;
    }
    
    static boolean checkBolas(int arrayGenerico[], int numBola){

        for (int i = 0; i < arrayGenerico.length; i++) {
            if(numBola == arrayGenerico[i]){
                return true;
            }
        }
        return false;
    }

    static boolean checkCartones(int Cartones[][]){

        


    }
}