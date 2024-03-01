import jakarta.persistence.*;

@Entity
public class Consola {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int idConsola;

    private String nombre;
    @OneToOne
    /*
    Recogemos los detalles de la consola que se guarda en la tabla de consolaDetails,
    en el cual 1 consola tiene 1 de los detalles. En este caso el OneToOne es unidireccional.
     */
    private ConsolaDetails consolaDetails;

    public int getIdConsola() {
        return idConsola;
    }

    public void setIdConsola(int idConsola) {
        this.idConsola = idConsola;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ConsolaDetails getConsolaDetails() {
        return consolaDetails;
    }

    public void setConsolaDetails(ConsolaDetails consolaDetails) {
        this.consolaDetails = consolaDetails;
    }
}
