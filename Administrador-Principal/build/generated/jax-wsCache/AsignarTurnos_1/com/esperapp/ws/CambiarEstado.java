
package com.esperapp.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CambiarEstado complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CambiarEstado">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_Receptor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CambiarEstado", propOrder = {
    "idReceptor"
})
public class CambiarEstado {

    @XmlElement(name = "Id_Receptor")
    protected String idReceptor;

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
