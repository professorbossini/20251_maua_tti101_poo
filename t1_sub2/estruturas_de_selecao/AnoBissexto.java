package t1_sub2.estruturas_de_selecao;

public class AnoBissexto {
    public static void main(String[] args) {
        int ano = 2024;
        // if(ano % 4 == 0 && !(ano % 100 == 0)){
        if(ano % 4 == 0){
            if(ano % 100 == 0){
                System.out.println("Sim");
            }
            else{
                System.out.println("Não");
            }
        }
        else if(ano % 400 == 0){
            System.out.println("Sim");
        }
        else{
            System.out.println("Não");
        }
        System.out.println( teste ? v1 : v2);
        // if((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)){
        //     System.out.println("Sim");
        // }
        // else{
        //     System.out.println("Não");
        // }
    }    
}
