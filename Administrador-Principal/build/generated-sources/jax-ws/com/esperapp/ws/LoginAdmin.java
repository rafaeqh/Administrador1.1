
package com.esperapp.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para loginAdmin complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="loginAdmin">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idCorreo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contra" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "loginAdmin", propOrder = {
    "idCorreo",
    "contra"
})
public class LoginAdmin {

    protected String idCorreo;
    protected String contra;

    /**
     * Obtiene el valor de la propiedad idCorreo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdCorreo() {
        return idCorreo;
    }

    /**
     * Define el valor de la propiedad idCorreo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdCorreo(String value) {
        this.idCorreo = value;
    }

    /**
     * Obtiene el valor de la propiedad contra.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContra() {
        return contra;
    }

    /**
     * Define el valor de la propiedad contra.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContra(String value) {
        this.contra = value;
    }

}
