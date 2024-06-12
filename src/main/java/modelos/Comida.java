
package modelos;

import java.io.Serializable;

public class Comida  implements  Serializable
{
   private int codigo;
   private String nombre;
   private int tipoComida;
   private int cantidadIngredientes;
   private float valor;

    public Comida(int codigo, String nombre,int tipo, int cantidadIngredientes, float valor) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.tipoComida=tipo;
        this.cantidadIngredientes = cantidadIngredientes;
        this.valor = valor;
    }

   

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public int getCantidadIngredientes() {
        return cantidadIngredientes;
    }

    public void setCantidadIngredientes(int cantidadIngredientes) {
        this.cantidadIngredientes = cantidadIngredientes;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getTipoComida() {
        return tipoComida;
    }

    public void setTipoComida(int tipoComida) {
        this.tipoComida = tipoComida;
    }

    
    
}


