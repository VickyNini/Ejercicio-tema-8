public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();

        persona.setNombre("María Victoria Meriño Mac William");
        persona.setEdad(27);
        persona.setCelular(351687580);

        String nombre = persona.getNombre();
        int edad = persona.getEdad();
        int celular = persona.getCelular();

        System.out.println(nombre);
        System.out.println(edad + " años");
        System.out.println("Celular: " + celular);
    }
}
class Persona{
    private String nombre;
    private int edad;
    private int celular;

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }
    public int getEdad(){
        return edad;
    }

    public void setCelular(int celular){
        this.celular = celular;
    }
    public int getCelular(){
        return celular;
    }
}