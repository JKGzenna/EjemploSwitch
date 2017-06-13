package ejemploswitch;

/**
 *
 * @author JUAN
 */
public class EjemploSwitch {

    public static void main(String[] args) {
        
        int a = 1;
      //int a = 2;
      //int a = 3;
      //int a = 7;
        
        switch( a ){
            
            case 1:
                System.out.println("Este es el caso 1");
            break;
            case 2:
                System.out.println("Este es el caso 2");
            break;
            case 3:
                System.out.println("Este es el caso 3");
            break;
            default:
                System.out.println("No hay coindidencia");
            break;
            
            /* 
               Si quitamos un break ejecutará las instrucciones que se encuentre 
               hasta que llegue a otro break, por ejemplo si quitamos el break del 
               caso 2 nos dará el caso 2 y el caso 3 frenando en el break del 3 
               En el caso de que le metamos un valor de a que no este contemplado 
               en ningún caso nos acudirá al default con el mensaje que le demos,
               en caso de no meter el default no pasará nada, simplemente que 
               nuestro programa no nos informará de nada
            */
                    
        }
    }
    
}
