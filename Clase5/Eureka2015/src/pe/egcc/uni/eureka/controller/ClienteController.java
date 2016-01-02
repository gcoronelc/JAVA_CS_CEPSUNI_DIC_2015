package pe.egcc.uni.eureka.controller;

import java.util.List;
import pe.egcc.uni.eureka.model.ClienteModel;
import pe.egcc.uni.eureka.service.ClienteService;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @email gcoronelc@gmail.com
 * @blog gcoronelc.blogspot.com
 * @date 26/12/2015
 *
 */
public class ClienteController {

  private ClienteService clienteService;

  public ClienteController() {
    clienteService = new ClienteService();
  }

  public List<ClienteModel> buscar(String criterio) {
    return clienteService.buscar(criterio);
  }

}
