package poo_modelo;

import java.util.Objects;

public class Cliente {
	private final String DNI;
	private int edad;
	private String direccion;
	private String telefono;

	/**
	 * @param nombre
	 * @param edad
	 * @param direccion
	 * @param telefono
	 */
	public Cliente(String DNI, int edad, String direccion, String telefono) {
		this.DNI = DNI;
		this.edad = edad;
		this.direccion = direccion;
		this.telefono = telefono;

	}

	public String getDNI() {
		return DNI;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Override
	public int hashCode() {
		return Objects.hash(DNI);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(DNI, other.DNI);
	}

	@Override
	public String toString() {
		return "Cliente [DNI=" + DNI + ", edad=" + edad + ", direccion=" + direccion + ", telefono=" + telefono + "]";
	}
	
}
