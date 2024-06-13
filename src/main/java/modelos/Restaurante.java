package modelos;

public class Restaurante {

  private Integer idRestaurante;
  private String nit;
  private String nombre;

  // constructores

  public Restaurante(Integer idRestaurante, String nit, String nombre) {
    this.idRestaurante = idRestaurante;
    this.nit = nit;
    this.nombre = nombre;
  }

  public Restaurante() {}

  // getters y setters

  public int getIdRestaurante() {
    return idRestaurante;
  }

  public void setIdRestaurante(int idRestaurante) {
    this.idRestaurante = idRestaurante;
  }

  public String getNit() {
    return nit;
  }

  public void setNit(String nit) {
    this.nit = nit;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
}
