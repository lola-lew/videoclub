package Entidad;

public class Cliente {
  
  private String nombre;
  private int codigo;
  private String contacto;
  private String[] pelisAlquiladas;
  
  
  public Cliente() {
  }

  public Cliente(String nombre, int codigo, String contacto, String[] pelisAlquiladas) {
    this.nombre = nombre;
    this.codigo = codigo;
    this.contacto = contacto;
    this.pelisAlquiladas = pelisAlquiladas;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public int getCodigo() {
    return codigo;
  }

  public void setCodigo(int codigo) {
    this.codigo = codigo;
  }

  public String getContacto() {
    return contacto;
  }

  public void setContacto(String contacto) {
    this.contacto = contacto;
  }

  public String[] getPelisAlquiladas() {
    return pelisAlquiladas;
  }

  public void setPelisAlquiladas(String[] pelisAlquiladas) {
    this.pelisAlquiladas = pelisAlquiladas;
  }

  
}
