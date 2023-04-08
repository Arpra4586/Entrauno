
public class PuntoUno {
	
	    private int numSides;
	    private boolean regular;

	    public PuntoUno(int numSides, boolean regular) {
	        this.numSides = numSides;
	        this.regular = regular;
	    }

	    public PuntoUno(int numSides) {
	        this.numSides = numSides;
	        this.regular = false;
	    }

	    public int getNumSides() {
	        return numSides;
	    }

	    public void setNumSides(int numSides) {
	        this.numSides = numSides;
	    }

	    public boolean isRegular() {
	        return regular;
	    }

	    public void setRegular(boolean regular) {
	        this.regular = regular;
	    }
	}


