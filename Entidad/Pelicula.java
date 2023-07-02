package Entidad;

public class Pelicula {
  
  private String titulo;
  private String genero;
  private int anio;
  private double duracion;
  private int unidades;
  private String[] peliculasDisponibles;
  
  
  public Pelicula() {
  }

  public Pelicula(String titulo, String genero, int anio, double duracion, int unidades,
      String[] peliculasDisponibles) {
    this.titulo = titulo;
    this.genero = genero;
    this.anio = anio;
    this.duracion = duracion;
    this.unidades = unidades;
    this.peliculasDisponibles = peliculasDisponibles;
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getGenero() {
    return genero;
  }

  public void setGenero(String genero) {
    this.genero = genero;
  }

  public int getAnio() {
    return anio;
  }

  public void setAnio(int anio) {
    this.anio = anio;
  }

  public double getDuracion() {
    return duracion;
  }

  public void setDuracion(double duracion) {
    this.duracion = duracion;
  }

  public int getUnidades() {
    return unidades;
  }

  public void setUnidades(int unidades) {
    this.unidades = unidades;
  }

  public String[] getPeliculasDisponibles() {
    return peliculasDisponibles;
  }

  public void setPeliculasDisponibles(String[] peliculasDisponibles) {
    this.peliculasDisponibles = peliculasDisponibles;
  }
  
    
}
