import java.lang.reflect.Array;
import java.util.ArrayList;
public class campo {
    private static int contador=1;
    private String nombre;
    private fruto[][] parcela;
    public campo(int filas,int columnas){
        this.contador=this.contador;
        this.nombre = "C_" + this.contador;
        this.contador++;
        if(filas<0&&columnas<0){
            // nombre= String.valueOf(contador);
            this.parcela=new fruto[2][3];
        }
        else{
            this.parcela=new fruto[filas][columnas];
        }
    }
    public int[][] consulta(String nomfruto){
        int[][] filascolumnas=null;
        boolean hayfruto=false;
        int ii=0,jj=0;
        int contador=0;
        int nfilas=0;
        int[] columnas=null;
        for(int i=0;i<this.parcela.length;i++)//contar filas
        {
            contador=0;
            for(int j=0;j<this.parcela[i].length;j++)
            {
                if(nomfruto.equalsIgnoreCase(this.parcela[i][j].getNombre()))
                {
                    contador++;
                    if(contador==1){
                        nfilas++;
                    }
                }
            }
            filascolumnas=new int[nfilas][];
            for(i=0;i<parcela.length;i++){//contar columnas
                contador=0;
                for(int j=0;j<parcela[i].length;j++)
                {
                    if(nomfruto.equalsIgnoreCase(this.parcela[i][j].getNombre()))
                    {
                        contador++;
                    } 
                }
                if(contador>0){
                    filascolumnas[ii]=new int[contador];
                    ii++;
                }
            }
            contador=0;
            ii=0;
            for(i=0;i<filascolumnas.length;i++){//rellenar
                contador=0;
                jj=0;
                for(int j=0;j<filascolumnas[i].length;j++){
                    if(nomfruto.equalsIgnoreCase(this.parcela[i][j].getNombre())){
                        contador++;
                        if(contador==1){
                            filascolumnas[ii][0]=i;
                            ii++;
                        }
                        filascolumnas[ii][jj]=j;
                        jj++;
                    }
                }
            }
        }
        return filascolumnas;
    }
    public String consulta(int filas,int columnas)
    {
        String respuesta="\0";
        if(this.parcela[filas][columnas]!=null)
        {
            respuesta = ""+this.parcela[filas][columnas].getNombre() + parcela[filas][columnas].getMadurez();             
        }
        else
        {
            respuesta="no hay fruto";
        }
        return respuesta;
    }
    public boolean riega(int filas ,int columnas){
        boolean done=false;
        if(this.parcela[filas][columnas]!=null){
            if(parcela[filas][columnas].getPicado()==false)
            {
                done=true;
            }
        }
        return done;
    }
    public int abona(String namefruto){
        int nabonados=0;
        if(namefruto!=null){
            for(int i=0;i<this.parcela.length;i++){
                for(int j=0;j<this.parcela[i].length;j++){
                    if(this.parcela[i][j].getPicado()==false)
                    {
                        if(this.parcela[i][j].getNombre().equals(namefruto))
                        nabonados++;
                    }
                }
            }
        }
        return nabonados;
    }
    public boolean siembra(String nomfruto,int fila,int columna){
        return true;
    }
    public String getNombre(){
        return this.nombre;
    }
    public static int getContador(){
        return contador;
    }
}



