import java.util.ArrayList;
public class Insecto {
    private String nombre;
    private int energia;
    public Insecto(String nombre){
        this.energia=0;
        this.nombre="Cleoptero";
    }
    public boolean pica(fruto frutapica){
            if(frutapica.getPicado()==false){
                this.energia=this.energia+2;
                return true;
            }
            else{
                return false; 
            }
    }
    public Insecto mitosis(){
        if(this.energia>=10)
        {
            this.energia=this.energia-5;
            Insecto nuevo_insecto=new Insecto(this.nombre);
            return nuevo_insecto;
        }
        return null;
    }
    public void cazado(){
        this.energia=0;
    }
    public int getEnergia(){
        return this.energia;
    }
    public String getNombre(){
        return this.nombre;
    }
}
