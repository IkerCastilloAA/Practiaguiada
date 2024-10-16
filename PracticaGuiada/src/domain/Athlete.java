package domain;
import java.time.LocalDate;

/**
 * Clase que representa a los atletas que han competido en los JJ.OO.
 */
public class Athlete {
	
	/**
	 * Enumeración para representar los géneros oficiales en las competiciones
	 */
	public enum Genre {
		MALE, FEMALE;
	}

	private int code; // código único del atleta
	private String name; // nombre del atleta
	private Genre genre; // genéro del atleta
	private String country; // nombre del país del atleta
	private LocalDate birthdate; // fecha de nacimiento del atleta
	private float height; // altura en cm del atleta
	private float weight; // peso en kg del atleta
	
	/**
	 * Constructor de la clase que recibe los datos básicos: código, nombre, género, país y fecha de nacimiento
	 * El peso y la altura son opcionales y se establecen a 0.0 por defecto.
	 * @param código código único del atleta
	 * @param name nombre completo del atleta en formato "APELLIDO NOMBRE"
	 * @param genre género del atleta
	 * @param country país del atleta
	 * @param birthdate fecha de nacimiento del atleta
	 */
	public Athlete(int code, String name, Genre genre, String country, LocalDate birthdate) {
		this.code = code;
		this.name = name;
		this.genre = genre;
		this.country = country;
		this.birthdate = birthdate;
		this.height = 0.0f;
		this.weight = 0.0f;
	}
	
	/**
	 * Obtiene el código único del atleta
	 * return código único del atleta
	 */
	public int getCode() {
		return code;
	}
	
	/**
	 * Obtiene el nombre completo del atleta en el formato "APELLIDO NOMBRE"
	 * @return nombre completo del atleta
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Obtiene el género del atleta
	 * @return género del atleta
	 */
	public Genre getGenre() {
		return genre;
	}
	
	/**
	 * Obtiene el país del atleta
	 * @return país del atleta
	 */
	public String getCountry() {
		return country;
	}
	
	/**
	 * Obtiene la altura del atleta
	 * return altura del atleta
	 */
	public float getHeight() {
		return height;
	}
	
	/**
	 * Obtiene la fecha de nacimiento del atleta
	 * return fecha de nacimiento del atleta
	 */
	public LocalDate getBirthdate() {
		return birthdate;
	}
	
	/**
	 * Obtiene el peso del atleta
	 * @return peso del atleta
	 */
	public float getWeight() {
		return weight;
	}

	/**
	 * Establece la altura del atleta
	 * @param height altura del atleta
	 */
	public void setHeight(float height) {
		this.height = height;
	}

	/**
	 * Establece el peso del atleta
	 * @param weight peso del atleta
	 */
	public void setWeight(float weight) {
		this.weight = weight;
	}
	
	@Override
	public String toString() {
		return String.format("[%d, %s, %s, %s, %s, %.0f, %.0f]", code, name, genre, country, birthdate, height, weight);
	}
}
