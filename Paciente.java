package codigo_Hospital;

public class Paciente {
    private int identificacion;
    private String nombre;
    private int edad;
    private String genero;
    private String tipoCancer;
    private String etapa;
    private String estadoActual;

    public Paciente(int identificacion, String nombre, int edad, String genero,
                    String tipoCancer, String etapa, String estadoActual) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.tipoCancer = tipoCancer;
        this.etapa = etapa;
        this.estadoActual = estadoActual;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTipoCancer() {
        return tipoCancer;
    }

    public void setTipoCancer(String tipoCancer) {
        this.tipoCancer = tipoCancer;
    }

    public String getEtapa() {
        return etapa;
    }

    public void setEtapa(String etapa) {
        this.etapa = etapa;
    }

    public String getEstadoActual() {
        return estadoActual;
    }

    public void setEstadoActual(String estadoActual) {
        this.estadoActual = estadoActual;
    }

    // toString con StringBuilder para variar
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Paciente{id=").append(identificacion)
          .append(", nombre='").append(nombre).append('\'')
          .append(", edad=").append(edad)
          .append(", genero='").append(genero).append('\'')
          .append(", cáncer='").append(tipoCancer).append('\'')
          .append(", etapa='").append(etapa).append('\'')
          .append(", estado='").append(estadoActual).append('\'')
          .append('}');
        return sb.toString();
    }
}