package mx.uv.t4is.Libro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import https.t4is_uv_mx.libro.BuscarLibroRequest;
import https.t4is_uv_mx.libro.BuscarLibroResponse;
import https.t4is_uv_mx.libro.EliminarLibroRequest;
import https.t4is_uv_mx.libro.EliminarLibroResponse;
import https.t4is_uv_mx.libro.GuardarLibroRequest;
import https.t4is_uv_mx.libro.GuardarLibroResponse;
import https.t4is_uv_mx.libro.ModificarLibroRequest;
import https.t4is_uv_mx.libro.ModificarLibroResponse;
import https.t4is_uv_mx.libro.MostrarLibrosResponse;
import https.t4is_uv_mx.libro.TotalLibroResponse;


@Endpoint
public class LibroEndPoint {

    @Autowired
    ILibro ilibro;

    //Método Guardar Libro "Hace refencia a los elementos GuardarLibroRequest y GuardarLibroResponse del archivo libro.xsd"
    @PayloadRoot(localPart = "GuardarLibroRequest" ,namespace = "https://t4is.uv.mx/libro")
    @ResponsePayload
    public GuardarLibroResponse guardarLibro(@RequestPayload GuardarLibroRequest peticion) {  //El parámetro petición nos ayuda a recuperar valores ingresados en el wsdl
        GuardarLibroResponse respuesta = new GuardarLibroResponse();
        //Se crea un nuevo objeto de tipo libro
        Libro libro = new Libro();
        //Pedira los siguientes datos que seran almacenados en la base de datos:

        //Nombre del titulo (tipo de dato String)
        libro.setTitulo(peticion.getTitulo());
        //Nombre del Autor (tipo de dato String)
        libro.setAutor(peticion.getAutor());
        //Nombre de la editorial (tipo de dato String)
        libro.setEditorial(peticion.getEditorial());
        //Categoria a la cual pertenecera (tipo de dato String)
        libro.setCategoria(peticion.getCategoria());
        //Una breve descripcion del libro (tipo de dato String)
        libro.setDescripcion(peticion.getDescripcion());
        //El estatus del libro el cual reflejara si esta disponible el libro o no (tipo de dato String)
        libro.setStatusPrestamo(peticion.getStatusPrestamo());
        //Por ultimo guarda la informacion del libro en la base de datos
        ilibro.save(libro);
        //Y manda una respuesta de "El libro T4IS se agrego correctamente"
        respuesta.setRespuesta("El libro "+peticion.getTitulo() + " se agrego correctamente");
        return respuesta;  
    }

    //Método buscar libro
    @PayloadRoot(localPart = "BuscarLibroRequest" ,namespace = "https://t4is.uv.mx/libro")
    @ResponsePayload
    public BuscarLibroResponse buscarLibro(@RequestPayload BuscarLibroRequest peticion) { //El parámetro petición nos ayuda a recuperar valores ingresados en el wsdl
        BuscarLibroResponse respuesta = new BuscarLibroResponse();
        //Pide el ID del libro del cual se requiere la informacion
        String id = Integer.toString(peticion.getId());
        //Se utiliza un arreglo el cual buscara los libros utilizando su ID y su Titulo (Datos tipo Strings)
        Iterable<Libro> listaLibros = ilibro.findByIdAndTitulo(peticion.getId(), peticion.getTitulo());
        //Se realiza una busqueda entre todos los datos de la base de datos 
        for (Libro libro : listaLibros){
            //Devuelve el libro solicitado si se encuentran los datos solicitados en la base de datos
            BuscarLibroResponse.Libros l = new BuscarLibroResponse.Libros();
            //Devuleve el atributo ID (Tipo de dato int)
            l.setId(libro.getId());
            //Devuleve el nombre del titulo (Tipo de dato String)
            l.setTitulo(libro.getTitulo());
            //Devuleve el nombre del autor (Tipo de dato String)
            l.setAutor(libro.getAutor());
            //Devuleve el nombre de la editorial (Tipo de dato String)
            l.setEditorial(libro.getEditorial());
            //Devuleve el nombre de la categoria (Tipo de dato String)
            l.setCategoria(libro.getCategoria());
            //Devuleve la descripcion del libro (Tipo de dato String)
            l.setDescripcion(libro.getDescripcion());
            //Devuleve el estado del libro (Tipo de dato String)
            l.setStatusPrestamo(libro.getStatusPrestamo());
            respuesta.getLibros().add(l);
        }
        return respuesta;

    }

    //Método Mostrar Libros "Hac referencia a los elementos MostrarLibrosRequest y MostrarLibrosResponse del archivo libro.xsde "
    @PayloadRoot(localPart = "MostrarLibrosRequest" ,namespace = "https://t4is.uv.mx/libro")
    @ResponsePayload
    public MostrarLibrosResponse mostrarLibros(){
        MostrarLibrosResponse respuesta = new MostrarLibrosResponse();
        //Se crea un objeto iterable del objeto libro, el cual permitira recuperar todos los libros almacenados en la base de datos
        Iterable<Libro> lista = ilibro.findAll();
        
        //Por cada objeto libro que sea encontrado en la base de datos, recuperará sus valores y los guardará en una lista para mandarlos posteriormente
        for (Libro libro : lista) {
            MostrarLibrosResponse.Libros l = new MostrarLibrosResponse.Libros();
            l.setId(libro.getId());
            l.setTitulo(libro.getTitulo());
            l.setAutor(libro.getAutor());
            l.setEditorial(libro.getEditorial());
            l.setCategoria(libro.getCategoria());
            l.setDescripcion(libro.getDescripcion());
            l.setStatusPrestamo(libro.getStatusPrestamo());
            respuesta.getLibros().add(l);
        }
        //El valor que se regresa como respuesta es una lista con todos los datos de los libros que fueron recuperados de la base datos
        return respuesta;
    }

    //Método Modificar Libro "Hace referencia a los elementos ModificarLibroRequest y ModificarLibroResponse del archivo libro.xsd"
    @PayloadRoot(localPart = "ModificarLibroRequest" ,namespace = "https://t4is.uv.mx/libro")
    @ResponsePayload
    public ModificarLibroResponse modificarLibro(@RequestPayload ModificarLibroRequest peticion){  //El parámetro petición nos ayuda a recuperar valores ingresados en el wsdl      
        ModificarLibroResponse respuesta = new ModificarLibroResponse(); 

        //Se instancia una objeto de la clase libro
        Libro libro = new Libro();
        //Para este metodo el id es el valor que indica que libro de la base de datos se va a modificar
        libro.setId(peticion.getId());
        //Los siguientes valores serán los que reemplazaran los valores anteriores del libro
        libro.setTitulo(peticion.getTitulo());
        //Solicita el nuevo nombre del Autor (Tipo de dato String));
        libro.setAutor(peticion.getAutor());
        //Solicita el nuevo nombre de la Editorial (Tipo de dato String));
        libro.setEditorial(peticion.getEditorial());
        //Solicita el nuevo nombre de la Categoria (Tipo de dato String));
        libro.setCategoria(peticion.getCategoria());
        //Solicita el nuevo nombre de la Descripcion (Tipo de dato String));
        libro.setDescripcion(peticion.getDescripcion());
        //Solicita el nuevo Estatus del libro (Tipo de dato String));
        libro.setStatusPrestamo(peticion.getStatusPrestamo());
        //Guardamos los cambios en la base de datos
        ilibro.save(libro);
        //Enviamos un mensaje como respuesta indicando que el libro fue modificado
        respuesta.setRespuesta("Libro modificado");        
        return respuesta;
    }

    //Método Eliminar Libro "Hace referencia a los elementos EliminarLibroRequest y EliminarLibroResponse del archivo libro.xsd"
    @PayloadRoot(localPart = "EliminarLibroRequest", namespace = "https://t4is.uv.mx/libro")
    @ResponsePayload
    public EliminarLibroResponse eliminarLibro(@RequestPayload EliminarLibroRequest peticion){ //El parámetro petición nos ayuda a recuperar valores ingresados en el wsdl
        EliminarLibroResponse respuesta = new EliminarLibroResponse();
        //Para este método recuperamos e  indicamos el id del libro que vamos a eliminar
        ilibro.deleteById(peticion.getId());
        //Enviamos un mensaje como respuesta indicando que el libro fue eliminado
        respuesta.setRespuesta("Libro eliminado");
        return respuesta;
    }

    //Método Total Libros "Hace referencia a los elementos TotalLibroRequest y TotalLibroResponse del archivo libro.xsd"
    @PayloadRoot(localPart = "TotalLibroRequest", namespace = "https://t4is.uv.mx/libro")
    @ResponsePayload
    public TotalLibroResponse totalLibros(){
        TotalLibroResponse respuesta = new TotalLibroResponse();
        //Este método lo que hace es realizar un conteo de todos los libros almacenado en la base de datos.
        respuesta.setRespuesta("Tu total de libros es: "+ilibro.count());
        //Se envía como respuesta el total de libros encontrados en la base datos.
     
           return respuesta;
    }


}

