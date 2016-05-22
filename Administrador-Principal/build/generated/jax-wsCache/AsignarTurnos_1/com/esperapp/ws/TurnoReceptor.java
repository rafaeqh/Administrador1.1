
package com.esperapp.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TurnoReceptor complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TurnoReceptor">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cedulaEmp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idSede" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TurnoReceptor", propOrder = {
    "cedulaEmp",
    "idSede"
})
public class TurnoReceptor {

    protected String cedulaEmp;
    protected String idSede;

    /**
     * Obtiene el valor de la propiedad cedulaEmp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCedulaEmp() {
        return cedulaEmp;
    }

    /**
     * Define el valor de la propiedad cedulaEmp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCedulaEmp(String value) {
        this.cedulaEmp = value;
    }

    /**
     * Obtiene el valor de la propiedad idSede.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdSede() {
        return idSede;
    }

    /**
     * Define el valor de la propiedad idSede.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdSede(String value) {
        this.idSede = value;
    }

}
