
package com.esperapp.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AsignarTurno complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AsignarTurno">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CorreoUsuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_Sede" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="servicioId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AsignarTurno", propOrder = {
    "correoUsuario",
    "idSede",
    "servicioId"
})
public class AsignarTurno {

    @XmlElement(name = "CorreoUsuario")
    protected String correoUsuario;
    @XmlElement(name = "Id_Sede")
    protected String idSede;
    protected String servicioId;

    /**
     * Obtiene el valor de la propiedad correoUsuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorreoUsuario() {
        return correoUsuario;
    }

    /**
     * Define el valor de la propiedad correoUsuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorreoUsuario(String value) {
        this.correoUsuario = value;
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

    /**
     * Obtiene el valor de la propiedad servicioId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServicioId() {
        return servicioId;
    }

    /**
     * Define el valor de la propiedad servicioId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServicioId(String value) {
        this.servicioId = value;
    }

}
