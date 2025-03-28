package t3_sub1.estruturas_de_repeticao;
import java.util.Scanner;
public class MenuDeOperacoesAritmeticas {
    public static void main(String[] args) {
        //declaração de variáveis
        String menu = "1-Soma\n2-Subtração\n3-Multiplicação\n4-Divisão\n5-Sair";
        var leitor = new Scanner(System.in);
        int opcao;
        double operando1, operando2, resultado;
        do{
            System.out.println(menu);
            opcao = leitor.nextInt();
            if(opcao < 1 || opcao > 5){
                System.out.println("Opção inválida");
            }
            else if(opcao != 5){
                System.out.println("Digite o primeiro operando");
                operando1 = leitor.nextInt();
                System.out.println("Digite o segundo operando");
                operando2 = leitor.nextInt();
                switch(opcao){
                    case 1:
                        resultado = operando1 + operando2;
                        //2 + 3 = 5
                        System.out.printf(
                            "%.2f + %.2f = %.2f\n",
                            operando1, operando2, resultado
                        );
                        break;
                    case 2:
                        resultado = operando1 - operando2;
                        //3 - 2 = 1
                        System.out.println(
                            operando1 + " - " + operando2 + " = " + resultado
                        );
                        break;
                    case 3:
                        resultado = operando1 * operando2;
                        System.out.print(
                            String.format(
                                "%f * %f = %f\n",
                                operando1, operando2, resultado    
                            )
                        );
                        break;
                    case 4:
                        resultado = operando1 / operando2;
                        System.out.print(
                            operando1 + " / " + operando2 + " = " + resultado + "\n"
                        );
                        break;
                }
            }
            else{
                System.out.println("Até");
            }
        }while(opcao != 5);
    }    
}
