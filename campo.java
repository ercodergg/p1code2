import java.util.ArrayList;
public class campo {
    private String nombre="Cleoptero";
    public int[][] parcela;
    public int contador=1;
    public int filas=0;
    public int columnas=0;
    public campo(String nombre,int[][] parcela,int contador){
        this.nombre=nombre;
        this.parcela=parcela;
        this.contador=contador;
        if(filas<0&&columnas<0){
            filas=3;
            columnas=2;
            nombre=new String[];
            contador=contador+1;
        }
    }
    public int[][] consulta(String nomfruto){
        if(nomfruto==fruto.nombre&&campo.filas!=0)
        {
            
        }
        return parcela;
    }
}



