package t1_sub3.estruturas_de_repeticao;

public class MenuDeOperacoesAritmeticas {
    public static void main(String[] args) {
        //declaração de variáveis
        //nome completamente qualificado da classe (fully qualified name)
        var leitor = new java.util.Scanner(System.in);
        int opcao;
        double operando1, operando2, resultado = -1;
        String menu = 
            "Escolha uma:\n1-Soma\n2-Subtração\n3-Multiplicação\n4-Divisão\n5-Sair";
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
                        //1 + 3 = 4
                        System.out.printf(
                            "%.2f + %.2f = %.2f\n",
                            operando1, operando2, resultado
                        );
                        break;
                    case 2:
                        //3 - 2 = 1
                        resultado = operando1 - operando2;
                        System.out.println(
                            operando1 + " - " + operando2 + " = " + resultado
                        );
                        break;
                    case 3:
                        resultado = operando1 * operando2;
                        System.out.print(
                            String.format(
                                "%.2f * %.2f = %.2f\n",
                                operando1, operando2, resultado
                            )
                        );
                        break;
                    case 4:
                        resultado = operando1 / operando2;
                        System.out.printf(
                            "%.2f / %.2f = %.2f\n",
                            operando1, operando2, resultado
                        );
                        break;
                }
            }
        }while(opcao != 5);
    }
}
