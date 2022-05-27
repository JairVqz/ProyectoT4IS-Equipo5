//Aqui se recibe la peticion web 
package com.uv.pract.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.uv.pract.models.UsuarioM;
import com.uv.pract.services.UsuarioS;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/usuario")  //en que direccion del servidor se activara los metodos de esta clase
public class UsuarioC {
    @Autowired 
    UsuarioS usuarioService;

    @GetMapping()
    public ArrayList<UsuarioM> obtenerUsuarios(){ //se regresa el arreglo de todos los usuarios de tipo ArrayList
        return usuarioService.obtenerUsuarios();
    }
    //regresa el usuarios pero actualizado
    @PostMapping()
    public UsuarioM guardarUsuario(@RequestBody UsuarioM usuario){ //tomar la informacion y guardarla en el objeto usuario
        return this.usuarioService.guardarUsuario(usuario);//llama al metodo del servicio pasandole el objeto que tiene la informacion
    }

    //https://microservicio-publico.herokuapp.com/usuario/2
    @GetMapping( path = "/{id}")  //buscar registro por su id
    public Optional<UsuarioM> obtenerUsuarioPorId(@PathVariable("id") Long id) {
        return this.usuarioService.obtenerPorId(id);
    }

    //https://microservicio-publico.herokuapp.com/usuario/query?prioridad=2
    @GetMapping("/query") //buscar por prioridad pasando los parametros por queryparams, poniendo la variable que queremos pasar y el valor 
    public ArrayList<UsuarioM> obtenerUsuarioPorPrioridad(@RequestParam("prioridad") Integer prioridad){
        return this.usuarioService.obtenerPorPrioridad(prioridad);
    }

    //https://microservicio-publico.herokuapp.com/usuario/2
    @DeleteMapping( path = "/{id}") //nueva peticion http llamada delete , pasando el id 
    public String eliminarPorId(@PathVariable("id") Long id){
        boolean ok = this.usuarioService.eliminarUsuario(id);
        if (ok){
            return "Se eliminó el usuario con id " + id;
        }else{
            return "No pudo eliminar el usuario con id" + id;
        }
    }

}