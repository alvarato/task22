package models;

public class Cliente {

	private int id;
	private String nombre;
	private String direccion;
	private int dni;
	private String fecha;

	// Constructores //
	public Cliente() {
	}


	public Cliente(int id, String nombre, String direccion, int dni, String fecha) {
		this.id = id;
		this.nombre = nombre;
		this.direccion = direccion;
		this.dni = dni;
		this.fecha = fecha;
	}

	// Getters y setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	@Override
	public String toString() {
		return "Cliente [id = " + id + ", nombre = " + nombre + ", direccion = " + direccion + ", dni = " + dni + ", fecha = "
				+ fecha + "]";
	}

}
