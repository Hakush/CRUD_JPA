package persistencia;

import java.util.List;
import logica.Persona;
import persistencia.exceptions.NonexistentEntityException;

public class ControladoraPersistencia {
    
    PersonaJpaController persJPA = new PersonaJpaController();
    
    public void crearPersona (Persona per) {
        persJPA.create(per);
    }
    
    public void eliminarPersona (int id) throws NonexistentEntityException {
        persJPA.destroy(id);
    }
    
    public void eliminarPersona (Persona pers) throws NonexistentEntityException {
        persJPA.destroy(pers.getId());
    }
    
    public List<Persona> traerPersonas () {
        
        return persJPA.findPersonaEntities();
    }
    
}
