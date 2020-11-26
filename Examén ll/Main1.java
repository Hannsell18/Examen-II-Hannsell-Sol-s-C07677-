import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * Se encarga de invocar los metodos necesarios para poder crear una lista de números enteros e imprimirla.
 * 
 * @author Hannsell Solís Ramírez
 * @version 21/11/2020
 */
public class Main1
{

    public static void main(String []args)
    {
        String entrada= ""; 
        Notas invocar= new Notas();
        //Opciones
        while (! "c".equals (entrada)){
            entrada= JOptionPane.showInputDialog ( "Menú\n"
                + "Este programa se encarga de crear una lista de números enteros e imprimirla, de manera recursiva.\n"
                + "a. Agregar notas.\n"

                + "b. Imprimir nodos con un metodo recursivo.\n"

                + "c. SALIR");

            //Elegir entre las opciones
            switch (entrada.toLowerCase()){
                case "a":
                invocar.insertarNodo();
                break;

                case "b":
                System.out.println("Contenido: ");
                invocar.preparar();

                break;

                case "c":
                JOptionPane.showMessageDialog(null,"Notas agregadas correctamente");
                
                break;
            }

        }

    }
}