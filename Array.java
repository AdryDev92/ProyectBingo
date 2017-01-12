import java.util.Scanner;

public class Array{
  public static void main(String[] args) {

    int filas,cols;

    Scanner input = new Scanner(System.in);

    int nums[][];

    System.out.println("Filas:");
    filas = input.nextInt();

    System.out.println("Columnas:");
    cols = input.nextInt();

    nums = new int [filas][cols];

    for (int i=0; i < filas ;i++ ) {
      for (int j=0; j < cols ;j++ ) {
        System.out.printf("%2d", nums[i][j]);
      }
      System.out.println();
    }




    }
  }
