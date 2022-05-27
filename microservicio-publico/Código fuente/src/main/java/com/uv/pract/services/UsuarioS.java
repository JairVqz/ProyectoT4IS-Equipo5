package com.uv.pract.services;

import java.util.ArrayList;
import java.util.Optional;

import com.uv.pract.models.UsuarioM;
import com.uv.pract.repositories.UsuarioR;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioS {
    @Autowired   
    UsuarioR usuarioRepository;  //para utilizar UsuarioR se declara como una variable 
    
    public ArrayList<UsuarioM> obtenerUsuarios(){ //regresa objetos de tipo usuarioModel, ver todo el publico registrado
        return (ArrayList<UsuarioM>) usuarioRepository.findAll(); //obtine los registros, para luego castea a un arreglo de tipo UsuarioM para poder regresarlo en un Json
    }

    public UsuarioM guardarUsuario(UsuarioM usuario){ //Metodo que regresa el usuario y recive un usuarip del mismo tipo, regresa la misma informacion pero con id
        return usuarioRepository.save(usuario);
    }

    public Optional<UsuarioM> obtenerPorId(Long id){ //obtiene por id utilizando los metodos del repositorio, de tipo optional por si no existe 
        return usuarioRepository.findById(id);
    }

 //obtine los registros por prioridad
    public ArrayList<UsuarioM>  obtenerPorPrioridad(Integer prioridad) {
        return usuarioRepository.findByPrioridad(prioridad);
    }

    public boolean eliminarUsuario(Long id) { //eliminar usuario pasando id
        try{
            usuarioRepository.deleteById(id);
            return true;
        }catch(Exception err){
            return false;
        }
    }




    
    
}