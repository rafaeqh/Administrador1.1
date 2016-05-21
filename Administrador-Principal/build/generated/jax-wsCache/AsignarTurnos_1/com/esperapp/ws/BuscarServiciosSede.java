
package com.esperapp.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para BuscarServiciosSede complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="BuscarServiciosSede">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoSede" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BuscarServiciosSede", propOrder = {
    "codigoSede"
})
public class BuscarServiciosSede {

    protected String codigoSede;

    /**
     * Obtiene el valor de la propiedad codigoSede.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoSede() {
        return codigoSede;
    }

    /**
     * Define el valor de la propiedad codigoSede.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoSede(String value) {
        this.codigoSede = value;
    }

}
