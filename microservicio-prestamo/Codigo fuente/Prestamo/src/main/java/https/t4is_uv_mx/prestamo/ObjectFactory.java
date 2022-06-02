//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.06.01 a las 07:07:42 PM CDT 
//


package https.t4is_uv_mx.prestamo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the https.t4is_uv_mx.prestamo package. 
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

    private final static QName _MostrarPrestamoRequest_QNAME = new QName("https://t4is.uv.mx/prestamo", "MostrarPrestamoRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: https.t4is_uv_mx.prestamo
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MostrarPrestamoResponse }
     * 
     */
    public MostrarPrestamoResponse createMostrarPrestamoResponse() {
        return new MostrarPrestamoResponse();
    }

    /**
     * Create an instance of {@link PrestamoPorClienteResponse }
     * 
     */
    public PrestamoPorClienteResponse createPrestamoPorClienteResponse() {
        return new PrestamoPorClienteResponse();
    }

    /**
     * Create an instance of {@link GuardarPrestamoRequest }
     * 
     */
    public GuardarPrestamoRequest createGuardarPrestamoRequest() {
        return new GuardarPrestamoRequest();
    }

    /**
     * Create an instance of {@link GuardarPrestamoResponse }
     * 
     */
    public GuardarPrestamoResponse createGuardarPrestamoResponse() {
        return new GuardarPrestamoResponse();
    }

    /**
     * Create an instance of {@link RenovarPrestamoRequest }
     * 
     */
    public RenovarPrestamoRequest createRenovarPrestamoRequest() {
        return new RenovarPrestamoRequest();
    }

    /**
     * Create an instance of {@link RenovarPrestamoResponse }
     * 
     */
    public RenovarPrestamoResponse createRenovarPrestamoResponse() {
        return new RenovarPrestamoResponse();
    }

    /**
     * Create an instance of {@link MostrarPrestamoResponse.Prestamo }
     * 
     */
    public MostrarPrestamoResponse.Prestamo createMostrarPrestamoResponsePrestamo() {
        return new MostrarPrestamoResponse.Prestamo();
    }

    /**
     * Create an instance of {@link StatusPrestamoRequest }
     * 
     */
    public StatusPrestamoRequest createStatusPrestamoRequest() {
        return new StatusPrestamoRequest();
    }

    /**
     * Create an instance of {@link StatusPrestamoResponse }
     * 
     */
    public StatusPrestamoResponse createStatusPrestamoResponse() {
        return new StatusPrestamoResponse();
    }

    /**
     * Create an instance of {@link PrestamoPorClienteRequest }
     * 
     */
    public PrestamoPorClienteRequest createPrestamoPorClienteRequest() {
        return new PrestamoPorClienteRequest();
    }

    /**
     * Create an instance of {@link PrestamoPorClienteResponse.Prestamo }
     * 
     */
    public PrestamoPorClienteResponse.Prestamo createPrestamoPorClienteResponsePrestamo() {
        return new PrestamoPorClienteResponse.Prestamo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "https://t4is.uv.mx/prestamo", name = "MostrarPrestamoRequest")
    public JAXBElement<Object> createMostrarPrestamoRequest(Object value) {
        return new JAXBElement<Object>(_MostrarPrestamoRequest_QNAME, Object.class, null, value);
    }

}
