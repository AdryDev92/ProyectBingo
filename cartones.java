import java.util.Scanner;

public class cartones {

    public static void main(String[] args) {
        // Variables
        Scanner input = new Scanner(System.in);
        int cartones;

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
                }
                System.out.println();
            }

        }

    }
    }
}
