import java.util.Scanner;
public class DistanciaDoisPontos{
    public static void main(String [] meuVetorDeStrings){
        //declaração de variáveis
        float x1, y1, x2, y2;
        float distancia;
        Scanner reader = new Scanner(System.in);
        //entrada
        //input("Digite")
        System.out.println("Digite x1");
        x1 = reader.nextFloat();
        System.out.println("Digite y1");
        y1 = reader.nextFloat();
        System.out.println("Digite x2");
        x2 = reader.nextFloat();
        System.out.println("Digite y2");
        y2 = reader.nextFloat();

        //processamento
        //Math.sqrt(n)
        // distancia = 
        // Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        //type casting
        distancia = 
            (float)(Math.pow(x2 - x1, 2) + (y2 - y1) * (y2 - y1));
        distancia = (float)(Math.sqrt(distancia));

        //saida
        System.out.println("Distância: " + distancia);

    }
}
