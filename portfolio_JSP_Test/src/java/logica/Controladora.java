package logica;

import java.util.ArrayList;
import java.util.List;
import persistencia.ControladoraPersistencia;
import persistencia.exceptions.NonexistentEntityException;

public class Controladora {
    
    ControladoraPersistencia ctrlPers = new ControladoraPersistencia ();
    
    public void crearPersona(Persona per) {
        ctrlPers.crearPersona(per);
    }
    
    public void eliminarPersona(int id) throws NonexistentEntityException {
        ctrlPers.eliminarPersona(id);
    }
    
    public void eliminarPersona(Persona pers) throws NonexistentEntityException {
        ctrlPers.eliminarPersona(pers);
    }
    
    public void editarPersona(Persona pers) throws Exception {
        ctrlPers.editarPersona(pers);
    }
    
    public Persona encontrarPersona(int id) {
        return ctrlPers.encontrarPersona(id);
    }
    
    public List<Persona> traerPersonas() {
        return ctrlPers.traerPersonas();
    }
}
