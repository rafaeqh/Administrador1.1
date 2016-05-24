
package com.esperapp.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para enviarTrabajo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="enviarTrabajo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
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
@XmlType(name = "enviarTrabajo", propOrder = {
    "trabajo"
})
public class EnviarTrabajo {

    @XmlElement(namespace = "http://ws.esperapp.com/")
    protected Trabajo trabajo;

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
