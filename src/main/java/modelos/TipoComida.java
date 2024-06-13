package modelos;

public class TipoComida {

  private Integer idTipoComida;
  private String nombre;

  // constructores

  public TipoComida(Integer idTipoComida, String nombre) {
    this.idTipoComida = idTipoComida;
    this.nombre = nombre;
  }

  public TipoComida() {}

  // getters y setters

  public int getIdTipoComida() {
    return idTipoComida;
  }

  public void setIdTipoComida(int idTipoComida) {
    this.idTipoComida = idTipoComida;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
}
