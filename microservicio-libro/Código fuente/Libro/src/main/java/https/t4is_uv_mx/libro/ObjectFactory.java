//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.05.19 a las 07:22:19 PM CDT 
//


package https.t4is_uv_mx.libro;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the https.t4is_uv_mx.libro package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _MostrarLibrosRequest_QNAME = new QName("https://t4is.uv.mx/libro", "MostrarLibrosRequest");
    private final static QName _TotalLibroRequest_QNAME = new QName("https://t4is.uv.mx/libro", "TotalLibroRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: https.t4is_uv_mx.libro
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BuscarLibroResponse }
     * 
     */
    public BuscarLibroResponse createBuscarLibroResponse() {
        return new BuscarLibroResponse();
    }

    /**
     * Create an instance of {@link MostrarLibrosResponse }
     * 
     */
    public MostrarLibrosResponse createMostrarLibrosResponse() {
        return new MostrarLibrosResponse();
    }

    /**
     * Create an instance of {@link GuardarLibroRequest }
     * 
     */
    public GuardarLibroRequest createGuardarLibroRequest() {
        return new GuardarLibroRequest();
    }

    /**
     * Create an instance of {@link GuardarLibroResponse }
     * 
     */
    public GuardarLibroResponse createGuardarLibroResponse() {
        return new GuardarLibroResponse();
    }

    /**
     * Create an instance of {@link BuscarLibroRequest }
     * 
     */
    public BuscarLibroRequest createBuscarLibroRequest() {
        return new BuscarLibroRequest();
    }

    /**
     * Create an instance of {@link BuscarLibroResponse.Libros }
     * 
     */
    public BuscarLibroResponse.Libros createBuscarLibroResponseLibros() {
        return new BuscarLibroResponse.Libros();
    }

    /**
     * Create an instance of {@link MostrarLibrosResponse.Libros }
     * 
     */
    public MostrarLibrosResponse.Libros createMostrarLibrosResponseLibros() {
        return new MostrarLibrosResponse.Libros();
    }

    /**
     * Create an instance of {@link ModificarLibroRequest }
     * 
     */
    public ModificarLibroRequest createModificarLibroRequest() {
        return new ModificarLibroRequest();
    }

    /**
     * Create an instance of {@link ModificarLibroResponse }
     * 
     */
    public ModificarLibroResponse createModificarLibroResponse() {
        return new ModificarLibroResponse();
    }

    /**
     * Create an instance of {@link EliminarLibroRequest }
     * 
     */
    public EliminarLibroRequest createEliminarLibroRequest() {
        return new EliminarLibroRequest();
    }

    /**
     * Create an instance of {@link EliminarLibroResponse }
     * 
     */
    public EliminarLibroResponse createEliminarLibroResponse() {
        return new EliminarLibroResponse();
    }

    /**
     * Create an instance of {@link TotalLibroResponse }
     * 
     */
    public TotalLibroResponse createTotalLibroResponse() {
        return new TotalLibroResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "https://t4is.uv.mx/libro", name = "MostrarLibrosRequest")
    public JAXBElement<Object> createMostrarLibrosRequest(Object value) {
        return new JAXBElement<Object>(_MostrarLibrosRequest_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "https://t4is.uv.mx/libro", name = "TotalLibroRequest")
    public JAXBElement<Object> createTotalLibroRequest(Object value) {
        return new JAXBElement<Object>(_TotalLibroRequest_QNAME, Object.class, null, value);
    }

}
