
public class Cohete {
	
	public abstract class Nave {
	    protected String nombre;
	    protected int capacidad;

	    
	    public Nave(String nombre, int capacidad) {
	        this.nombre = nombre;
	        this.capacidad = capacidad;
	    }

	    
	    public abstract double obtenerVelocidad();

	   
	    public void despegar() {
	        System.out.println("La nave " + nombre + " está despegando.");
	    }

	   
	}

	
	public interface ComportamientoNave {
	    void mover();
	}

	
	public class ComportamientoNaveNormal implements ComportamientoNave {
	   
	    public void mover() {
	        System.out.println("La nave se está moviendo normalmente.");
	    }
	}

	
	public class ComportamientoNaveRapida implements ComportamientoNave {
	    
	    public void mover() {
	        System.out.println("La nave se está moviendo rápidamente.");
	    }
	}


	public class ComportamientoNaveLenta implements ComportamientoNave {
	  
	    public void mover() {
	        System.out.println("La nave se está moviendo lentamente.");
	    }
	}

	
	public class NaveNormal extends Nave {
	    public NaveNormal(String nombre, int capacidad) {
	        super(nombre, capacidad);
	    }

	  
	    public double obtenerVelocidad() {
	        return 100.0; 
	    }
	}

	public class NaveRapida extends Nave {
	    public NaveRapida(String nombre, int capacidad) {
	        super(nombre, capacidad);
	    }

	   
	    public double obtenerVelocidad() {
	        return 500.0;
	    }
	}

	
	public class NaveLenta extends Nave {
	    public NaveLenta(String nombre, int capacidad) {
	        super(nombre, capacidad);
	    }

	    
	    public double obtenerVelocidad() {
	        return 50.0; 
	    }
	}

	
	public class NavePersonalizada extends Nave {
	    private ComportamientoNave comportamiento;

	    public NavePersonalizada(String nombre, int capacidad, ComportamientoNave comportamiento) {
	        super(nombre, capacidad);
	        this.comportamiento = comportamiento;
	    }

	   
	    public double obtenerVelocidad() {
	        return 200.0; 
	    }

	    
	    public void despegar() {
	        super.despegar();
	        comportamiento.mover();


}
	}
}

