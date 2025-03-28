package t1_sub2.estruturas_de_repeticao;

public class CalculosEstatisticos {
    public static void main(String[] args) {
        int n;
        int maior = 0;
        //nome completamente qualificado da classe Scanner
        //fully qualified name
        var leitor = new java.util.Scanner(System.in);
        //acumulador
        int soma = 0;
        //p + 0 = p
        do{
            System.out.println("Digite mais um número");
            n = leitor.nextInt();
            if(n > 0){
                // soma = soma + n;
                soma += n;
                // if(n > maior)
                //     maior = n;
                maior = n > maior ? n : maior;

            }
        }while(n > 0);
        System.out.println("Soma: " + soma);
        if(maior != 0)
            System.out.println("Maior: " + maior);
    }    
}
