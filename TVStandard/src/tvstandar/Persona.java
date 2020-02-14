package tvstandar;

public class Persona {
private String nombre;
private String apellido;
private int edad;
private char sexo;





public Persona(String nombre, String apellido, int edad, char sexo) {
	super();
	this.nombre = nombre;
	this.apellido = apellido;
	this.edad = edad;
	this.sexo = sexo;
}
public Persona(String nombre) {
	super();
	this.nombre = nombre;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getApellido() {
	return apellido;
}
public void setApellido(String apellido) {
	this.apellido = apellido;
}
public int getEdad() {
	return edad;
}
public void setEdad(int edad) {
	this.edad = edad;
}
public char getSexo() {
	return sexo;
}
public void setSexo(char sexo) {
	this.sexo = sexo;
}
}
