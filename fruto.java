public class fruto{
    public String nombre;
    private int madurez;
    public boolean picado;
    public boolean plantado;
    public fruto(String nombre,int madurez,boolean picado,boolean plantado){
        this.nombre=nombre;
        this.madurez=madurez;
        this.picado=picado;
        this.plantado=plantado;
    }
        public String constructor(String nombre,boolean plantado){
            if(nombre==null){
                nombre="Eversade";
                plantado=true;
                System.out.println(nombre);
            }
            return nombre;
        }
        public String getNombre(String nombre){
            return nombre;
        }
        public int getMadurez(int madurez){
            return madurez;
        }
        public boolean getPicado(boolean picado){
            return picado;
        }
        public boolean getPlantado(Boolean plantado){
            return plantado;
        }
        public void setPicado(){
            picado=true;
        }
        public void riega(boolean picado){
            if(picado=false){
                madurez=madurez+1;
            }
        }
        public void abona(boolean picado){
            picado=false;
            madurez=madurez+2;
        }
        public int procesa(String nombre,boolean picado,int madurez){
            if(nombre!=null)
            {
                int procesado;
                procesado=(nombre.length()/2)+madurez;
                if(picado==true){
                    procesado=procesado/3;
                }
                nombre=null;
                return procesado;
            }
            else{
                return 0;
            }
        }
}                