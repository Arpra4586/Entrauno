
public class NaveEspacialSabia {
	
	abstract class NaveEspacial {
	    private String nombre;

	    public NaveEspacial(String nombre) {
	        this.nombre = nombre;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	   
	    public abstract void volar();
	}

	
	class NaveDExploracion extends NaveEspacial {
	    public NaveDExploracion(String nombre) {
	        super(nombre);
	    }

	   
	    public void volar() {
	        System.out.println("La nave de exploración " + getNombre() + " está explorando nuevos planetas.");
	    }
	}

	
	class NaveCombate extends NaveEspacial {
	    public NaveCombate(String nombre) {
	        super(nombre);
	    }

	    
	    public void volar() {
	        System.out.println("La nave de combate " + getNombre() + " está en una misión de combate.");
	    }
	}

	
	class NaveCarga extends NaveEspacial {
	    public NaveCarga(String nombre) {
	        super(nombre);
	    }

	   
	    public void volar() {
	        System.out.println("La nave de carga " + getNombre() + " está transportando carga a otros planetas.");
	    }
	}

	
	class NavePasajeros extends NaveEspacial {
	    public NavePasajeros(String nombre) {
	        super(nombre);
	    }

	  
	    public void volar() {
	        System.out.println("La nave de pasajeros " + getNombre() + " está llevando pasajeros a su destino.");
	    }
	}



}
