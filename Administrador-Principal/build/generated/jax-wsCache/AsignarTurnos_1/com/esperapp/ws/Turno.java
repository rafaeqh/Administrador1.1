
package com.esperapp.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para turno complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="turno">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="atendido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fecha" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="idTurno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numTurno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://ws.esperapp.com/}sede" minOccurs="0"/>
 *         &lt;element name="servicioID" type="{http://ws.esperapp.com/}servicio" minOccurs="0"/>
 *         &lt;element ref="{http://ws.esperapp.com/}usuario" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "turno", propOrder = {
    "atendido",
    "fecha",
    "idTurno",
    "numTurno",
    "sede",
    "servicioID",
    "usuario"
})
public class Turno {

    protected String atendido;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fecha;
    protected String idTurno;
    protected String numTurno;
    @XmlElement(namespace = "http://ws.esperapp.com/")
    protected Sede sede;
    protected Servicio servicioID;
    @XmlElement(namespace = "http://ws.esperapp.com/")
    protected Usuario usuario;

    /**
     * Obtiene el valor de la propiedad atendido.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAtendido() {
        return atendido;
    }

    /**
     * Define el valor de la propiedad atendido.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAtendido(String value) {
        this.atendido = value;
    }

    /**
     * Obtiene el valor de la propiedad fecha.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFecha() {
        return fecha;
    }

    /**
     * Define el valor de la propiedad fecha.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFecha(XMLGregorianCalendar value) {
        this.fecha = value;
    }

    /**
     * Obtiene el valor de la propiedad idTurno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdTurno() {
        return idTurno;
    }

    /**
     * Define el valor de la propiedad idTurno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdTurno(String value) {
        this.idTurno = value;
    }

    /**
     * Obtiene el valor de la propiedad numTurno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumTurno() {
        return numTurno;
    }

    /**
     * Define el valor de la propiedad numTurno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumTurno(String value) {
        this.numTurno = value;
    }

    /**
     * Obtiene el valor de la propiedad sede.
     * 
     * @return
     *     possible object is
     *     {@link Sede }
     *     
     */
    public Sede getSede() {
        return sede;
    }

    /**
     * Define el valor de la propiedad sede.
     * 
     * @param value
     *     allowed object is
     *     {@link Sede }
     *     
     */
    public void setSede(Sede value) {
        this.sede = value;
    }

    /**
     * Obtiene el valor de la propiedad servicioID.
     * 
     * @return
     *     possible object is
     *     {@link Servicio }
     *     
     */
    public Servicio getServicioID() {
        return servicioID;
    }

    /**
     * Define el valor de la propiedad servicioID.
     * 
     * @param value
     *     allowed object is
     *     {@link Servicio }
     *     
     */
    public void setServicioID(Servicio value) {
        this.servicioID = value;
    }

    /**
     * Obtiene el valor de la propiedad usuario.
     * 
     * @return
     *     possible object is
     *     {@link Usuario }
     *     
     */
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * Define el valor de la propiedad usuario.
     * 
     * @param value
     *     allowed object is
     *     {@link Usuario }
     *     
     */
    public void setUsuario(Usuario value) {
        this.usuario = value;
    }

}
