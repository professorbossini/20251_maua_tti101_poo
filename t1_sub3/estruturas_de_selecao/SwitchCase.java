package t1_sub3.estruturas_de_selecao;

public class SwitchCase {
    //varargs
    public static void main(String[] args) {//array
        int nota = Integer.parseInt(args[0]);
        if(nota < 0 || nota > 10){
            System.out.println("Nota inválida");
        }
        else{
            //fall-through
            switch(nota){
                case 9, 10:
                    System.out.println("A");
                    break;
                // case 10:
                //     System.out.println("Parabéns");
                // case 9:
                //     System.out.println("A");
                //     break;
                case 8:
                    System.out.println("B");
                    break;
                case 7:
                    System.out.println("C");
                default:
                    System.out.println("Estudar um pouco mais...");
    
            }
        }
    }    
}
