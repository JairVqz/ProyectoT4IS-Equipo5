package mx.uv.t4is.Prestamo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import https.t4is_uv_mx.prestamo.GuardarPrestamoRequest;
import https.t4is_uv_mx.prestamo.GuardarPrestamoResponse;
import https.t4is_uv_mx.prestamo.MostrarPrestamoResponse;
import https.t4is_uv_mx.prestamo.PrestamoPorClienteRequest;
import https.t4is_uv_mx.prestamo.PrestamoPorClienteResponse;
import https.t4is_uv_mx.prestamo.RenovarPrestamoRequest;
import https.t4is_uv_mx.prestamo.RenovarPrestamoResponse;
import https.t4is_uv_mx.prestamo.StatusPrestamoRequest;
import https.t4is_uv_mx.prestamo.StatusPrestamoResponse;


@Endpoint
public class PrestamoEndPoint {
    
    @Autowired
    IPrestamo iprestamo;
    
    //Realizar un prestamo hace referencia a los elementos GuardarPrestamoRequest y GuardarPrestamoResponse del archivo prestamo.xsd
    @PayloadRoot(localPart = "GuardarPrestamoRequest" ,namespace = "https://t4is.uv.mx/prestamo")
    @ResponsePayload
    public GuardarPrestamoResponse guardarPrestamo(@RequestPayload GuardarPrestamoRequest peticion) {  
        GuardarPrestamoResponse respuesta = new GuardarPrestamoResponse();
        
        //Generamos el objeto prestamo recuperando los valores del archivo xsd, utilizando peticion.get por cada uno de los datos.
        //Después insertamos el registro en la base de datos con la ayuda de la interfaz iprestamo y devolvemos como respuesta
        //un pequeño mensaje indicando el nombre del cliente el libro que apartó y la fecha hasta la que se realizó el prestamo.
        Prestamo prestamo = new Prestamo();
        
        prestamo.setFinicio(peticion.getFinicio());
        prestamo.setFfin(peticion.getFfin());
        prestamo.setNomcliente(peticion.getNomcliente());
        prestamo.setTitulolibro(peticion.getTitulolibro());
        prestamo.setStatus(peticion.getStatus());
        prestamo.setResponsable(peticion.getResponsable());
        iprestamo.save(prestamo);
        respuesta.setRespuesta("Hola " +peticion.getNomcliente() + " acaba de apartar el libro "+peticion.getTitulolibro() + " hasta "+peticion.getFfin());
        return respuesta;  
    }

    //Ver todos los prestamos hace referencia a los elementos MostrarPrestamoRequest y MostrarPrestamoResponse del archivo prestamo.xsd
    @PayloadRoot(localPart = "MostrarPrestamoRequest" ,namespace = "https://t4is.uv.mx/prestamo")
    @ResponsePayload
    public MostrarPrestamoResponse mostrarprestamo() {
        
        MostrarPrestamoResponse respuesta = new MostrarPrestamoResponse();

        //Este método itera y recupera todos los prestamos almacenados en la base de datos.
        Iterable<Prestamo> lista = iprestamo.findAll();
        
        //Después de recuperar todos los prestamos generamos los objetos prestamos con cada uno de sus valores, los almacenamos
        //en la variable respuesta y los regresamos como respuesta en el microservicio.
        for (Prestamo o : lista) {
            MostrarPrestamoResponse.Prestamo e = new MostrarPrestamoResponse.Prestamo();
            e.setId(o.getId());
            e.setFinicio(o.getFinicio());
            e.setFfin(o.getFfin());
            e.setNomcliente(o.getNomcliente());
            e.setTitulolibro(o.getTitulolibro());
            e.setStatus(o.getStatus());
            e.setResponsable(o.getResponsable());
            respuesta.getPrestamo().add(e);
        }

        return respuesta;
    }

    //Renovar prestamo hace referencia a los elementos RenovarPrestamoRequest y RenovarPrestamoResponse del archivo prestamo.xsd
    @PayloadRoot(localPart = "RenovarPrestamoRequest" ,namespace = "https://t4is.uv.mx/prestamo")
    @ResponsePayload
    public RenovarPrestamoResponse renovarprestamo (@RequestPayload RenovarPrestamoRequest peticion){
        
        RenovarPrestamoResponse respuesta = new RenovarPrestamoResponse();

        //Esté metodo tiene como objetivo modificar la información de algun dato en el prestamo, como puede ser la fecha de inicio 
        //y la fecha de fin, aunque también es posible realizar modificaciones de los demás parametros si así se requiere, el único
        //valor que no debe ser cambiado es el id, ya que este permite hacer match en la base de datos para localizar el registro. La
        //respuesta que recibimos es un mensaje indicando el titulo de libro y la nueva fecha hasta la que estará realizado el prestamo

        Prestamo prestamo = new Prestamo();
        prestamo.setId(peticion.getId());
        prestamo.setFinicio(peticion.getFinicio());
        prestamo.setFfin(peticion.getFfin());
        prestamo.setNomcliente(peticion.getNomcliente());
        prestamo.setTitulolibro(peticion.getTitulolibro());
        prestamo.setStatus(peticion.getStatus());
        prestamo.setResponsable(peticion.getResponsable());
        iprestamo.save(prestamo);
        respuesta.setRespuesta("Ha renovado el prestamo del libro " +peticion.getTitulolibro() + " hasta el "+peticion.getFfin());
        
        return respuesta;
    }

    //Ver status del prestamo hace referencia a los elementos StatusPrestamoRequest y StatusPrestamoResponse del archivo prestamo.xsd
    @PayloadRoot(localPart = "StatusPrestamoRequest" ,namespace = "https://t4is.uv.mx/prestamo")
    @ResponsePayload
    public StatusPrestamoResponse statusprestamo (@RequestPayload StatusPrestamoRequest peticion){

        StatusPrestamoResponse respuesta = new StatusPrestamoResponse();
        
        //Este método itera y recupera todos los prestamos de la base de datos que correspondan al libro ingresado, se requieren de 2
        //parámetros los cuales son id y titulo del libro, estos valores son recuperados en peticion.getId() y peticion.getTituloLibro()
        //este método esta definido en la Interfaz IPrestamo
        Iterable<Prestamo> listaprestamos = iprestamo.findByIdAndTitulolibro(peticion.getId(), peticion.getTitulolibro());

        //Después de recuperar el prestamo ingresado, genera una respuesta en la que seran devueltos el titulo del libro y el estatus
        //del prestamo
        for (Prestamo prestamo : listaprestamos) {
            
           respuesta.setRespuesta("El status del libro: " + prestamo.getTitulolibro() + " es: " +prestamo.getStatus());
            

        }

        return respuesta;
    }

    //Buscar prestamo por cliente hace referencia a los elementos PrestamoPorClienteRequest y PrestamoPorClienteResponse del archivo prestamo.xsd
    @PayloadRoot(localPart = "PrestamoPorClienteRequest", namespace = "https://t4is.uv.mx/prestamo")
    @ResponsePayload
    public PrestamoPorClienteResponse prestamocliente (@RequestPayload PrestamoPorClienteRequest peticion){
        
        PrestamoPorClienteResponse respuesta = new PrestamoPorClienteResponse();
        
        //Este método itera y recupera todos los prestamos de la base de datos que correspondan al cliente ingresado en el campo nomCliente
        //y ese valor es recuperado en peticion.getNomCliente(), este metodo esta definido en la Interfaz IPrestamo
        Iterable<Prestamo> listaPrestamosCliente = iprestamo.findByNomcliente(peticion.getNomCliente());

        //Después de recuperar los prestamos del cliente, genera el objeto prestamo que será devuelto como response en el microservicio.
        for (Prestamo prestamo : listaPrestamosCliente) {
            PrestamoPorClienteResponse.Prestamo e = new PrestamoPorClienteResponse.Prestamo();
            e.setId(prestamo.getId());
            e.setFinicio(prestamo.getFinicio());
            e.setFfin(prestamo.getFfin());
            e.setNomcliente(prestamo.getNomcliente());
            e.setTitulolibro(prestamo.getTitulolibro());
            e.setStatus(prestamo.getStatus());
            e.setResponsable(prestamo.getResponsable());
            respuesta.getPrestamo().add(e);
         }
        return respuesta;
    }

}

