import java.util.Random;

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

    public void comer(String comida) {
        System.out.println(nombre + " comiendo " + comida);
    }

    public void dormir(int horas) {
        System.out.println(nombre + " está durmiendo " + horas + " horas");
    }

    public void hacerEjercicio(String ejercicio) {
        System.out.println(nombre + " está haciendo este ejercicio: " + ejercicio);
    }

    public void tomarBano(String momento) {
        System.out.println(nombre + " está tomando un baño en " + momento);
    }

    public static void main(String[] args) {
        Random rand = new Random();

        String[] comidas = {"Pizza", "Ensalada", "Hamburguesa", "Sushi", "Pasta"};
        String[] ejercicios = {"Correr", "Nadar", "Hacer yoga", "Levantar pesas", "Caminar"};
        String[] momentosBano = {"la mañana", "la tarde", "la noche"};

        Persona[] personas = {
            new Persona("Juan", 30, "Masculino", "Ingeniero", "123 Calle Principal"),
            new Persona("María", 25, "Femenino", "Doctora", "456 Avenida Secundaria"),
            new Persona("Pedro", 40, "Masculino", "Abogado", "789 Calle Principal")
        };

        for (Persona persona : personas) {
            int actividadAleatoria = rand.nextInt(4);
            switch (actividadAleatoria) {
                case 0:
                    persona.comer(comidas[rand.nextInt(comidas.length)]);
                    break;
                case 1:
                    persona.dormir(rand.nextInt(8) + 1);
                    break;
                case 2:
                    persona.hacerEjercicio(ejercicios[rand.nextInt(ejercicios.length)]);
                    break;
                case 3:
                    persona.tomarBano(momentosBano[rand.nextInt(momentosBano.length)]);
                    break;
            }
        }
    }
}

