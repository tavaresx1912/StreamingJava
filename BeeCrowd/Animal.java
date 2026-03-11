import java.io.IOException;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Animal {
 
    public static void main(String[] args) throws IOException {
 
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
        Scanner NewScanner = new Scanner(System.in);
        String Name1 = NewScanner.nextLine();
        String Name2 = NewScanner.nextLine();
        String Name3 = NewScanner.nextLine();

        if (Name1.equals("vertebrado")) {
            if (Name2.equals("ave")) {
                if (Name3.equals("carnivoro")) {
                    System.out.println("aguia");
                } else if (Name3.equals("onivoro")) {
                    System.out.println("pomba");
                }
            } else if (Name2.equals("mamifero")) {
                if (Name3.equals("onivoro")) {
                    System.out.println("homem");
                } else if (Name3.equals("herbivoro")) {
                    System.out.println("vaca");
                }
            }
        } else if (Name1.equals("invertebrado")) {
            if (Name2.equals("inseto")) {
                if (Name3.equals("hematofago")) {
                    System.out.println("pulga");
                } else if (Name3.equals("herbivoro")) {
                    System.out.println("lagarta");
                }
            } else if (Name2.equals("anelideo")) {
                if (Name3.equals("hematofago")) {
                    System.out.println("sanguessuga");
                } else if (Name3.equals("onivoro")) {
                    System.out.println("minhoca");
                }
            }

        } 
    }
 
}