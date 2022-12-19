/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfolio.gem.Interface;

import com.portfolio.gem.Entity.Persona;
import java.util.List;

/**
 *
 * @author ezegi
 */
public interface IPersonaService {
//    Traer una lista de personas
    public List<Persona> getPersona();
    
//    Guardar objeto del tipo persona
    public void savePersona(Persona persona);
    
//    Eliminar un usuario x ID
    public void deletePersona(Long id) ;
    
//    Buscar persona x ID
    public Persona findPersona(Long id) ;
}
