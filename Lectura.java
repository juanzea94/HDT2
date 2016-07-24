import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
 
public class Lectura {
    
    public static void main(String[] args) throws IOException {
        LeerTexto("C:\\Users\\Luis Nájera\\Desktop\\datos.txt");
        
    }
    
    public static void LeerTexto(String direccion) throws FileNotFoundException, IOException{     //Recibe la dirección.
        int cantidad_datos = 0;                         //Contador para saber la cantidad de datos.
        int numero;                                     //Variable para poder leer dato por dato.
        char espacio_blanco;                            //Esta variable se usa para eliminar los espacios en blanco.
        String salida;
        
        try{                                                    //Este while lo uso para determinar la cantida de datos del .txt(eliminando los espacios en blanco).
            FileReader fr = new FileReader (direccion);
            BufferedReader br = new BufferedReader (fr);
            while((numero=br.read())!=-1){
                espacio_blanco=(char)(numero);                  //Guarda el texto incluyendo los espacios.
                
                if (espacio_blanco !=' '){                      //Se hace un if para eliminar los espacios.
                    cantidad_datos = cantidad_datos +1;          //Se suma cada ciclo del while para saber la longitud del array.
                }
                
            }
            
        }catch (Exception ex){
        }   
        
        
        //Se llama al vector y se le ingresa la cantidad de datos del txt.
        Vector<String> pila= new Vector<>(String.class,cantidad_datos);
        
        
        //Se lee otra vez el .txt, ahora para ingresar dato por dato.
        FileReader fr = new FileReader (direccion);
        BufferedReader br = new BufferedReader (fr);    
        while((numero=br.read())!=-1){
        espacio_blanco=(char)(numero);                  //Guarda el texto incluyendo los espacios.
                
            if (espacio_blanco !=' '){                      //Se hace un if para eliminar los espacios.
                salida = String.valueOf(espacio_blanco);     //salida guarda temporalmente cada dato del .txt.
                pila.push(salida);                          //Se hace un push de cada dato.   
            }
                
        }
        System.out.println(pila.pop());                     //Se hace un pop de cada dato.
        System.out.println(pila.pop());
        System.out.println(pila.pop());
        System.out.println(pila.pop());
        
    }
}