package codigo_Hospital;

public class Tratamiento {
    private int identificacion;
    private String nombreTratamiento;
    private int duracionDias;
    private String efectosSecundarios;

    public Tratamiento(int identificacion, String nombreTratamiento, int duracionDias, String efectosSecundarios) {
        this.identificacion = identificacion;
        this.nombreTratamiento = nombreTratamiento;
        this.duracionDias = duracionDias;
        this.efectosSecundarios = efectosSecundarios;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public String getnombreTratamiento() {
        return nombreTratamiento;
    }

    public void setnombreTratamiento(String nombreTratamiento) {
        this.nombreTratamiento = nombreTratamiento;
    }

    public int getduracionDias() {
        return duracionDias;
    }

    public void setduracionDias(int duracionDias) {
        this.duracionDias = duracionDias;
    }

    public String getefectosSecundarios() {
        return efectosSecundarios;
    }

    public void setefectosSecundarios(String efectosSecundarios) {
        this.efectosSecundarios = efectosSecundarios;
    }

    // Calcular eficacia con if-else anidados de otra manera
    public double calcularEficacia(String tipoCancer) {
        double eficacia = 50.0; // valor por defecto

        if (nombreTratamiento.equals("Quimioterapia")) {
            if (tipoCancer.equals("Leucemia")) {
                eficacia = 85.0;
            }
        } else if (nombreTratamiento.equals("Radioterapia")) {
            if (tipoCancer.equals("Sarcoma")) {
                eficacia = 70.0;
            }
        }
        return eficacia;
    }

    @Override
    public String toString() {
        return "Tratamiento{" +
                "id=" + identificacion +
                ", nombre='" + nombreTratamiento + '\'' +
                ", días=" + duracionDias +
                ", efectos='" + efectosSecundarios + '\'' +
                '}';
    }
}