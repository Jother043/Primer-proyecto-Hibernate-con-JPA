
import jakarta.persistence.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class Friki {

    //@id para indicar que es la clave primaria
    @Id
    //GeneratedValue para indicar que se genera automaticamente.
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idFriki;

    //Relacion muchos a muchos con la tabla Juego y la tabla Friki (un friki puede tener muchos juegos y un juego puede tener muchos frikis).
    @ManyToMany(targetEntity = Juego.class)
    //JoinTable para indicar la tabla intermedia que se crea para relacionar las dos tablas de la BBDD.
    @JoinTable(
        name = "FrikiHasJuego",
        joinColumns = @JoinColumn(name = "idFriki"),
        inverseJoinColumns = @JoinColumn(name = "idJuego")
    )
    Set<Juego> juegos= new HashSet<>();

    private String nombre;

    @OneToMany(targetEntity = Consola.class)
    private List<Consola> idConsola;

    @Embedded
    //Direccion es una clase que se crea para poder tener dos direcciones en la tabla Friki.
    private Direccion direccionCasa;

    /*
    Con la anotacion AttributeOverrides podemos modificar los nombres de los atributos para que aparezcan en la BBDD
    con el nombre que nos interesen como en este caso calle_Facturaccion.
     */
    @Embedded
    @AttributeOverrides(  {
            @AttributeOverride(name="calle", column = @Column(name="calle_Facturacion")),
            @AttributeOverride(name="localidad", column = @Column(name="localidad_Facturacion")),
            @AttributeOverride(name="provincia", column = @Column(name="provincia_Facturacion")),
            @AttributeOverride(name="cp", column = @Column(name="cp_Facturacion"))
    })
    private Direccion direccionFacturacion;

    public int getIdFriki() {
        return idFriki;
    }

    public void setIdFriki(int idFriki) {
        this.idFriki = idFriki;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Consola> getIdConsola() {
        return idConsola;
    }

    public void setIdConsola(List<Consola> idConsola) {
        this.idConsola = idConsola;
    }

    public Direccion getDireccionCasa() {
        return direccionCasa;
    }

    public void setDireccionCasa(Direccion direccionCasa) {
        this.direccionCasa = direccionCasa;
    }

    public Direccion getDirecionFacturacion() {
        return direccionFacturacion;
    }

    public void setDirecionFacturacion(Direccion direcionFacturacion) {
        this.direccionFacturacion = direcionFacturacion;
    }

    public void añadirJuego (Juego juego){
        this.juegos.add(juego);
        //juego.getFriki().add(this);
    }

    public Set<Juego> getJuegos() {
        return juegos;
    }


}
