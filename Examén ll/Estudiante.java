
/**
 * Se encarga de tener los atributos de cada fragmento dentro de un respectivo parentesis. 
 *                                                                                              
 * @author (Hannsell Solís Ramíres, C07677) 
 * @version 25/11/2020
 */
public class Estudiante
{
    //Declarar variables.
    private String nombre;
    private int nota , carnet, promedio;
    Notas invocar= new Notas();

    //Constructor. 
    public Estudiante(String nombre,int nota,int carnet, int promedio){
        this.nombre=nombre;
        this.nota=nota;
        this.carnet=carnet;
        this.promedio=promedio;
    }

    public String toString(){
        return "La información del estudiante es: "+getnombre()+"/"+ getcarnet()+"/"+ getpromedio();
    }

    //Asignar la nombre.
    public String getnombre(){
        return nombre;
    }

    public void setnombre(String nombre){
        this.nombre=nombre;
    }

    //Asignar el nota.
    public int getnota(){
        return nota;
    }

    public void setnota(int nota){
        this.nota=nota;
    }

    //Asignar la carnet.
    public int getcarnet(){
        return carnet;
    }

    public void setcarnet(int carnet){
        this.carnet=carnet;
    }

    //Asignar Promedio
    public int getpromedio(){
        return promedio;
    }

    public void setpromedio(int promedio){
        this.promedio=promedio;
    }
}
