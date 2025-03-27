package t1_sub1.estruturas_de_repeticao;
import java.util.Scanner;
public class CalculadoraRaiz {
    public static void main(String[] args) {
        var leitor = new Scanner(System.in);
        int menu;
        double operando1, operando2, resultado;
        do{
            System.out.println("1-Soma\n2-Subtração\n3-Multiplicação\n4-Divisão\n5-Sair");
            menu = leitor.nextInt();
            if(menu <= 0 || menu > 5){
                System.out.println("Opção inválida");
            }
            else if(menu != 5){
                System.out.println("Digite o primeiro operando");
                operando1 = leitor.nextDouble();
                System.out.println("Digite o segundo operando");
                operando2 = leitor.nextDouble();
                switch(menu){                
                    case 1:
                        resultado = operando1 + operando2;
                        //1 + 2 = 3
                        System.out.printf(
                            "%.2f + %.2f = %.2f\n", 
                            operando1, operando2, resultado
                        );
                        break;
                    case 2:
                        resultado = operando1 - operando2;
                        //3 - 2 = 1
                        System.out.println(
                            String.format(
                                "%.2f - %.2f = %.2f",
                                operando1, operando2, resultado
                            )
                        );
                        // System.out.println(
                        //     operando1 + " - " + operando2 + " = " + resultado
                        // );
                        break;
                    case 3:
                        resultado = operando1 * operando2;
                        System.out.print(
                            operando1 + " * " + operando2 + " = " + resultado + "\n"
                        );
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
                    default:
                        System.out.println("Opção inválida");
                }
            }
            else{
                System.out.println("Até logo");    
            }

        }while(menu != 5); 
    }    
}
