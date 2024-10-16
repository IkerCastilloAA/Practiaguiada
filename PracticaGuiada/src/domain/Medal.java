package domain;
import java.time.LocalDate;

/**
 * Clase que representa las medallas obtenidas en las competiciones 
 */
public class Medal {

	/**
	 * Emumeración para representar el tipo de medalla
	 */
	public enum Metal {
		GOLD, SILVER, BRONZE
	}
	
	private Metal metal; // tipo de la medalla
	private LocalDate date; // fecha de la competición
	private Athlete athlete; // atleta que ganó la medalla
	private String discipline; // nombre de la disciplina
	
	/**
	 * Constructor con los campos obligatorios para una medalla
	 * @param metal tipo de metal de la medalla
	 * @param medalDate fecha de la competición en la que se asignó la medalla
	 * @param athlete atleta que obtuvo la medalla
	 * @param discipline nombre de la disciplina en la que se consiguió la medalla
	 */
	public Medal(Metal metal, LocalDate medalDate, Athlete athlete, String discipline) {
		this.metal = metal;
		this.date = medalDate;
		this.athlete = athlete;
		this.discipline = discipline;
	}

	/**
	 * Obtiene el tipo de medalla
	 * @return tipo de medalla
	 */
	public Metal getMetal() {
		return metal;
	}

	/**
	 * Obtiene la fecha de la competición
	 * @return fecha de la competición
	 */
	public LocalDate getMedalDate() {
		return date;
	}

	/**
	 * Obtiene el atleta que obtuvo la medalla
	 * @return atleta que obtuvo la medalla
	 */
	public Athlete getAthlete() {
		return athlete;
	}

	/**
	 * Obtiene el nombre de la disciplina en la que se obtuvo la medalla
	 * @return nombre de la disciplina en la que se obtuvo la medalla
	 */
	public String getDiscipline() {
		return discipline;
	}
	
	@Override
	public String toString() {
		return String.format("[%s, %s, %s, %s]", metal, date, athlete.getName(), discipline);
	}
}
