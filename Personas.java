public class Persona {
    private String nombre;
    private int edad;
    private String genero;
    private String ocupacion;
    private String direccion;

    public Persona(String nombre, int edad, String genero, String ocupacion, String direccion) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.ocupacion = ocupacion;
        this.direccion = direccion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public static void comer(String comida) {
        System.out.println("Comiendo " + comida);
    }

    public void dormir(int horas) {
        System.out.println(nombre + " está durmiendo " + horas + " horas");
    }

    public void hacerEjercicio(String ejercicio) {
        System.out.println(nombre + " está haciendo ejercicio: " + ejercicio);
    }

    public static void main(String[] args) {
        Persona persona = new Persona("Juan", 30, "Masculino", "Ingeniero", "123 Calle Principal");
        Persona.comer("Pizza");
        persona.dormir(8);
        persona.hacerEjercicio("Correr");
    }
}
