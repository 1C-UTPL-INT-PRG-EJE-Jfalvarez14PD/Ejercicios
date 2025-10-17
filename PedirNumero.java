import java.util.Scanner;
public class PedirNumero {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opc = -1;
        int num = 0;
        
        while (opc !=2){
            System.out.println("ingrese un numero");
            num = sc.nextInt();
            //Codigo
            
            System.out.println("¿Desea continuar? [1=si/2=no]");
            opc = sc.nextInt();
        }
    }
}