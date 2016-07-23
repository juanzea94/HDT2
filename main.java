import java.io.IOException;
import java.util.Scanner;
/**
 *@author Luis Najera, Juan Pablo Zea
 *@place Universidad del Valle de Guatemala
 *@version 20.07.2016
 */
public class HDT2 {
    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Bienvenido Usuario");
        System.out.println("Ingrese 1 o 2");
        System.out.println("1.Hacer Operación");
        System.out.println("2.Cancelar Operación");
        String comando = teclado.nextLine();
                if(comando.equals("1")){
                    LecturaArreglo imp = new LecturaArreglo();
                    imp.LeerTexto("C:\\Users\\Luis Nájera\\Desktop\\datos.txt");
    }
    }
}
