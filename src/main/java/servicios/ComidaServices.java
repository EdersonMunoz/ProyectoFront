package servicios;

import java.util.List;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import modelos.Comida;
import org.glassfish.jersey.jackson.JacksonFeature;

public class ComidaServices {

  private String endPoint;
  private Client client;

  public ComidaServices() {
    this.endPoint = "http://localhost:7000/api/comidas";
    client = ClientBuilder.newClient().register(new JacksonFeature());
  }

  public List<Comida> listarComidas() {
    List<Comida> listaComidas = null;
    WebTarget target = client.target(this.endPoint + "/list");
    listaComidas =
      target
        .request(MediaType.APPLICATION_JSON)
        .get(new GenericType<List<Comida>>() {});
    return listaComidas;
  }

  public Comida consultarComida(String codigo) {
    Comida objComida = null;

    WebTarget target = client.target(this.endPoint + "/find/" + codigo);
    objComida =
      target.request(MediaType.APPLICATION_JSON_TYPE).get(Comida.class);
    return objComida;
  }

  public Comida registrarComida(Comida objComida) {
    Comida objComidaResponse = null;
    WebTarget target = client.target(this.endPoint + "/save");
    Entity<Comida> data = Entity.entity(
      objComida,
      MediaType.APPLICATION_JSON_TYPE
    );
    objComidaResponse =
      target.request(MediaType.APPLICATION_JSON_TYPE).post(data, Comida.class);
    return objComidaResponse;
  }

  public Comida actualizarComida(Comida objComida) {
    Comida objComidaResponse = null;
    WebTarget target = client.target(this.endPoint + "/update");
    Entity<Comida> data = Entity.entity(
      objComida,
      MediaType.APPLICATION_JSON_TYPE
    );
    objComidaResponse =
      target.request(MediaType.APPLICATION_JSON_TYPE).put(data, Comida.class);

    return objComidaResponse;
  }

  public Boolean eliminarComida(String codigo) {
    Boolean bandera = false;
    WebTarget target = client.target(this.endPoint + "/delete/" + codigo);
    bandera =
      target.request(MediaType.APPLICATION_JSON_TYPE).delete(Boolean.class);
    return bandera;
  }

  public Boolean consultarSiExisteComida(String codigo) {
    Boolean bandera;
    WebTarget target = client.target(this.endPoint + "/exist/" + codigo);
    bandera =
      target.request(MediaType.APPLICATION_JSON_TYPE).get(Boolean.class);
    return bandera;
  }
}
