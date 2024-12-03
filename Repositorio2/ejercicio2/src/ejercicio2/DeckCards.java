package ejercicio2;

// Importación de la clase ArrayList de Java para manejar la lista de cartas.
import java.util.ArrayList;

public class DeckCards {

	public static void main(String[] args) {

		// Se definen los palos de las cartas
		String[] suits = { "Spades", "Diamonds", "Club", "Heart" };
		// Se definen los valores de las cartas
		String[] values = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };

		// Se crea un ArrayList que almacenará objetos de tipo 'Card'
		ArrayList<Card> deck = new ArrayList<Card>();

		// Se implementa un bucle "for" para crear el mazo de cartas
		for (int i = 0; i < suits.length; i++) {
			// Se implementa un bucle "for" para recorrer los valores de las cartas
			for (int j = 0; j < values.length; j++) {
				// Se crea una nueva carta con el palo y el valor actual
				Card card = new Card(suits[i], values[j]);
				// Se añade la carta al mazo (ArrayList)
				deck.add(card);
			}
		}

		// Se implementa un bucle "for" para el barajado del mazo de cartas
		for (int i = 0; i < deck.size(); i++) {
			// Se genera un número aleatorio dentro del rango del tamaño actual del mazo
			int j = (int) Math.floor(Math.random() * i);
			// Se obtiene la carta en la posición i
			Card tmp = deck.get(i);
			// Se intercambia la carta en la posición i con la carta en la posición
			// aleatoria j
			deck.set(i, deck.get(j));
			deck.set(j, tmp);
		}

		// Finalmente se añade un bucle "for" que imprimirá las primeras 5 cartas del
		// mazo barajado
		for (int i = 0; i < 5; i++) {
			System.out.println(deck.get(i));
		}

	}

}
