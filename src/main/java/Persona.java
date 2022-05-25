public class Persona {
    private String nombre;
    private int edad, amistad;

    public Persona(String nombre, int edad, int amistad){
        this.nombre=nombre;
        this.edad=edad;
        this.amistad=amistad;
    }
    public String getNombre(){
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
    public int getAmistad(){
        return amistad;
    }
}
