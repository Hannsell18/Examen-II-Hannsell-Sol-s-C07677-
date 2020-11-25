import javax.swing.JOptionPane;
/**
 * Write a description of class Main here.
 * 
 * @author (your name) 
 * @version 22/11/2020
 */
public class Main
{
    public static void main (String []args){
        ListaEcuación l= new ListaEcuación();
        int op=0;
        do{
            String eleccion=JOptionPane.showInputDialog(null, "Agregar ecuaciones\n1-Insertar\n2-Mostrar \n 3-Salir");
            op=Integer.parseInt(eleccion);

            switch(op){
                case 1:
                {
                    String nombre;
                    int nota, carnet, promedio;
                    nombre=JOptionPane.showInputDialog(null,"Ingrese el nombre del estudiante");
                    carnet=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la nota"));
                    nota=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la nota"));                    
                    promedio= 0;
                    
                    l.insertar(new Estudiante(nombre, nota, carnet, promedio));
                    break;
                }
                
                case 2:
                {
                 l.desplegar();
                 break;
                }
                
            }
        }while(op!=3);

    }
}
