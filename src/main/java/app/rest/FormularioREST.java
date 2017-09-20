package app.rest;

import org.springframework.data.domain.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.validation.annotation.*;
import org.springframework.data.web.PagedResourcesAssembler;
import org.springframework.hateoas.PagedResources;
import org.springframework.http.*;
import org.springframework.beans.factory.annotation.*;
import java.util.*;
import app.entity.*;
import app.business.*;

/**
 * Controller para expor serviços REST de Formulario
 * 
 * @generated
 **/
@RestController
@RequestMapping(value = "/api/rest/app/Formulario")
public class FormularioREST {

  /**
   * Classe de negócio para manipulação de dados
   * 
   * @generated
   */
  @Autowired
  @Qualifier("FormularioBusiness")
  private FormularioBusiness formularioBusiness;

  /**
   * Serviço exposto para novo registro de acordo com a entidade fornecida
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.POST)
  public Formulario post(@Validated @RequestBody final Formulario entity) throws Exception {
    return formularioBusiness.post(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade fornecida
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT)
  public Formulario put(@Validated @RequestBody final Formulario entity) throws Exception {
    return formularioBusiness.put(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade e id fornecidos
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT, value = "/{formularioId}")
  public Formulario put(@Validated @RequestBody final Formulario entity, @PathVariable("formularioId") java.lang.String formularioId) throws Exception {
    return formularioBusiness.put(entity);
  }  

  /**
   * Serviço exposto para remover a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.DELETE, value = "/{formularioId}")
  public void delete(@PathVariable("formularioId") java.lang.String formularioId) throws Exception {
    formularioBusiness.delete(formularioId);
  }

  /**
   * NamedQuery list
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET)
  public HttpEntity<PagedResources<Formulario>> listParams(Pageable pageable, PagedResourcesAssembler assembler){
    return new ResponseEntity<>(assembler.toResource(formularioBusiness.list(pageable)), HttpStatus.OK);    
  }

  /**
   * Serviço exposto para recuperar a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value = "/{formularioId}")
  public Formulario get(@PathVariable("formularioId") java.lang.String formularioId) throws Exception {
    return formularioBusiness.get(formularioId);
  }
}
