
package com.esperapp.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para trabajo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="trabajo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://ws.esperapp.com/}empleado" minOccurs="0"/>
 *         &lt;element name="receptor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="receptor1" type="{http://ws.esperapp.com/}receptor" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "trabajo", propOrder = {
    "empleado",
    "receptor",
    "receptor1"
})
public class Trabajo {

    @XmlElement(namespace = "http://ws.esperapp.com/")
    protected Empleado empleado;
    protected String receptor;
    protected Receptor receptor1;

    /**
     * Obtiene el valor de la propiedad empleado.
     * 
     * @return
     *     possible object is
     *     {@link Empleado }
     *     
     */
    public Empleado getEmpleado() {
        return empleado;
    }

    /**
     * Define el valor de la propiedad empleado.
     * 
     * @param value
     *     allowed object is
     *     {@link Empleado }
     *     
     */
    public void setEmpleado(Empleado value) {
        this.empleado = value;
    }

    /**
     * Obtiene el valor de la propiedad receptor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceptor() {
        return receptor;
    }

    /**
     * Define el valor de la propiedad receptor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceptor(String value) {
        this.receptor = value;
    }

    /**
     * Obtiene el valor de la propiedad receptor1.
     * 
     * @return
     *     possible object is
     *     {@link Receptor }
     *     
     */
    public Receptor getReceptor1() {
        return receptor1;
    }

    /**
     * Define el valor de la propiedad receptor1.
     * 
     * @param value
     *     allowed object is
     *     {@link Receptor }
     *     
     */
    public void setReceptor1(Receptor value) {
        this.receptor1 = value;
    }

}
