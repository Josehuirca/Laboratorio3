import java.util.ArrayList;
import java.util.List;
public class Amistad {

    private List<Persona> personas;
    public Amistad(){
        this.personas = new ArrayList<Persona>();
    }

    public List<Persona> getPersonas() {
        return personas;
    }

    public void añadirPersona(){
        this.personas.add(new Persona("Jose Huircaleo",20,40));
        this.personas.add(new Persona("Juanito Perez", 20, 40));
    }
   /* public List<Persona> amigo(int amistad){
        List<Persona> nivel= new ArrayList<Persona>();
        for (Persona persona: this.personas){
            if(persona.getAmistad().equals(Persona)){
                System.out.println("Amigos");
            }
        }
    }*/

    public void comparar(int amistad){
        for (Persona persona: this.personas){
            if(persona.getAmistad()==(amistad)){
                System.out.println("amigos");
            }
        }
    }
    public void mostrar(){
        for(Persona perso: personas){
            String datos= "Nombre: "+ perso.getNombre() + " Edad: " + perso.getEdad();
            System.out.println(datos);
        }
    }

    public void ejecutar(){
        Amistad amistad= new Amistad();
        amistad.añadirPersona();
        amistad.mostrar();
    }
}
