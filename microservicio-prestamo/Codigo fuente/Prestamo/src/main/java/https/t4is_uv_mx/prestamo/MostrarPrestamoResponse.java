//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.06.01 a las 07:07:42 PM CDT 
//


package https.t4is_uv_mx.prestamo;

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
 *         &lt;element name="prestamo" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                   &lt;element name="finicio" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="ffin" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="nomcliente" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="titulolibro" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="responsable" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "prestamo"
})
@XmlRootElement(name = "MostrarPrestamoResponse")
public class MostrarPrestamoResponse {

    @XmlElement(required = true)
    protected List<MostrarPrestamoResponse.Prestamo> prestamo;

    /**
     * Gets the value of the prestamo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prestamo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrestamo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MostrarPrestamoResponse.Prestamo }
     * 
     * 
     */
    public List<MostrarPrestamoResponse.Prestamo> getPrestamo() {
        if (prestamo == null) {
            prestamo = new ArrayList<MostrarPrestamoResponse.Prestamo>();
        }
        return this.prestamo;
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
     *         &lt;element name="finicio" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="ffin" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="nomcliente" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="titulolibro" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="responsable" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "finicio",
        "ffin",
        "nomcliente",
        "titulolibro",
        "status",
        "responsable"
    })
    public static class Prestamo {

        protected int id;
        @XmlElement(required = true)
        protected String finicio;
        @XmlElement(required = true)
        protected String ffin;
        @XmlElement(required = true)
        protected String nomcliente;
        @XmlElement(required = true)
        protected String titulolibro;
        @XmlElement(required = true)
        protected String status;
        @XmlElement(required = true)
        protected String responsable;

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
         * Obtiene el valor de la propiedad finicio.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFinicio() {
            return finicio;
        }

        /**
         * Define el valor de la propiedad finicio.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFinicio(String value) {
            this.finicio = value;
        }

        /**
         * Obtiene el valor de la propiedad ffin.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFfin() {
            return ffin;
        }

        /**
         * Define el valor de la propiedad ffin.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFfin(String value) {
            this.ffin = value;
        }

        /**
         * Obtiene el valor de la propiedad nomcliente.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNomcliente() {
            return nomcliente;
        }

        /**
         * Define el valor de la propiedad nomcliente.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNomcliente(String value) {
            this.nomcliente = value;
        }

        /**
         * Obtiene el valor de la propiedad titulolibro.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTitulolibro() {
            return titulolibro;
        }

        /**
         * Define el valor de la propiedad titulolibro.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTitulolibro(String value) {
            this.titulolibro = value;
        }

        /**
         * Obtiene el valor de la propiedad status.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStatus() {
            return status;
        }

        /**
         * Define el valor de la propiedad status.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStatus(String value) {
            this.status = value;
        }

        /**
         * Obtiene el valor de la propiedad responsable.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getResponsable() {
            return responsable;
        }

        /**
         * Define el valor de la propiedad responsable.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setResponsable(String value) {
            this.responsable = value;
        }

    }

}
