package Cards;


	public class Main {
		public static void main(String args[]) {
			int suitNumber = (int) (Math.random() * 4.0 + 1);
			int faceNumber = (int) (Math.random() * 13.0 + 1);
			
			Card newCard = new Card(suitNumber, faceNumber);
			System.out.println(newCard);
		}
	}


