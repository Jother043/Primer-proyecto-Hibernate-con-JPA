import jakarta.persistence.*;

@Entity
public class ConsolaDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idConsolaDetails;
    private String procesador;
    private String memoriaRam;
    private String almacenamiento;
    private boolean cuatrok;
    private boolean hdr;

    public ConsolaDetails() {

    }

    public ConsolaDetails(int idConsolaDetails, String procesador, String memoriaRam, String almacenamiento, boolean cuatrok, boolean hdr) {
        this.idConsolaDetails = idConsolaDetails;
        this.procesador = procesador;
        this.memoriaRam = memoriaRam;
        this.almacenamiento = almacenamiento;
        this.cuatrok = cuatrok;
        this.hdr = hdr;
    }

    public int getIdConsolaDetails() {
        return idConsolaDetails;
    }

    public void setIdConsolaDetails(int idConsolaDetails) {
        this.idConsolaDetails = idConsolaDetails;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(String memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public String getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(String almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public boolean getCuatrok() {
        return cuatrok;
    }

    public void setCuatrok(boolean cuatrok) {
        this.cuatrok = cuatrok;
    }

    public boolean getHdr() {
        return hdr;
    }

    public void setHdr(boolean hdr) {
        this.hdr = hdr;
    }




}
