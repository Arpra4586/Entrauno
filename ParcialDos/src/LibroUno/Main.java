package LibroUno;
import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		System.out.println("libros diponibles El Diablo en la botella, Cien años de soledad ");
		String lib =JOptionPane.showInputDialog("introduce tu libro favorito");
		System.out.println("la introducion de los libros son");
	    Libro lib1 = new Libro("1234567890", "El Diablo en la botella", "Miguel de Cervantes", 863);
	    Libro lib2 = new Libro("0987654321", "Cien años de soledad", "Gabriel García Márquez", 471);

	    System.out.println(lib1);
	    System.out.println(lib2);
	    if (lib1.tieneMasPaginas(lib2)) {
	        System.out.println("El libro '" + lib1.getTitulo() + "' tiene más páginas que el libro '" + lib2.getTitulo() + "'");
	    } else if (lib2.tieneMasPaginas(lib1)) {
	        System.out.println("El libro '" + lib2.getTitulo() + "' tiene más páginas que el libro '" + lib1.getTitulo() + "'");
	    } else {
	        System.out.println(" Ambos  libros tienen la misma cantidad de páginas");
	    }
	}

}


