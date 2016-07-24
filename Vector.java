 /**
 *@author Juan Pablo Zea, Luis Najera
 * @version 24.07.16
 * 
 */
import java.lang.reflect.Array;


/**
 * @param <T>
 */
public class Vector<T> implements Stack<T>{ 
    private T datos[];                                                          //Variable datos de tipo T para ingresar cada dato.
    private int tamaño;                                                         //Variable para definir el tamaño del vector.
    private int top;                                                            //variable para saber cuantos datos ingresaron/salieron.
    
    
    public Vector(Class<T> dato_entrada, int tamaño){                           //Constructor.
        this.tamaño = tamaño;                                                   //Se define el tamaño maximo.
        top=-1;                                                                 //Se define top como contador del ingreso de datos.
        datos=(T[]) Array.newInstance(dato_entrada, tamaño);                    //Se define una variable para el ingreso de datos.
    }
    
    
    
    @Override
    public void push(T e) {                                                     //Push, se ingresan los datos de la clase Lectura.
        if (top<tamaño-1){                                                      //Se compara que top sea menor al tamaño del vecto para no hacer un Stack Overflow.
            datos[++top]=e;                                                     //Se ingresa cada dato.
        }
    }

    @Override
    public T pop() {
        T salida=null;                                                          //Se crea una variable para imprimir la salida.
        if (top>=0){                                                            //Si top es mayor a 0 significa que hay almenos 1 dato en pila.
            salida=datos[top--];                                                //Se sacan los datos reduciendo top -1 por cada dato.
        }
        return salida;                                                          //Se retorna el valor de cada dato.
    }

    @Override
    public T peek() {
        return datos[top];                                                      //Retorna el ultimo dato en ingresar sin hacer un pop.
    }
    
}
