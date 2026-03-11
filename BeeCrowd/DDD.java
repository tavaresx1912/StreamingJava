import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class DDD {
 
    public static void main(String[] args) throws IOException {
 
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
        Scanner NewScanner = new Scanner(System.in);
        int A = NewScanner.nextInt();
        
        if (A == 61) {
            System.out.println("Brasilia");
        } else if (A == 71) {
            System.out.println("Salvador");
        } else if (A == 11) {
            System.out.println("Sao Paulo");
        } else if (A == 21) {
            System.out.println("Rio de Janeiro");
        } else if (A == 32) {
            System.out.println("Juiz de Fora");
        } else if (A == 19) {
            System.out.println("Campinas");
        } else if (A == 27) {
            System.out.println("Vitoria");
        } else if (A == 31) {
            System.out.println("Belo Horizonte");
        } else {
            System.out.println("DDD nao cadastrado");
        }

 
    }
 
}