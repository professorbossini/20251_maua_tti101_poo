package t3_sub2.estruturas_de_selecao;

import java.util.Scanner;

public class IfESuasVariacoes {
    public static void main(String[] args) {
        // Scanner leitor = new Scanner(System.in);
        var leitor = new Scanner(System.in);
        double nota;
        
        System.out.println("Digite  a nota");
        nota = leitor.nextDouble();
        //if/else aninhado (ninho, nest, nested)
        if(nota >= 9){
            System.out.println("A");
        }
        else{
            if(nota >= 8){
                System.out.println("B");
            }
            else{
                if(nota >= 7){
                    System.out.println("C");
                }
                else{
                    System.out.println("Estudar um pouco mais");
                }    
            }
        }

        
        System.out.println("Fim do programa...");
    }
}
// if/else encadeado
// if (nota >= 9) {
//     System.out.println("Conceito A");
//     System.out.println("Parabéns");
// } else if (nota >= 8)
//     System.out.println("Conceito B");
// else if (nota >= 7)
//     System.out.println("Conceito C");
// else
//     System.out.println("Conceito R");
// if(nota >= 6){
// System.out.println("Aprovado");
// System.out.println("Parabéns");
// }
// else{
// System.out.println("Reprovado");
// System.out.println("Estudar um pouco mais");
// }