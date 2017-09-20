package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela FORMULARIO
 * @generated
 */
@Entity
@Table(name = "\"FORMULARIO\"" ,uniqueConstraints=@UniqueConstraint(columnNames={
"email" }))
@XmlRootElement
public class Formulario implements Serializable {

  /**
   * UID da classe, necessário na serialização 
   * @generated
   */
  private static final long serialVersionUID = 1L;
  
  /**
   * @generated
   */
  @Id
  @Column(name = "id", nullable = false, insertable=true, updatable=true)
  private java.lang.String id = UUID.randomUUID().toString().toUpperCase();
  
  /**
  * @generated
  */
  @Column(name = "email", nullable = false, unique = true, insertable=true, updatable=true)
  private java.lang.String email;
  
  /**
  * @generated
  */
  @Column(name = "mensagem", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String mensagem;
  
  /**
   * Construtor
   * @generated
   */
  public Formulario(){
  }

  
  /**
   * Obtém id
   * return id
   * @generated
   */
  public java.lang.String getId(){
    return this.id;
  }
  
  /**
   * Define id
   * @param id id
   * @generated
   */
  public Formulario setId(java.lang.String id){
    this.id = id;
    return this;
  }
  
  /**
   * Obtém email
   * return email
   * @generated
   */
  public java.lang.String getEmail(){
    return this.email;
  }
  
  /**
   * Define email
   * @param email email
   * @generated
   */
  public Formulario setEmail(java.lang.String email){
    this.email = email;
    return this;
  }
  
  /**
   * Obtém mensagem
   * return mensagem
   * @generated
   */
  public java.lang.String getMensagem(){
    return this.mensagem;
  }
  
  /**
   * Define mensagem
   * @param mensagem mensagem
   * @generated
   */
  public Formulario setMensagem(java.lang.String mensagem){
    this.mensagem = mensagem;
    return this;
  }
  
  /**
   * @generated
   */ 
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Formulario object = (Formulario)obj;
    if (id != null ? !id.equals(object.id) : object.id != null) return false;
    return true;
  }
  
  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }
  
}