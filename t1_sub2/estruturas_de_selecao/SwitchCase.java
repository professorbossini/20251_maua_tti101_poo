package t1_sub2.estruturas_de_selecao;

public class SwitchCase {
    public static void main(String [] args) { //array
        var nota = Integer.parseInt(args[0]);
        if(nota >= 0 && nota <= 10){
            // fall-through
            switch(nota){
                case 10, 9:
                // case 10:
                // case 9:
                    System.out.println("A");
                    break;
                case 8:
                    System.out.println("B");
                    break;
                case 7:
                    System.out.println("C");
                    break;
                default:
                    System.out.println("Estudar um pouco mais");
                
            }
        }
        else{
            System.out.println("Nota inválida");
        }
    }    
}
