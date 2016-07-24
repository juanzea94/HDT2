 /**
 *@author Juan Pablo Zea, Luis Najera
 * @version 24.07.16
 * 
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
 
public class Lectura {
    
    public static void main(String[] args) throws IOException {                 //main.
        LeerTexto("C:\\Users\\Luis Nájera\\Desktop\\datos.txt");                //Se envia la dirección del .txt a el metodo LeerTexto.
        
    }
    
    public static void LeerTexto(String direccion) throws FileNotFoundException, IOException{     //Recibe la dirección.
        int cantidad_datos = 0;                                                 //Contador para saber la cantidad de datos.
        int numero;                                                             //Variable para poder leer dato por dato.
        char espacio_blanco;                                                    //Variable para eliminar los espacios en blanco.
        String salida;                                                          //Variable que devuelve cada dato del .txt.
        
        try{                                                    
            FileReader fr = new FileReader (direccion);
            BufferedReader br = new BufferedReader (fr);
            while((numero=br.read())!=-1){
                espacio_blanco=(char)(numero);                                  //Guarda el texto incluyendo los espacios.
                
                if (espacio_blanco !=' '){                                      //Se hace un if para eliminar los espacios.
                    cantidad_datos = cantidad_datos +1;                         //Se suma cada ciclo del while para saber la longitud del array.
                }
                
            }
            
        }catch (Exception ex){
        }   
        
        
        Posfix op = new Posfix(cantidad_datos);                                 //Se instancia la clase Posfix enviando la cantidad de datos como parametro.
        
        
        FileReader fr = new FileReader (direccion);                             //Se lee otra vez el .txt, esta vez para ingresar dato por dato.
        BufferedReader br = new BufferedReader (fr);    
        while((numero=br.read())!=-1){
        espacio_blanco=(char)(numero);                                          //Guarda el texto incluyendo los espacios.
                
            if (espacio_blanco !=' '){                                          //Se hace un if para eliminar los espacios.
                salida = String.valueOf(espacio_blanco);                        //salida guarda temporalmente cada dato del .txt.
                op.operacion(salida);                                           //Se envia cada dato a la clase Posfix.
            }
                
        }
   
        
    }
}
