package t1_sub3.estruturas_de_selecao;
import java.util.Scanner;
public class IfESuasVariacoes {
    public static void main(String[] args) {


        // java 10+: var
        // operador de inferência de tipo
        var leitor = new Scanner(System.in);
        System.out.println("Digite a nota");
        var nota = leitor.nextDouble();

        if (nota >= 6);
            System.out.println("A");

        //if/else aninhado (nested)
        if(nota >= 9){
            System.out.println("A");
        }
        else{
            if(nota >= 8){
                System.out.println("B");
            }
            else{
                if (nota >= 7) {
                    System.out.println("C");    
                } 
                else {
                    System.out.println("Estudar um pouco mais");   
                }
            }
        }
        
        System.out.println("Programa acabou...");
        leitor.close();
    }   
}
// if/else encadeado
// if(nota >= 9){
//     System.out.println("A");
// }
// else if(nota >= 8)
//     System.out.println("B");
// else if(nota >= 7)
//     System.out.println("C");
// else
//     System.out.println("Estudar um pouco mais");

// if(nota >= 6);{
// }
// System.out.println("Aprovado");
// System.out.println("Parabéns");

// dangling else
// else{
//     System.out.println("Não está aprovado");
//     System.out.println("Estudar um pouco mais");
// }