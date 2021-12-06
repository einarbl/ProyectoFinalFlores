package pojos;

public class Llave {//Inicia clase
    //Atributos
     int id_llave;
     String codigo_llave;
     String categoria;
     int num_piezas;
     //Constructor vacio = METODO ESPECIAL LLAMADO IGUAL QUE LA CLASE
     public Llave(){
         
     }
     //Constructor que pasa parametros
     public Llave(int id_llave, String codigo_llave, String categoria, int num_piezas){
         this.id_llave = id_llave;
         this.codigo_llave = codigo_llave;
         this.categoria = categoria;
         this.num_piezas = num_piezas;
     }
     //Metodo s de acceso Gett y Sett

    public int getId_llave() {
        return id_llave;
    }

    public void setId_llave(int id_llave) {
        this.id_llave = id_llave;
    }

    public String getCodigo_llave() {
        return codigo_llave;
    }

    public void setCodigo_llave(String codigo_llave) {
        this.codigo_llave = codigo_llave;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getNum_piezas() {
        return num_piezas;
    }

    public void setNum_piezas(int num_piezas) {
        this.num_piezas = num_piezas;
    }
}//Termina clase

