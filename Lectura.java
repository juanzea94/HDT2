import java.io.BufferedReader;
import java.io.FileReader;
 
public class Lectura {
    
    
    public static void LeerTexto(String direccion){
        
        try{
            FileReader fr = new FileReader (direccion);
            BufferedReader br = new BufferedReader (fr);
            int numero;
            while((numero=br.read())!=-1){
                System.out.println(""+(char)numero);
            }
        }catch (Exception ex){
        }   
    }
   
}