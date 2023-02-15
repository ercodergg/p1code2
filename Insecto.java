public class Insecto {
    private String nombre;
    private int energia;
    public Insecto(String nombre){
        energia=0;
        nombre="Cleoptero";
    }
    public boolean pica(fruto frutapica){
            if(frutapica.picado=false){
                energia=energia+2;
                return true;
            }
            else{
                return false; 
            }
    }
    public void mitosis(){
        if(energia>=10)
        {
            energia=energia-5;
            Insecto nuevo_insecto=new Insecto(nombre);
        }
    }
    public void cazado(){
        energia=0;
    }
    public int getEnergia(){
        return energia;
    }
    public String getNombre(){
        return nombre;
    }
}
