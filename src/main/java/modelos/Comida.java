package modelos;

public class Comida {

  private Integer idComida;
  private String restaurante;
  private String codigo;
  private String nombre;
  private String tipoComida;
  private Integer cantidadIngredientes;
  private Float precio;

  public Comida(
    Integer idComida,
    String restaurante,
    String codigo,
    String nombre,
    String tipoComida,
    Integer cantidadIngredientes,
    Float precio
  ) {
    this.idComida = idComida;
    this.restaurante = restaurante;
    this.codigo = codigo;
    this.nombre = nombre;
    this.tipoComida = tipoComida;
    this.cantidadIngredientes = cantidadIngredientes;
    this.precio = precio;
  }

  public Comida() {}

  public Comida(
    String restaurante,
    String codigo,
    String nombre,
    String tipoComida,
    Integer cantidadIngredientes,
    Float precio
  ) {
    this.restaurante = restaurante;
    this.codigo = codigo;
    this.nombre = nombre;
    this.tipoComida = tipoComida;
    this.cantidadIngredientes = cantidadIngredientes;
    this.precio = precio;
  }

  public int getIdComida() {
    return idComida;
  }

  public void setIdComida(int idComida) {
    this.idComida = idComida;
  }

  public String getRestaurante() {
    return restaurante;
  }

  public void setRestaurante(String restaurante) {
    this.restaurante = restaurante;
  }

  public String getCodigo() {
    return codigo;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getTipoComida() {
    return tipoComida;
  }

  public void setTipoComida(String tipoComida) {
    this.tipoComida = tipoComida;
  }

  public int getCantidadIngredientes() {
    return cantidadIngredientes;
  }

  public void setCantidadIngredientes(int cantidadIngredientes) {
    this.cantidadIngredientes = cantidadIngredientes;
  }

  public float getPrecio() {
    return precio;
  }

  public void setPrecio(float precio) {
    this.precio = precio;
  }
}
