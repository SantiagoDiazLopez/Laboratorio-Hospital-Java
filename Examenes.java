package codigo_Hospital;

import java.time.LocalDate;

public class Examenes {
    private int Identifiacion;
    private LocalDate FechaExamen;
    private String TipoExamen;
    private String Resultado;

    // Constructor con orden ligeramente distinto en comentarios
    public Examenes(int Identifiacion, LocalDate FechaExamen, String TipoExamen, String Resultado) {
        this.Identifiacion = Identifiacion;
        this.FechaExamen = FechaExamen;
        this.TipoExamen = TipoExamen;
        this.Resultado = Resultado;
    }

    // Getters y Setters (mismos nombres)
    public int getIdentifiacion() {
        return Identifiacion;
    }

    public void setIdentifiacion(int Identifiacion) {
        this.Identifiacion = Identifiacion;
    }

    public LocalDate getFechaExamen() {
        return FechaExamen;
    }

    public void setFechaExamen(LocalDate FechaExamen) {
        this.FechaExamen = FechaExamen;
    }

    public String getTipoExamen() {
        return TipoExamen;
    }

    public void setTipoExamen(String TipoExamen) {
        this.TipoExamen = TipoExamen;
    }

    public String getResultado() {
        return Resultado;
    }

    public void setResultado(String Resultado) {
        this.Resultado = Resultado;
    }

    // toString con formato ligeramente diferente (uso de String.format)
    @Override
    public String toString() {
        return String.format("Examenes{identificacion=%d, fechaExamen=%s, tipoExamen='%s', resultado='%s'}",
                Identifiacion, FechaExamen, TipoExamen, Resultado);
    }
}