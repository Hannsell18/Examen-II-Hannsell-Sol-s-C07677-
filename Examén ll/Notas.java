import java.util.Scanner;
/**
 * Se encarga de insertar nodos e imprimirlos de manera recursiva. 
 * 
 * @author Hannsell Solís Ramírez.
 * @version 21/11/2020
 */
public class Notas
{
    //Inicializar Apuntadores
    //Cabeza de la cola.
    Nodo2 primero;
    //Cola de la cola.
    Nodo2 ultimo;
    //Inicializar el escaner
    Scanner sc=new Scanner(System.in);
    public Notas()
    {
        primero=null;
        ultimo= null;
    }

    public void insertarNodo()
    {
        //Llamar la clase Nodo.
        Nodo2 nuevo= new Nodo2();
        //Preguntar los valores de entrada. 
        System.out.println("Ingrese el numero que desea guardar ;)");
        nuevo.dato=sc.nextInt();
        if(primero==null)
        {
            //Se coloca el primer valor.
            primero=nuevo;
            primero.siguiente=null;
            ultimo=nuevo;
        }else{
            //Una vez que ya el primer lugar no sea null.

            //Un nodo que es ultimo y apunta al siguiente, ahora debe apuntar al nuevo.
            ultimo.siguiente=nuevo; 
            //Nuevo que tiene un apuntador hacia el siguiente, apunte a null.
            nuevo.siguiente=null; 
            //Ultimo será el nuevo.
            ultimo=nuevo;
        }
    }

    public void preparar()
    {
        //Preparar el nodo actual (fuera del metodo recursivo para evitar que se reinicie.)
        Nodo2 actual=new Nodo2();
        actual=primero;
        int Total=actual.dato;
        Sumar(actual, Total);
    }
    public int total;

    public void Sumar(Nodo2 actual, int Total){
        //Verificar si hay nodos en la cola.

        if (primero!=null)
        {
            if(actual!=null){
                
                int dato2=actual.dato;
                
                if(actual.siguiente!=null){ 
                    actual=actual.siguiente;
                    total= total+dato2; 
                    Sumar(actual, Total);

                }
                if(actual.siguiente==null){
                    System.out.println(total);
                }
            }
        }else{
            System.out.println("VACÍO...Ingresa números enteros, por favor");
        }

    }

        
}

