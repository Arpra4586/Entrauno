package PersonasPa;


	import java.util.Random;

	public class PersonaUno {
	    private String nombre;
	    private int edad;
	    private String EPS;
	    private char sexo;
	    private double peso;
	    private double altura;

	    private static final char SEXO = 'H';
	    private static final int Peso = 0;
	    private static final int PESONORMAL = 1;
	    private static final int SOBREPESO = 2;

	    public PersonaUno() {
	        this("", 0, SEXO, 0, 0);
	    }

	    public PersonaUno(String nombre, int edad, char sexo) {
	        this(nombre, edad, sexo, 0, 0);
	    }

	    public PersonaUno(String nombre, int edad, char sexo, double peso, double altura) {
	        this.nombre = nombre;
	        this.edad = edad;
	        this.sexo = comprobarSexo(sexo);
	        this.peso = peso;
	        this.altura = altura;
	        this.EPS = generaEPS();
	    }

	    private char comprobarSexo(char sexo) {
	        return sexo == 'H' || sexo == 'M' ? sexo : SEXO;
	    }

	    private String generaEPS() {
	        Random rnd = new Random();
	        int numEPS = rnd.nextInt(500);
	        char letraEPS = letraEPS(numEPS);
	        return String.format("%08d", numEPS) + letraEPS;
	    }

	    private char letraEPS(int numEPS) {
	        String letras = "HWEOUCUCVIUQEVWUOFV";
	        int resto = numEPS % 23;
	        return letras.charAt(resto);
	    }

	    public int calcularIMC() {
	        double imc = peso / (altura * altura);
	        if (imc < 20) {
	            return SEXO;
	        } else if (imc >= 20 && imc <= 25) {
	            return PESONORMAL;
	        } else {
	            return SOBREPESO;
	        }
	    }

	    public boolean esMayorDeEdad() {
	        return edad >= 18;
	        
	        }
	    public boolean esMayorMenor() {
	        return edad <= 18;
	        
	        
	    }

	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }

	    public void setEdad(int edad) {
	        this.edad = edad;
	    }

	    public void setSexo(char sexo) {
	        this.sexo = comprobarSexo(sexo);
	    }

	    public void setPeso(double peso) {
	        this.peso = peso;
	    }

	    public void setAltura(double altura) {
	        this.altura = altura;
	    }

	   
	    public String toString() {
	        return "Persona{" +
	                "nombre='" + nombre + '\'' +
	                ", edad=" + edad +
	                ", DNI='" + EPS + '\'' +
	                ", sexo=" + sexo +
	                ", peso=" + peso +
	                ", altura=" + altura +
	                '}';
	    }
	}
