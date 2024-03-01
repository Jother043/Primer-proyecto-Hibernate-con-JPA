import jakarta.persistence.Embeddable;

@Embeddable
public class Direccion {

    private String calle;
    private String localidad;
    private String provincia;
    private int cp;

    public Direccion() {

    }

    public Direccion(String calle, String localidad, String provincia, int cp) {
        this.calle = calle;
        this.localidad = localidad;
        this.provincia = provincia;
        this.cp = cp;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public int getCp() {
        return cp;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

}
