

abstract class NaveEspacial {
    private String nombre;
    private double velocidad;

    public NaveEspacial(String nombre, double velocidad) {
        this.nombre = nombre;
        this.velocidad = velocidad;
    }

    public abstract void despegar(); 

    public abstract void aterrizar(); // Comportamiento abstracto de aterrizaje

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }
}


interface TransporteCarga {
    void cargarCarga(int cantidad); 
    void descargarCarga(int cantidad); 
}


interface TransporteTripulacion {
    void embarcarTripulacion(int cantidad);
    void desembarcarTripulacion(int cantidad); 
}

// Clase que representa una nave lanzadera
class Lanzadera extends NaveEspacial {
    public Lanzadera(String nombre, double velocidad) {
        super(nombre, velocidad);
    }

    
    public void despegar() {
        System.out.println("La lanzadera " + getNombre() + " despegó.");
    }

    
    public void aterrizar() {
        System.out.println("La lanzadera " + getNombre() + " aterrizó.");
    }
}


class SondaEspacial extends NaveEspacial implements TransporteCarga {
    private int carga;

    public SondaEspacial(String nombre, double velocidad) {
        super(nombre, velocidad);
    }

    
    public void despegar() {
        System.out.println("La sonda " + getNombre() + " despegó.");
    }

    
    public void aterrizar() {
        System.out.println("La sonda " + getNombre() + " aterrizó.");
    }

    
    public void cargarCarga(int cantidad) {
        carga += cantidad;
        System.out.println("Se cargaron " + cantidad + " unidades de carga en la sonda " + getNombre() + ".");
    }

    
    public void descargarCarga(int cantidad) {
        carga -= cantidad;
        System.out.println("Se descargaron " + cantidad + " unidades de carga de la sonda " + getNombre() + ".");
    }
}

// Clase que representa una nave tripulada
class NaveTripulada extends NaveEspacial implements TransporteTripulacion {
    private int tripulacion;

    public NaveTripulada(String nombre, double velocidad) {
        super(nombre, velocidad);
    }

   
    public void despegar() {
        System.out.println("La nave tripulada " + getNombre() + " despegó.");
    }

    public void aterrizar() {
        System.out.println("La nave tripulada " + getNombre() + " aterrizó.");
    }

   
    public void embarcarTripulacion(int cantidad) {
        tripulacion += cantidad;
        System.out.println("Se embarcaron " + cantidad + " tripulantes en la nave " + getNombre() + ".");
    }

    
    public void desembarcarTripulacion(int cantidad) {
        tripulacion -= cantidad;
        System.out.println("Se desembarcaron " + cantidad + " tripulantes de la nave " + getNombre() + ".");
    }
}
