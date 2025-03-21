package t1_sub3.estruturas_de_selecao;

public class AnoBissexto {
    public static void main(String[] args) {
        var ano = 2400;
        // if(ano % 4 == 0 && !(ano % 100 == 0)){
        if((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)){
            System.out.println("Sim");
        }
        else{
            System.out.println("Não");
        }
        System.out.println(
            (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0) ? 
            "Sim" : 
            "Não"
        );
    }
}
