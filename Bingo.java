import java.util.Scanner;
import java.util.Arrays;

public class Bingo {

    public static void main(String[] args) {
        // Variables
        Scanner input = new Scanner(System.in);
        int cartones, cont=0;

        System.out.println("Introduzca el número de cartones que desea: ");
        cartones = input.nextInt();

        int numeroCartones[]= new int[cartones];
        
            System.out.println("Has seleccionado " + "[" + cartones + "]" + " carton/es");

            System.out.println("\n!Empieza el bingo!");

            int CartonesNumeros[][] = new int [3][5];

            for (int i = 0; i < CartonesNumeros.length; i++) {
                for (int j = 0; j < CartonesNumeros[i].length; j++) {
                    CartonesNumeros[i][j] = (int)(1+Math.random()*90);

                   System.out.printf("%3d ",CartonesNumeros[i][j]);
                     cont++;
                        if (cont==5){
                        System.out.println();

                            cont=0;
                        }
                }
                System.out.println();
            }

    }
}
