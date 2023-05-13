
public class Lanzamiento {
	
	public interface Nave {
	    void despegar();
	    void aterrizar();
	}

	
	public abstract class NaveAbstracta implements Nave {
	    protected String nombre;
	    protected int capacidadPasajeros;

	    public NaveAbstracta(String nombre, int capacidadPasajeros) {
	        this.nombre = nombre;
	        this.capacidadPasajeros = capacidadPasajeros;
	    }

	    public abstract void volar();

	    public void despegar() {
	        System.out.println("La nave " + nombre + " ha despegado.");
	    }

	    public void aterrizar() {
	        System.out.println("La nave " + nombre + " ha aterrizado.");
	    }
	}

	
	public class NaveCombate extends NaveAbstracta {
	    private int numMisiles;

	    public NaveCombate(String nombre, int capacidadPasajeros, int numMisiles) {
	        super(nombre, capacidadPasajeros);
	        this.numMisiles = numMisiles;
	    }

	    public void volar() {
	        System.out.println("La nave de combate " + nombre + " está volando.");
	    }

	    public void atacar() {
	        System.out.println("La nave de combate " + nombre + " está atacando con " + numMisiles + " misiles.");
	    }
	}

	
	public class NaveCarga extends NaveAbstracta {
	    private double capacidadCarga;

	    public NaveCarga(String nombre, int capacidadPasajeros, double capacidadCarga) {
	        super(nombre, capacidadPasajeros);
	        this.capacidadCarga = capacidadCarga;
	    }

	    public void volar() {
	        System.out.println("La nave de carga " + nombre + " está volando.");
	    }

	    public void cargarMercancia() {
	        System.out.println("La nave de carga " + nombre + " está cargando mercancía con capacidad de " + capacidadCarga + " toneladas.");
	    }
	}

}

