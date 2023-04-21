package LibroUno;
import javax.swing.JOptionPane;

public class Libro {

	    
	    private String Codigo;
	    private String titulo;
	    private String autor;
	    private int numPag;

	    
	    public Libro(String codigo, String titulo, String autor, int numPaginas) {
	        this.Codigo = Codigo ;
	        this.titulo = titulo;
	        this.autor = autor;
	        this.numPag = numPaginas;
	    }

	   
	    public String getCodigo() {
	        return Codigo;
	    }

	    public void setISBN(int Codigo) {
	   
	        Codigo = 12;
	    }

	    public String getTitulo() {
	        return titulo;
	    }

	    public void setTitulo(String titulo) {
	        this.titulo = titulo;
	    }

	    public String getAutor() {
	        return autor;
	    }

	    public void setAutor(String autor) {
	        this.autor = autor;
	    }

	    public int getNumPaginas() {
	        return numPag;
	    }

	    public void setNumPaginas(int numPaginas) {
	        this.numPag = numPaginas;
	    }

	    
	   
	    public String toString() {
	        return "El libro con el Codigo " + Codigo + " creado por " + autor + " tiene " + numPag + " páginas";
	    }

	 
	    public boolean tieneMasPaginas ( Libro otroLibro) {
	        return this.numPag > otroLibro.numPag;
	    }
      
		
		
	}



