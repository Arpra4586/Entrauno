
public class Prueba {
	public static void main(String[] args) {
		
		Empleados Trabajador1=new Empleados("Nicolas");
		Empleados Trabajador2= new Empleados ("Paula" );
		Empleados Trabajador3= new Empleados ("Alejandro" );
		Empleados Trabajador4= new Empleados ("Benito" );
		Trabajador1.cambiaSeccion("recursos humanos");
		
		System.out.println(Trabajador1.devuelveDatos() + "\n"+Trabajador2.devuelveDatos()+ "\n"+Trabajador3.devuelveDatos() + "\n"+
		Trabajador4.devuelveDatos());

		System.out.println(Empleados.dameIdeSiguiente());
		
	}

}


class Empleados {
	
	public Empleados (String nom) {
		
		nombre = nom;
		seccion="Administrador";
		Id=IdSiguiente;
		IdSiguiente++;
		
		
		
		
	}
	
	public void cambiaSeccion(String seccion) {
		
		this.seccion=seccion;
		
		
	}
	
	public String devuelveDatos() { // metodo getter
		return "el nombre es " + nombre + "  y la seccion es :"+ seccion + " Y  el Id=" + Id;
		
	}
	public static String dameIdeSiguiente(){
		return "EL IdSiguiente :" + IdSiguiente;
	}
	private final String nombre;
	
	private String seccion;
	private  int Id;
	private static int IdSiguiente=1;
	
}