package ejemplo_bus.src.domain;

public class Pasajero {
    private String telefono;
    private String fechaNacimiento;
    private String nombre;
    private String apellido;
    private char genero;
    public String getTelefono(){
        return this.telefono;
    }
    public void setTelefono(String nuevoTelefono){
        this.telefono = nuevoTelefono;
    }
    public String getFechaNacimiento(){
    return this.fechaNacimiento;       
    }
    public void setFechaNacimiento(String nuevaFechaNacimiento) {
    this.fechaNacimiento = nuevaFechaNacimiento;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nuevoNombre){
        this.nombre = nuevoNombre;
    }
    public String getApellido(){
        return this.apellido;
    }
    public void setApellido(String nuevoApellido){
        this.apellido = nuevoApellido;
    }
    public char getGenero(){
        return this.genero;
    }
    public void setGenero(char nuevoGenero){
        this.genero = nuevoGenero;
    }
    // Constructores
    public Pasajero(){}
    public Pasajero(
        String telefono,
        String fechaNacimiento,
        String nombre,
        String apellido,
        char genero
    ){
        this.setTelefono(telefono);
        this.setFechaNacimiento(fechaNacimiento);
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setGenero(genero);
    }
    public Pasajero(
        String fechaNacimiento,
        String nombre,
        String apellido,
        char genero
    ){
        this.setFechaNacimiento(fechaNacimiento);
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setGenero(genero);

    }
}
