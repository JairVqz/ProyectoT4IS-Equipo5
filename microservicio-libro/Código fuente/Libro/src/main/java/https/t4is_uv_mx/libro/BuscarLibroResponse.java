//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.05.19 a las 07:22:19 PM CDT 
//


package https.t4is_uv_mx.libro;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="libros" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                   &lt;element name="titulo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="autor" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="editorial" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="categoria" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="statusPrestamo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "libros"
})
@XmlRootElement(name = "BuscarLibroResponse")
public class BuscarLibroResponse {

    @XmlElement(required = true)
    protected List<BuscarLibroResponse.Libros> libros;

    /**
     * Gets the value of the libros property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the libros property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLibros().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BuscarLibroResponse.Libros }
     * 
     * 
     */
    public List<BuscarLibroResponse.Libros> getLibros() {
        if (libros == null) {
            libros = new ArrayList<BuscarLibroResponse.Libros>();
        }
        return this.libros;
    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *         &lt;element name="titulo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="autor" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="editorial" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="categoria" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="statusPrestamo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "id",
        "titulo",
        "autor",
        "editorial",
        "categoria",
        "descripcion",
        "statusPrestamo"
    })
    public static class Libros {

        protected int id;
        @XmlElement(required = true)
        protected String titulo;
        @XmlElement(required = true)
        protected String autor;
        @XmlElement(required = true)
        protected String editorial;
        @XmlElement(required = true)
        protected String categoria;
        @XmlElement(required = true)
        protected String descripcion;
        @XmlElement(required = true)
        protected String statusPrestamo;

        /**
         * Obtiene el valor de la propiedad id.
         * 
         */
        public int getId() {
            return id;
        }

        /**
         * Define el valor de la propiedad id.
         * 
         */
        public void setId(int value) {
            this.id = value;
        }

        /**
         * Obtiene el valor de la propiedad titulo.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTitulo() {
            return titulo;
        }

        /**
         * Define el valor de la propiedad titulo.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTitulo(String value) {
            this.titulo = value;
        }

        /**
         * Obtiene el valor de la propiedad autor.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAutor() {
            return autor;
        }

        /**
         * Define el valor de la propiedad autor.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAutor(String value) {
            this.autor = value;
        }

        /**
         * Obtiene el valor de la propiedad editorial.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEditorial() {
            return editorial;
        }

        /**
         * Define el valor de la propiedad editorial.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEditorial(String value) {
            this.editorial = value;
        }

        /**
         * Obtiene el valor de la propiedad categoria.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCategoria() {
            return categoria;
        }

        /**
         * Define el valor de la propiedad categoria.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCategoria(String value) {
            this.categoria = value;
        }

        /**
         * Obtiene el valor de la propiedad descripcion.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDescripcion() {
            return descripcion;
        }

        /**
         * Define el valor de la propiedad descripcion.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDescripcion(String value) {
            this.descripcion = value;
        }

        /**
         * Obtiene el valor de la propiedad statusPrestamo.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStatusPrestamo() {
            return statusPrestamo;
        }

        /**
         * Define el valor de la propiedad statusPrestamo.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStatusPrestamo(String value) {
            this.statusPrestamo = value;
        }

    }

}
