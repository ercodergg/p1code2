import java.util.ArrayList;
public class fruto{
    private String nombre;
    private int madurez;
    private boolean picado;
    private boolean plantado;
    public fruto(String nom,int madur,boolean picat,boolean plantat){
            this.nombre=nom;
            this.madurez=madur;
            this.picado=picat;
            this.plantado=plantat;
            if(nombre==null){
                this.nombre="Eversade";
            }
            else{
                this.nombre=nom;
            }
            this.plantado=true;
    }
        public String getNombre(){
            return this.nombre;
        }
        public int getMadurez(){
            return this.madurez;
        }
        public boolean getPicado(){
            return this.picado;
        }
        public boolean getPlantado(){
            return this.plantado;
        }
        public void setPicado(){
            this.picado=true;
        }
        public void riega(){
            if(this.picado=false){
                this.madurez=this.madurez+1;
            }
        }
        public void abona(){
            this.picado=false;
            this.madurez=this.madurez+2;
        }
        public int procesa(){
            if(nombre!=null)
            {
                int procesado;
                procesado=(nombre.length()/2)+madurez;
                if(this.picado==true){
                    procesado=procesado/3;
                }
                this.nombre=null;
                return procesado;
            }
            else{
                return 0;
            }
        }
}                