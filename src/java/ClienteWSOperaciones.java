
import java.util.Scanner;

/**
 *
 * @author Orlando Daniel
 */
public class ClienteWSOperaciones {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("INTRODUZCA EL PRIMER NÚMERO: ");
        int n1 = sc.nextInt();
        
        System.out.println("INTRODUZCA EL SEGUNDO NÚMERO: ");
        int n2 = sc.nextInt(); 
        
        System.out.println("SELECCIONE LA OPERACIÓN DESEADA\n");
        System.out.println("1. SUMA\n");
        System.out.println("2. RESTA\n");
        System.out.println("3. MULTIPLICACIÓN\n");
        System.out.println("4. DIVISIÓN\n");
        
        int choice = sc.nextInt();
        
        switch (choice){
            case 1:
                System.out.println("SUMA: " + sumar(n1, n2));
                break;
            case 2: 
                System.out.println("RESTA: " + restar(n1, n2));
                break;
                
            case 3:
                System.out.println("MULTIPLICACIÓN: " + multiplicar(n1, n2));
                break;
                
            case 4: 
                System.out.println("DIVISIÓN: " + dividir(n1, n2));
                break;
            
            default:
                System.out.println("Valor incorrecto.");
                break;
                
           
        }
    }

    private static int dividir(int int1, int int2) {
        org.wscalculator.WSCalculator_Service service = new org.wscalculator.WSCalculator_Service();
        org.wscalculator.WSCalculator port = service.getWSCalculatorPort();
        return port.dividir(int1, int2);
    }

    private static int multiplicar(int int1, int int2) {
        org.wscalculator.WSCalculator_Service service = new org.wscalculator.WSCalculator_Service();
        org.wscalculator.WSCalculator port = service.getWSCalculatorPort();
        return port.multiplicar(int1, int2);
    }

    private static int restar(int int1, int int2) {
        org.wscalculator.WSCalculator_Service service = new org.wscalculator.WSCalculator_Service();
        org.wscalculator.WSCalculator port = service.getWSCalculatorPort();
        return port.restar(int1, int2);
    }

    private static int sumar(int int1, int int2) {
        org.wscalculator.WSCalculator_Service service = new org.wscalculator.WSCalculator_Service();
        org.wscalculator.WSCalculator port = service.getWSCalculatorPort();
        return port.sumar(int1, int2);
    }
    
}
