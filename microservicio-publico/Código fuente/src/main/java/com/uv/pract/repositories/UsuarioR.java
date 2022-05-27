package com.uv.pract.repositories;

import java.util.ArrayList;

import com.uv.pract.models.UsuarioM;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
//CrudRepository clase que implementa los metodos a utilizar con la BD   
@Repository
public interface UsuarioR extends CrudRepository<UsuarioM, Long> {   //indica tipo de dato y tipo de identificador 
    public abstract ArrayList<UsuarioM> findByPrioridad(Integer prioridad);

}