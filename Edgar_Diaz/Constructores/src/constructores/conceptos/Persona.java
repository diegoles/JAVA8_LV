package constructores.conceptos;

public class Persona {
	private String nombre;
	private String apellido;

	public Persona(String nombre) {
		this.nombre = nombre;
	}

	public Persona(String nombre, String apellido) {
		// llamamda al constructor padre, en este caso OBJECT
		super(); // debe ser la primera: super o this.
		// llamada al constructor dentro de la misma clase,
		// **debe ser la primera linea ejecutable, por que de lo contrario no compila
		//this(nombre);
		this.apellido = apellido;
		// this(nombre);
		
		// si no hay llamadas al constructor, por defecto esta la llamda al constructor vacio 
		// super()

	}
}
