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

  public Comida consultarComida(Integer id) {
    Comida objComida = null;

    WebTarget target = client.target(this.endPoint + "/find/" + id);
    objComida =
      target.request(MediaType.APPLICATION_JSON_TYPE).get(Comida.class);
    return objComida;
  }

  public Comida registrarComida(Comida objComidaRegistar) {
    Comida objComida = null;
    WebTarget target = client.target(this.endPoint);
    Entity<Comida> data = Entity.entity(
      objComidaRegistar,
      MediaType.APPLICATION_JSON_TYPE
    );
    objComida =
      target.request(MediaType.APPLICATION_JSON_TYPE).post(data, Comida.class);
    return objComida;
  }

  public Comida actualizarComida(Comida objComidaActualizar, Integer id) {
    Comida objComida = null;
    WebTarget target = client.target(this.endPoint + "/" + id);
    Entity<Comida> data = Entity.entity(
      objComidaActualizar,
      MediaType.APPLICATION_JSON_TYPE
    );
    objComida =
      target.request(MediaType.APPLICATION_JSON_TYPE).put(data, Comida.class);

    return objComida;
  }

  public Boolean eliminarComida(Integer id) {
    Boolean bandera = false;
    WebTarget target = client.target(this.endPoint + "/" + id);
    bandera =
      target.request(MediaType.APPLICATION_JSON_TYPE).delete(Boolean.class);
    return bandera;
  }

  public Boolean consultarSiExisteComida(Integer id) {
    Boolean bandera;
    WebTarget target = client.target(
      this.endPoint + "/consultarSiExiste/" + id
    );
    bandera =
      target.request(MediaType.APPLICATION_JSON_TYPE).get(Boolean.class);
    return bandera;
  }

  public Boolean consultarSiExisteComidaPorCorreo(String correo) {
    Boolean bandera;
    WebTarget target = client.target(
      this.endPoint + "/consultarSiExistePorCorreo/" + correo
    );
    bandera =
      target.request(MediaType.APPLICATION_JSON_TYPE).get(Boolean.class);
    return bandera;
  }
}
