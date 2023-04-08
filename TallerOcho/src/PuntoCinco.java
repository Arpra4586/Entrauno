
public class PuntoCinco {
	
		public PuntoCinco() {
			Estudiante[] estudiante = new Estudiante[3];
			// Crear los tres estudiantes
			estudiante[0] = new Estudiante("Mary Jones", 14, 46);
			estudiante[1] = new Estudiante("John Stiner", 60, 173);
			estudiante[2] = new Estudiante("Ari Samala", 31, 69);
			
	     	int credits = estudiante[2].getCredits();
			int qualityPoints = estudiante[2].getQualityPoints();;
			estudiante[2].setCredits(credits + 3);
			estudiante[2].setQualityPoints(qualityPoints + 52);
			
			estudiante[2].inputCreditsAndQualityPoints();
		}
	}
		
	


