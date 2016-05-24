
package com.esperapp.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RegistrarComoAtendido complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RegistrarComoAtendido">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idTurno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idReceptor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegistrarComoAtendido", propOrder = {
    "idTurno",
    "idReceptor"
})
public class RegistrarComoAtendido {

    protected String idTurno;
    protected String idReceptor;

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

}
