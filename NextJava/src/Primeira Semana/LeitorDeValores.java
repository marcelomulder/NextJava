import java.util.Scanner;

public class LeitorDeValores {
    public static void main(String[] args) {
        int numeroUm = 9;
        int numeroDois = 10;
        int numeroTres = 7;

        boolean valorValido = false;
        int numero = 0;

        while(!valorValido) {
            try {
                System.out.print("Informe um numero: ");
                Scanner leitor = new Scanner(System.in);
                numero = leitor.nextInt();
                leitor.close();
                valorValido = true;
                
            } catch (Exception e) {
                System.out.println("Valor invalido!");
            }
        }
        

        System.out.println("Valor "+ numero + " valido!");

        if (numeroUm > numeroDois) {
            if(numeroDois > numeroTres) {
                System.out.println(
                    numeroUm + " - " + 
                    numeroDois + " - " + 
                    numeroTres
                );
            } else if(numeroUm > numeroTres) {
                System.out.println(
                    numeroUm + " - " + 
                    numeroTres + " - " + 
                    numeroDois
                );
            } else {
                System.out.println(
                    numeroTres + " - " + 
                    numeroUm + " - " + 
                    numeroDois
                );
            }
        } else {
            if(numeroDois > numeroTres) {
                System.out.println(
                    numeroDois + " - " + 
                    numeroUm + " - " + 
                    numeroTres
                );
            } else if(numeroUm > numeroTres) {
                    System.out.println(
                        numeroDois + " - " + 
                        numeroTres + " - " + 
                        numeroUm
                    );
                } else {
                System.out.println(
                    numeroTres + " - " + 
                    numeroDois + " - " + 
                    numeroUm
                );
            }
        }
    }
}