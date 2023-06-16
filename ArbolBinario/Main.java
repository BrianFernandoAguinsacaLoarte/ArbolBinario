import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Serie serie = new Serie();
        int posicion = 20;
        long fibonacci = serie.getFibonacci(posicion);

        System.out.println(serie);

        Map<Integer, String> valorList4 = serie.getValorList4();
        System.out.println(valorList4);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la posicion de Fibonacci");
        posicion = scanner.nextInt();
        fibonacci = serie.getFibonacci(posicion);
        System.out.println("El valor de la posicion " + posicion + " es " + fibonacci);
        scanner.close();



    }

}