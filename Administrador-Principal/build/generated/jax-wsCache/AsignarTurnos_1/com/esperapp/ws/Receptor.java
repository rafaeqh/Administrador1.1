
package com.esperapp.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para receptor complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="receptor">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="estado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idReceptor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idServicio" type="{http://ws.esperapp.com/}servicio" minOccurs="0"/>
 *         &lt;element ref="{http://ws.esperapp.com/}sede" minOccurs="0"/>
 *         &lt;element ref="{http://ws.esperapp.com/}trabajo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "receptor", propOrder = {
    "estado",
    "idReceptor",
    "idServicio",
    "sede",
    "trabajo"
})
public class Receptor {

    protected String estado;
    protected String idReceptor;
    protected Servicio idServicio;
    @XmlElement(namespace = "http://ws.esperapp.com/")
    protected Sede sede;
    @XmlElement(namespace = "http://ws.esperapp.com/")
    protected Trabajo trabajo;

    /**
     * Obtiene el valor de la propiedad estado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Define el valor de la propiedad estado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstado(String value) {
        this.estado = value;
    }

    /**
     * Obtiene el valor de la propiedad idReceptor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdReceptor() {
        return idReceptor;
    }

    /**
     * Define el valor de la propiedad idReceptor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdReceptor(String value) {
        this.idReceptor = value;
    }

    /**
     * Obtiene el valor de la propiedad idServicio.
     * 
     * @return
     *     possible object is
     *     {@link Servicio }
     *     
     */
    public Servicio getIdServicio() {
        return idServicio;
    }

    /**
     * Define el valor de la propiedad idServicio.
     * 
     * @param value
     *     allowed object is
     *     {@link Servicio }
     *     
     */
    public void setIdServicio(Servicio value) {
        this.idServicio = value;
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
     * Obtiene el valor de la propiedad trabajo.
     * 
     * @return
     *     possible object is
     *     {@link Trabajo }
     *     
     */
    public Trabajo getTrabajo() {
        return trabajo;
    }

    /**
     * Define el valor de la propiedad trabajo.
     * 
     * @param value
     *     allowed object is
     *     {@link Trabajo }
     *     
     */
    public void setTrabajo(Trabajo value) {
        this.trabajo = value;
    }

}
