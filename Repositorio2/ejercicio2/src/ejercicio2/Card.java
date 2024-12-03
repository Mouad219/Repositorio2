package ejercicio2;

// Definición de la clase Card
public class Card {

	// Atributos de la carta
	public String suit; // Representa el palo de la carta (por ejemplo: "corazones", "tréboles")
	public String value; // Representa el valor de la carta (por ejemplo: "Rey", "As", "2")

	// Constructor que inicializa los atributos de la carta
	public Card(String suit, String value) {
		this.suit = suit; // Le asigna el valor del palo recibido al atributo 'suit'
		this.value = value; // Le asigna el valor recibido al atributo 'value'
	}

	// Se implementa un método que devuelve una representación en texto de la carta
	public String toString() {

		// Finalmente te devuelve la concatenación del palo y el valor de la carta,
		// separados por un guion
		return (this.suit + "-" + this.value);
	}
}
