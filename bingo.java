import java.util.*;

public class Bingo {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        //Variables
        int cartones[][];
        int numCarton;
        int numRandom = 0;

        //Preguntamos cuantos cartones va a querer para jugar
        System.out.print("Introduce el numero de cartones: ");
        numCarton = input.nextInt();
        cartones = new int[numCarton][15];

        //métodos para los cartones
        random(numRandom);
        fillArray(cartones);
        CheckArray(cartones);
        sortArray(cartones);
        printArray(cartones);

        //metodo para cantar la linea y el bingo
        checkLinea();

        //metodo para la generación de bolas
        GenerateBalls();


        //checkBingo(cartones);
        //poner0Array(cartones);

    }


    /**
     * Generamos los numero del 1 al 90.
     * @param num
     * @return
     */
    public static int random (int num){
        num = ((int) (1+Math.random() * 90));
        return num;
    }

    /**
     * Rellena los arrays para los cartones
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
     * checkeamos el array para que no se repita los numeros
     * @param arrayCarton
     */
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

    /**
     * Checkeamos los numeros de los cartones.
     * @param arrayCarton
     * @param num
     * @param NCarton
     * @return
     */
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
     * Ordenamos los numeros de menor a mayor para los cartones
     * @param arrayOrdenar
     */
    static void sortArray(int arrayOrdenar[][]) {
        for (int i = 0; i < arrayOrdenar.length; i++) {

            Arrays.sort(arrayOrdenar[i]);
        }
    }

    /**
     * Imprimimos los cartones en tres filas de cinco numeros
     * @param arrayImprimir
     */
    static void printArray(int arrayImprimir[][]) {
        int numerocarton = 0;

        for (int i = 0; i < arrayImprimir.length; i++) {
            System.out.println("Carton " + (i+1));
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

    /**
     * Generamos las bolas aleatoriamente del 1 al 90.
     * @return
     */
    static int GenerateBalls(){
        int bolas = 0;
        int almacenarBolas [] = new int [90];

        for (int i = 0; i < almacenarBolas.length; i++) {

            do {
                bolas = (int)(Math.random()*90+1);
            }while (checkBolas(almacenarBolas, bolas));
            almacenarBolas[i] = bolas;

            System.out.println("Bola: "+"\n"+almacenarBolas[i]);
        }

        return bolas;
    }

    /**
     * Utilizamos este metodo para meter las bolas generadas en un array
     * @param arrayGenerico
     * @param numBola
     * @return
     */
    static boolean checkBolas(int arrayGenerico[], int numBola){

        for (int i = 0; i < arrayGenerico.length; i++) {
            if(numBola == arrayGenerico[i]){
                return true;
            }
        }
        return false;
    }

    static boolean checkLinea(int cartones[][], int almacenarBolas[]) {
        boolean checkLinea = false;

        for (int e = 0; e < almacenarBolas.length; e++) {
            for (int i = 0; i < cartones.length; i++) {
                for (int j = 0; j < cartones[i].length; j++) {
                    if (almacenarBolas[e] == cartones[i][j]) {
                        cartones[i][j] = 0;
                        if (cartones[i][0] == 0 && cartones[i][1] == 0 && cartones[i][2] == 0 && cartones[i][3] == 0 && cartones[i][4] == 0) {
                            checkLinea = true;
                        } else if (cartones[i][5] == 0 && cartones[i][6] == 0 && cartones[i][7] == 0 && cartones[i][8] == 0 && cartones[i][9] == 0) {
                            checkLinea = true;
                        } else if (cartones[i][10] == 0 && cartones[i][11] == 0 && cartones[i][12] == 0 && cartones[i][13] == 0 && cartones[i][14] == 0) {
                            checkLinea = true;
                        }
                    }
                }
            }
        }
        return true;
    }
}
