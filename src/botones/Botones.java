package botones;


import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Botones {
    public static frmformulario formulario;
    public static ArrayList<Persona> personas; // Cambio a ArrayList
    public static int contador; // declarando el contador

    /*
    public static void main(String[] args) {
        formulario = new frmformulario();
        personas = new ArrayList<>(); // Inicialización del ArrayList
        
        for (int i = 0; i < 100; i++) {
        personas.add(new Persona()); // Agrega 100 instancias de Persona al ArrayList
        }
        
        contador = 0;
        
        formulario.setVisible(true);
    }*/

    public static boolean guardar(String Id, String n, String a, String c, int cel) {
        if (personas.size() < 100) { // Verificación del límite usando size() en lugar de length
            for (Persona persona : personas) {
                if (persona.getId().equals(Id)) {
                    JOptionPane.showMessageDialog(null, "La persona con el ID " + Id + " ya existe");
                    return false;
                }
            }
            Persona nuevaPersona = new Persona(); // Crear una nueva instancia de Persona
            nuevaPersona.setId(Id);
            nuevaPersona.setNombre(n);
            nuevaPersona.setApellido(a);
            nuevaPersona.setCorreo(c);
            nuevaPersona.setCelular(cel);
            
            personas.add(nuevaPersona); // Agregar la nueva persona al ArrayList
            JOptionPane.showMessageDialog(null, "Se guardó correctamente");
        } else {
            JOptionPane.showMessageDialog(null, "Límite de personas alcanzado");
        }
        return true;
    }

    public static void buscar(String bus) {
            //SI ES NULL SE CREA OTRA INSTANCIA
        if (formulario == null) {
            formulario = new frmformulario();
            formulario.setVisible(true);
        }

        for (Persona persona : personas) {
            if (persona.getId().equals(bus)) {//THIS IF IS FOR RETURN A ID
                formulario.cargardatos(persona);//VARIABLE FORMULARIO TRAYENDO METODO GUARDAR DATOS 
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Persona no encontrada");
    }
    
    public static void eliminar(String Id) {
        for (Persona persona : personas) {
            if (persona.getId().equals(Id)) {
                personas.remove(persona);
                JOptionPane.showMessageDialog(null, "Persona eliminada");
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Persona no encontrada");
    }
    
    public static void actualizar(String Id, String n, String a, String c, int cel) {
        Persona personaActualizar = null;
        for (Persona persona : personas) {
            if (persona.getId().equals(Id)) {
                personaActualizar = persona;
                break;
            }
        }
        if (personaActualizar == null) {
            JOptionPane.showMessageDialog(null, "Persona no encontrada");
        } else {
            personaActualizar.setNombre(n);
            personaActualizar.setApellido(a);
            personaActualizar.setCorreo(c);
            personaActualizar.setCelular(cel);
            JOptionPane.showMessageDialog(null, "La persona con el id " + personaActualizar.getId() + " se ha actualizado");
        }
    }
}
