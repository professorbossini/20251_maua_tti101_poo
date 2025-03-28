package t3_sub2.estruturas_de_repeticao;
import java.util.Scanner;
public class MenuDeCalculos {
    public static void main(String[] args) {
        var leitor = new Scanner(System.in);
        int opcao;
        String menu = 
            "1-Soma\n2-Subtração\n3-Multiplicação\n4-Divisão\n5-Sair";
        double operando1, operando2, resultado;
        do{
            System.out.println(menu);
            opcao = leitor.nextInt();
            if(opcao < 1 || opcao > 5){
                System.out.println("Opção inválida");
            }
            else if(opcao == 5){
                System.out.println("Até logo");
            }
            else{
                System.out.println("Digite o operando 1");
                operando1 = leitor.nextDouble();
                System.out.println("Digite o operando 2");
                operando2 = leitor.nextDouble();
                switch(opcao){
                    case 1:
                        resultado = operando1 + operando2;
                        //2 + 3 = 5
                        System.out.println(
                            operando1 + " + " + operando2 + " = " + resultado
                        );
                        break;
                    case 2:
                        resultado = operando1 - operando2;
                        //3 - 2 = 1
                        System.out.printf(
                            "%.2f - %.2f = %.2f\n",
                            operando1, operando2, resultado
                        );
                        break;
                    case 3:
                        resultado = operando1 * operando2;
                        String exibir = String.format(
                            "%.2f * %.2f = %.2f",
                            operando1, operando2, resultado
                        );
                        System.out.println(exibir);
                        break;
                    case 4:
                        resultado = operando1 / operando2;
                        System.out.print(
                            String.format(
                                "%.2f / %.2f = %.2f\n",
                                operando1, operando2, resultado    
                            )
                        );
                        break;
                    case 5:
                        System.out.println("Até logo");
                        break;
                    default:
                        System.out.println("Opção inválida");
                }
                // System.out.println("Resultado: " + resultado);
            }
        }while(opcao != 5);
    }    
}
