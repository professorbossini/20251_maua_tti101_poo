import java.util.Scanner;
public class DistanciaDoisPontos{
    static public void main(String args []){
        //declaração de variáveis
        //float(4 bytes) ou double(8 bytes)
        float x1, y1, x2, y2;
        //float pi = (float)3.14;//type casting
        float distancia;
        Scanner leitor = new Scanner(System.in);
        //entrada
        //input("Digite")
        System.out.println("Digite x1");
        x1 = leitor.nextFloat();
        System.out.println("Digite y1");
        y1 = leitor.nextFloat();
        System.out.println("Digite x2");
        x2 = leitor.nextFloat();
        System.out.println("Digite y2");
        y2 = leitor.nextFloat();
        //processamento
        //a ** b
        distancia = 
            (float)(Math.sqrt(Math.pow(x2 - x1, 2) + (y2 - y1) * (y2 - y1)));
        //saida
        System.out.println("Distancia: " + distancia);

    }
}