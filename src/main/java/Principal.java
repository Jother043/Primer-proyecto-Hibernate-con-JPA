import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Principal {

    public static void main(String[] args) {
        List<Consola> consolas = new ArrayList<>();
        Set<Juego> juegos = new HashSet<>();
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HiubernateJPAActividad");

        EntityManager em = emf.createEntityManager();

        //ConsolaDetails
        ConsolaDetails consolaDetails = new ConsolaDetails();
        consolaDetails.setProcesador("p1");
        consolaDetails.setMemoriaRam("12GB");
        consolaDetails.setAlmacenamiento("1TB");
        consolaDetails.setCuatrok(true);
        consolaDetails.setHdr(true);

        ConsolaDetails consolaDetails2 = new ConsolaDetails();
        consolaDetails2.setProcesador("p2");
        consolaDetails2.setMemoriaRam("32GB");
        consolaDetails2.setAlmacenamiento("2TB");
        consolaDetails2.setCuatrok(false);
        consolaDetails2.setHdr(false);

        //Consola
        Consola consola = new Consola();
        consola.setNombre("PS5");
        consola.setConsolaDetails(consolaDetails);

        Consola consola2 = new Consola();
        consola2.setNombre("PC");
        consola2.setConsolaDetails(consolaDetails2);

        consolas.add(consola);
        consolas.add(consola2);

        //Direccion
        Direccion d1 = new Direccion();
        d1.setCalle("Calle España");
        d1.setLocalidad("Isla Cristina");
        d1.setProvincia("Huelva");
        d1.setCp(21410);

        Direccion d2 = new Direccion();
        d2.setCalle("Calle baja");
        d2.setLocalidad("Isla Cristina");
        d2.setProvincia("Huelva");
        d2.setCp(21410);

        //Friki
        Friki friki1 = new Friki();
        friki1.setNombre("Jose");
        friki1.setIdConsola(consolas);
        friki1.setDireccionCasa(d1);
        friki1.setDirecionFacturacion(d2);


        //Juegos
        Juego juego = new Juego();
        juego.setNombre("Assasins Creed Valhalla");


        Juego juego2 = new Juego();
        juego2.setNombre("The witcher");


        Juego juego3 = new Juego();
        juego3.setNombre("Monster Hunter Rise");



        friki1.añadirJuego(juego);
        friki1.añadirJuego(juego2);
        friki1.añadirJuego(juego3);



        em.getTransaction().begin();

        em.persist(consolaDetails);
        em.persist(consolaDetails2);

        em.getTransaction().commit();

        em.getTransaction().begin();

        em.persist(consolaDetails);
        em.persist(consolaDetails2);

        em.getTransaction().commit();

        em.getTransaction().begin();

        em.persist(consola);
        em.persist(consola2);

        em.getTransaction().commit();

        em.getTransaction().begin();

        em.persist(juego);
        em.persist(juego2);
        em.persist(juego3);

        em.getTransaction().commit();

        em.getTransaction().begin();

        em.persist(friki1);

        em.getTransaction().commit();
        em.close();
        emf.close();

    }
}
