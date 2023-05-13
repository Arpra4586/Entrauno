

	public class NaveEspacial {
	    private String nombre;
	    private int velocidadMaxima;
	    private int capacidadTripulacion;
	    private boolean propulsorActivo;

	    public NaveEspacial(String nombre, int velocidadMaxima, int capacidadTripulacion) {
	        this.nombre = nombre;
	        this.velocidadMaxima = velocidadMaxima;
	        this.capacidadTripulacion = capacidadTripulacion;
	        this.propulsorActivo = false;
	    }

	    public void activarPropulsor() {
	        this.propulsorActivo = true;
	        System.out.println("Propulsor activado");
	    }

	    public void desactivarPropulsor() {
	        this.propulsorActivo = false;
	        System.out.println("Propulsor desactivado");
	    }

	    public void acelerar(int incremento) {
	        if (propulsorActivo) {
	            velocidadMaxima += incremento;
	            System.out.println("Acelerando. Velocidad actual: " + velocidadMaxima + " km/h");
	        } else {
	            System.out.println("No se puede acelerar. El propulsor no está activado");
	        }
	    }

	    public void mostrarInformacion() {
	        System.out.println("Nombre: " + nombre);
	        System.out.println("Velocidad máxima: " + velocidadMaxima + " km/h");
	        System.out.println("Capacidad de tripulación: " + capacidadTripulacion);
	        System.out.println("Propulsor activo: " + propulsorActivo);
	    }

	    public static void main(String[] args) {
	        NaveEspacial nave = new NaveEspacial("Falcon IX", 20000, 4);
	        nave.mostrarInformacion();
	        nave.activarPropulsor();
	        nave.acelerar(5000);
	        nave.desactivarPropulsor();
	        nave.acelerar(3000);
	    }
	}



