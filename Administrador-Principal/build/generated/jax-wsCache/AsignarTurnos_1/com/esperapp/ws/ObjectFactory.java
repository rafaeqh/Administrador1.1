
package com.esperapp.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.esperapp.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AgregarEntidadResponse_QNAME = new QName("http://ws.esperapp.com/", "AgregarEntidadResponse");
    private final static QName _AgregarEmpleado_QNAME = new QName("http://ws.esperapp.com/", "AgregarEmpleado");
    private final static QName _LoginAdminResponse_QNAME = new QName("http://ws.esperapp.com/", "loginAdminResponse");
    private final static QName _AgregarSede_QNAME = new QName("http://ws.esperapp.com/", "AgregarSede");
    private final static QName _LoginEmpleado_QNAME = new QName("http://ws.esperapp.com/", "loginEmpleado");
    private final static QName _BuscarSedeResponse_QNAME = new QName("http://ws.esperapp.com/", "BuscarSedeResponse");
    private final static QName _AsignarTurno_QNAME = new QName("http://ws.esperapp.com/", "AsignarTurno");
    private final static QName _Sede_QNAME = new QName("http://ws.esperapp.com/", "sede");
    private final static QName _BuscarServiciosSedeResponse_QNAME = new QName("http://ws.esperapp.com/", "BuscarServiciosSedeResponse");
    private final static QName _AgregarServicioResponse_QNAME = new QName("http://ws.esperapp.com/", "AgregarServicioResponse");
    private final static QName _BuscarEmpleado_QNAME = new QName("http://ws.esperapp.com/", "BuscarEmpleado");
    private final static QName _BuscarSede_QNAME = new QName("http://ws.esperapp.com/", "BuscarSede");
    private final static QName _AgregarSedeResponse_QNAME = new QName("http://ws.esperapp.com/", "AgregarSedeResponse");
    private final static QName _AgregarEmpleadoResponse_QNAME = new QName("http://ws.esperapp.com/", "AgregarEmpleadoResponse");
    private final static QName _AgregarReceptorResponse_QNAME = new QName("http://ws.esperapp.com/", "AgregarReceptorResponse");
    private final static QName _RegistrarUsuarioResponse_QNAME = new QName("http://ws.esperapp.com/", "RegistrarUsuarioResponse");
    private final static QName _BuscarEntidadesNombres_QNAME = new QName("http://ws.esperapp.com/", "BuscarEntidadesNombres");
    private final static QName _BuscarServiciosSede_QNAME = new QName("http://ws.esperapp.com/", "BuscarServiciosSede");
    private final static QName _BuscarEntidadResponse_QNAME = new QName("http://ws.esperapp.com/", "BuscarEntidadResponse");
    private final static QName _LoginUsuario_QNAME = new QName("http://ws.esperapp.com/", "loginUsuario");
    private final static QName _Servicio_QNAME = new QName("http://ws.esperapp.com/", "servicio");
    private final static QName _AgregarServicio_QNAME = new QName("http://ws.esperapp.com/", "AgregarServicio");
    private final static QName _Empleado_QNAME = new QName("http://ws.esperapp.com/", "empleado");
    private final static QName _AgregarReceptor_QNAME = new QName("http://ws.esperapp.com/", "AgregarReceptor");
    private final static QName _AgregarEntidad_QNAME = new QName("http://ws.esperapp.com/", "AgregarEntidad");
    private final static QName _BuscarSedeCodigo_QNAME = new QName("http://ws.esperapp.com/", "BuscarSedeCodigo");
    private final static QName _BuscarEmpleadoResponse_QNAME = new QName("http://ws.esperapp.com/", "BuscarEmpleadoResponse");
    private final static QName _Entidad_QNAME = new QName("http://ws.esperapp.com/", "entidad");
    private final static QName _LoginEmpleadoResponse_QNAME = new QName("http://ws.esperapp.com/", "loginEmpleadoResponse");
    private final static QName _LoginUsuarioResponse_QNAME = new QName("http://ws.esperapp.com/", "loginUsuarioResponse");
    private final static QName _BuscarSedesClase_QNAME = new QName("http://ws.esperapp.com/", "BuscarSedesClase");
    private final static QName _BuscarSedeCodigoResponse_QNAME = new QName("http://ws.esperapp.com/", "BuscarSedeCodigoResponse");
    private final static QName _BuscarEntidadesNombresResponse_QNAME = new QName("http://ws.esperapp.com/", "BuscarEntidadesNombresResponse");
    private final static QName _AsignarTurnoResponse_QNAME = new QName("http://ws.esperapp.com/", "AsignarTurnoResponse");
    private final static QName _LoginAdmin_QNAME = new QName("http://ws.esperapp.com/", "loginAdmin");
    private final static QName _BuscarEntidad_QNAME = new QName("http://ws.esperapp.com/", "BuscarEntidad");
    private final static QName _RegistrarUsuario_QNAME = new QName("http://ws.esperapp.com/", "RegistrarUsuario");
    private final static QName _BuscarSedesClaseResponse_QNAME = new QName("http://ws.esperapp.com/", "BuscarSedesClaseResponse");
    private final static QName _Hello_QNAME = new QName("http://ws.esperapp.com/", "hello");
    private final static QName _CambiarEstado_QNAME = new QName("http://ws.esperapp.com/", "CambiarEstado");
    private final static QName _HelloResponse_QNAME = new QName("http://ws.esperapp.com/", "helloResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.esperapp.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BuscarSedeResponse }
     * 
     */
    public BuscarSedeResponse createBuscarSedeResponse() {
        return new BuscarSedeResponse();
    }

    /**
     * Create an instance of {@link LoginEmpleado }
     * 
     */
    public LoginEmpleado createLoginEmpleado() {
        return new LoginEmpleado();
    }

    /**
     * Create an instance of {@link AgregarSede }
     * 
     */
    public AgregarSede createAgregarSede() {
        return new AgregarSede();
    }

    /**
     * Create an instance of {@link AsignarTurno }
     * 
     */
    public AsignarTurno createAsignarTurno() {
        return new AsignarTurno();
    }

    /**
     * Create an instance of {@link Sede }
     * 
     */
    public Sede createSede() {
        return new Sede();
    }

    /**
     * Create an instance of {@link AgregarEntidadResponse }
     * 
     */
    public AgregarEntidadResponse createAgregarEntidadResponse() {
        return new AgregarEntidadResponse();
    }

    /**
     * Create an instance of {@link AgregarEmpleado }
     * 
     */
    public AgregarEmpleado createAgregarEmpleado() {
        return new AgregarEmpleado();
    }

    /**
     * Create an instance of {@link LoginAdminResponse }
     * 
     */
    public LoginAdminResponse createLoginAdminResponse() {
        return new LoginAdminResponse();
    }

    /**
     * Create an instance of {@link BuscarSede }
     * 
     */
    public BuscarSede createBuscarSede() {
        return new BuscarSede();
    }

    /**
     * Create an instance of {@link AgregarEmpleadoResponse }
     * 
     */
    public AgregarEmpleadoResponse createAgregarEmpleadoResponse() {
        return new AgregarEmpleadoResponse();
    }

    /**
     * Create an instance of {@link AgregarSedeResponse }
     * 
     */
    public AgregarSedeResponse createAgregarSedeResponse() {
        return new AgregarSedeResponse();
    }

    /**
     * Create an instance of {@link AgregarReceptorResponse }
     * 
     */
    public AgregarReceptorResponse createAgregarReceptorResponse() {
        return new AgregarReceptorResponse();
    }

    /**
     * Create an instance of {@link BuscarServiciosSedeResponse }
     * 
     */
    public BuscarServiciosSedeResponse createBuscarServiciosSedeResponse() {
        return new BuscarServiciosSedeResponse();
    }

    /**
     * Create an instance of {@link BuscarEmpleado }
     * 
     */
    public BuscarEmpleado createBuscarEmpleado() {
        return new BuscarEmpleado();
    }

    /**
     * Create an instance of {@link AgregarServicioResponse }
     * 
     */
    public AgregarServicioResponse createAgregarServicioResponse() {
        return new AgregarServicioResponse();
    }

    /**
     * Create an instance of {@link Servicio }
     * 
     */
    public Servicio createServicio() {
        return new Servicio();
    }

    /**
     * Create an instance of {@link AgregarServicio }
     * 
     */
    public AgregarServicio createAgregarServicio() {
        return new AgregarServicio();
    }

    /**
     * Create an instance of {@link Empleado }
     * 
     */
    public Empleado createEmpleado() {
        return new Empleado();
    }

    /**
     * Create an instance of {@link AgregarReceptor }
     * 
     */
    public AgregarReceptor createAgregarReceptor() {
        return new AgregarReceptor();
    }

    /**
     * Create an instance of {@link AgregarEntidad }
     * 
     */
    public AgregarEntidad createAgregarEntidad() {
        return new AgregarEntidad();
    }

    /**
     * Create an instance of {@link BuscarSedeCodigo }
     * 
     */
    public BuscarSedeCodigo createBuscarSedeCodigo() {
        return new BuscarSedeCodigo();
    }

    /**
     * Create an instance of {@link RegistrarUsuarioResponse }
     * 
     */
    public RegistrarUsuarioResponse createRegistrarUsuarioResponse() {
        return new RegistrarUsuarioResponse();
    }

    /**
     * Create an instance of {@link BuscarServiciosSede }
     * 
     */
    public BuscarServiciosSede createBuscarServiciosSede() {
        return new BuscarServiciosSede();
    }

    /**
     * Create an instance of {@link BuscarEntidadesNombres }
     * 
     */
    public BuscarEntidadesNombres createBuscarEntidadesNombres() {
        return new BuscarEntidadesNombres();
    }

    /**
     * Create an instance of {@link LoginUsuario }
     * 
     */
    public LoginUsuario createLoginUsuario() {
        return new LoginUsuario();
    }

    /**
     * Create an instance of {@link BuscarEntidadResponse }
     * 
     */
    public BuscarEntidadResponse createBuscarEntidadResponse() {
        return new BuscarEntidadResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link BuscarSedesClaseResponse }
     * 
     */
    public BuscarSedesClaseResponse createBuscarSedesClaseResponse() {
        return new BuscarSedesClaseResponse();
    }

    /**
     * Create an instance of {@link CambiarEstado }
     * 
     */
    public CambiarEstado createCambiarEstado() {
        return new CambiarEstado();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link LoginUsuarioResponse }
     * 
     */
    public LoginUsuarioResponse createLoginUsuarioResponse() {
        return new LoginUsuarioResponse();
    }

    /**
     * Create an instance of {@link LoginEmpleadoResponse }
     * 
     */
    public LoginEmpleadoResponse createLoginEmpleadoResponse() {
        return new LoginEmpleadoResponse();
    }

    /**
     * Create an instance of {@link Entidad }
     * 
     */
    public Entidad createEntidad() {
        return new Entidad();
    }

    /**
     * Create an instance of {@link BuscarEmpleadoResponse }
     * 
     */
    public BuscarEmpleadoResponse createBuscarEmpleadoResponse() {
        return new BuscarEmpleadoResponse();
    }

    /**
     * Create an instance of {@link LoginAdmin }
     * 
     */
    public LoginAdmin createLoginAdmin() {
        return new LoginAdmin();
    }

    /**
     * Create an instance of {@link AsignarTurnoResponse }
     * 
     */
    public AsignarTurnoResponse createAsignarTurnoResponse() {
        return new AsignarTurnoResponse();
    }

    /**
     * Create an instance of {@link BuscarEntidadesNombresResponse }
     * 
     */
    public BuscarEntidadesNombresResponse createBuscarEntidadesNombresResponse() {
        return new BuscarEntidadesNombresResponse();
    }

    /**
     * Create an instance of {@link BuscarSedeCodigoResponse }
     * 
     */
    public BuscarSedeCodigoResponse createBuscarSedeCodigoResponse() {
        return new BuscarSedeCodigoResponse();
    }

    /**
     * Create an instance of {@link BuscarSedesClase }
     * 
     */
    public BuscarSedesClase createBuscarSedesClase() {
        return new BuscarSedesClase();
    }

    /**
     * Create an instance of {@link BuscarEntidad }
     * 
     */
    public BuscarEntidad createBuscarEntidad() {
        return new BuscarEntidad();
    }

    /**
     * Create an instance of {@link RegistrarUsuario }
     * 
     */
    public RegistrarUsuario createRegistrarUsuario() {
        return new RegistrarUsuario();
    }

    /**
     * Create an instance of {@link EmpleadoPK }
     * 
     */
    public EmpleadoPK createEmpleadoPK() {
        return new EmpleadoPK();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgregarEntidadResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.esperapp.com/", name = "AgregarEntidadResponse")
    public JAXBElement<AgregarEntidadResponse> createAgregarEntidadResponse(AgregarEntidadResponse value) {
        return new JAXBElement<AgregarEntidadResponse>(_AgregarEntidadResponse_QNAME, AgregarEntidadResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgregarEmpleado }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.esperapp.com/", name = "AgregarEmpleado")
    public JAXBElement<AgregarEmpleado> createAgregarEmpleado(AgregarEmpleado value) {
        return new JAXBElement<AgregarEmpleado>(_AgregarEmpleado_QNAME, AgregarEmpleado.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginAdminResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.esperapp.com/", name = "loginAdminResponse")
    public JAXBElement<LoginAdminResponse> createLoginAdminResponse(LoginAdminResponse value) {
        return new JAXBElement<LoginAdminResponse>(_LoginAdminResponse_QNAME, LoginAdminResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgregarSede }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.esperapp.com/", name = "AgregarSede")
    public JAXBElement<AgregarSede> createAgregarSede(AgregarSede value) {
        return new JAXBElement<AgregarSede>(_AgregarSede_QNAME, AgregarSede.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginEmpleado }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.esperapp.com/", name = "loginEmpleado")
    public JAXBElement<LoginEmpleado> createLoginEmpleado(LoginEmpleado value) {
        return new JAXBElement<LoginEmpleado>(_LoginEmpleado_QNAME, LoginEmpleado.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarSedeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.esperapp.com/", name = "BuscarSedeResponse")
    public JAXBElement<BuscarSedeResponse> createBuscarSedeResponse(BuscarSedeResponse value) {
        return new JAXBElement<BuscarSedeResponse>(_BuscarSedeResponse_QNAME, BuscarSedeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AsignarTurno }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.esperapp.com/", name = "AsignarTurno")
    public JAXBElement<AsignarTurno> createAsignarTurno(AsignarTurno value) {
        return new JAXBElement<AsignarTurno>(_AsignarTurno_QNAME, AsignarTurno.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Sede }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.esperapp.com/", name = "sede")
    public JAXBElement<Sede> createSede(Sede value) {
        return new JAXBElement<Sede>(_Sede_QNAME, Sede.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarServiciosSedeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.esperapp.com/", name = "BuscarServiciosSedeResponse")
    public JAXBElement<BuscarServiciosSedeResponse> createBuscarServiciosSedeResponse(BuscarServiciosSedeResponse value) {
        return new JAXBElement<BuscarServiciosSedeResponse>(_BuscarServiciosSedeResponse_QNAME, BuscarServiciosSedeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgregarServicioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.esperapp.com/", name = "AgregarServicioResponse")
    public JAXBElement<AgregarServicioResponse> createAgregarServicioResponse(AgregarServicioResponse value) {
        return new JAXBElement<AgregarServicioResponse>(_AgregarServicioResponse_QNAME, AgregarServicioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarEmpleado }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.esperapp.com/", name = "BuscarEmpleado")
    public JAXBElement<BuscarEmpleado> createBuscarEmpleado(BuscarEmpleado value) {
        return new JAXBElement<BuscarEmpleado>(_BuscarEmpleado_QNAME, BuscarEmpleado.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarSede }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.esperapp.com/", name = "BuscarSede")
    public JAXBElement<BuscarSede> createBuscarSede(BuscarSede value) {
        return new JAXBElement<BuscarSede>(_BuscarSede_QNAME, BuscarSede.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgregarSedeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.esperapp.com/", name = "AgregarSedeResponse")
    public JAXBElement<AgregarSedeResponse> createAgregarSedeResponse(AgregarSedeResponse value) {
        return new JAXBElement<AgregarSedeResponse>(_AgregarSedeResponse_QNAME, AgregarSedeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgregarEmpleadoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.esperapp.com/", name = "AgregarEmpleadoResponse")
    public JAXBElement<AgregarEmpleadoResponse> createAgregarEmpleadoResponse(AgregarEmpleadoResponse value) {
        return new JAXBElement<AgregarEmpleadoResponse>(_AgregarEmpleadoResponse_QNAME, AgregarEmpleadoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgregarReceptorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.esperapp.com/", name = "AgregarReceptorResponse")
    public JAXBElement<AgregarReceptorResponse> createAgregarReceptorResponse(AgregarReceptorResponse value) {
        return new JAXBElement<AgregarReceptorResponse>(_AgregarReceptorResponse_QNAME, AgregarReceptorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrarUsuarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.esperapp.com/", name = "RegistrarUsuarioResponse")
    public JAXBElement<RegistrarUsuarioResponse> createRegistrarUsuarioResponse(RegistrarUsuarioResponse value) {
        return new JAXBElement<RegistrarUsuarioResponse>(_RegistrarUsuarioResponse_QNAME, RegistrarUsuarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarEntidadesNombres }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.esperapp.com/", name = "BuscarEntidadesNombres")
    public JAXBElement<BuscarEntidadesNombres> createBuscarEntidadesNombres(BuscarEntidadesNombres value) {
        return new JAXBElement<BuscarEntidadesNombres>(_BuscarEntidadesNombres_QNAME, BuscarEntidadesNombres.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarServiciosSede }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.esperapp.com/", name = "BuscarServiciosSede")
    public JAXBElement<BuscarServiciosSede> createBuscarServiciosSede(BuscarServiciosSede value) {
        return new JAXBElement<BuscarServiciosSede>(_BuscarServiciosSede_QNAME, BuscarServiciosSede.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarEntidadResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.esperapp.com/", name = "BuscarEntidadResponse")
    public JAXBElement<BuscarEntidadResponse> createBuscarEntidadResponse(BuscarEntidadResponse value) {
        return new JAXBElement<BuscarEntidadResponse>(_BuscarEntidadResponse_QNAME, BuscarEntidadResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.esperapp.com/", name = "loginUsuario")
    public JAXBElement<LoginUsuario> createLoginUsuario(LoginUsuario value) {
        return new JAXBElement<LoginUsuario>(_LoginUsuario_QNAME, LoginUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Servicio }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.esperapp.com/", name = "servicio")
    public JAXBElement<Servicio> createServicio(Servicio value) {
        return new JAXBElement<Servicio>(_Servicio_QNAME, Servicio.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgregarServicio }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.esperapp.com/", name = "AgregarServicio")
    public JAXBElement<AgregarServicio> createAgregarServicio(AgregarServicio value) {
        return new JAXBElement<AgregarServicio>(_AgregarServicio_QNAME, AgregarServicio.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Empleado }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.esperapp.com/", name = "empleado")
    public JAXBElement<Empleado> createEmpleado(Empleado value) {
        return new JAXBElement<Empleado>(_Empleado_QNAME, Empleado.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgregarReceptor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.esperapp.com/", name = "AgregarReceptor")
    public JAXBElement<AgregarReceptor> createAgregarReceptor(AgregarReceptor value) {
        return new JAXBElement<AgregarReceptor>(_AgregarReceptor_QNAME, AgregarReceptor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgregarEntidad }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.esperapp.com/", name = "AgregarEntidad")
    public JAXBElement<AgregarEntidad> createAgregarEntidad(AgregarEntidad value) {
        return new JAXBElement<AgregarEntidad>(_AgregarEntidad_QNAME, AgregarEntidad.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarSedeCodigo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.esperapp.com/", name = "BuscarSedeCodigo")
    public JAXBElement<BuscarSedeCodigo> createBuscarSedeCodigo(BuscarSedeCodigo value) {
        return new JAXBElement<BuscarSedeCodigo>(_BuscarSedeCodigo_QNAME, BuscarSedeCodigo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarEmpleadoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.esperapp.com/", name = "BuscarEmpleadoResponse")
    public JAXBElement<BuscarEmpleadoResponse> createBuscarEmpleadoResponse(BuscarEmpleadoResponse value) {
        return new JAXBElement<BuscarEmpleadoResponse>(_BuscarEmpleadoResponse_QNAME, BuscarEmpleadoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Entidad }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.esperapp.com/", name = "entidad")
    public JAXBElement<Entidad> createEntidad(Entidad value) {
        return new JAXBElement<Entidad>(_Entidad_QNAME, Entidad.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginEmpleadoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.esperapp.com/", name = "loginEmpleadoResponse")
    public JAXBElement<LoginEmpleadoResponse> createLoginEmpleadoResponse(LoginEmpleadoResponse value) {
        return new JAXBElement<LoginEmpleadoResponse>(_LoginEmpleadoResponse_QNAME, LoginEmpleadoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginUsuarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.esperapp.com/", name = "loginUsuarioResponse")
    public JAXBElement<LoginUsuarioResponse> createLoginUsuarioResponse(LoginUsuarioResponse value) {
        return new JAXBElement<LoginUsuarioResponse>(_LoginUsuarioResponse_QNAME, LoginUsuarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarSedesClase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.esperapp.com/", name = "BuscarSedesClase")
    public JAXBElement<BuscarSedesClase> createBuscarSedesClase(BuscarSedesClase value) {
        return new JAXBElement<BuscarSedesClase>(_BuscarSedesClase_QNAME, BuscarSedesClase.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarSedeCodigoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.esperapp.com/", name = "BuscarSedeCodigoResponse")
    public JAXBElement<BuscarSedeCodigoResponse> createBuscarSedeCodigoResponse(BuscarSedeCodigoResponse value) {
        return new JAXBElement<BuscarSedeCodigoResponse>(_BuscarSedeCodigoResponse_QNAME, BuscarSedeCodigoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarEntidadesNombresResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.esperapp.com/", name = "BuscarEntidadesNombresResponse")
    public JAXBElement<BuscarEntidadesNombresResponse> createBuscarEntidadesNombresResponse(BuscarEntidadesNombresResponse value) {
        return new JAXBElement<BuscarEntidadesNombresResponse>(_BuscarEntidadesNombresResponse_QNAME, BuscarEntidadesNombresResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AsignarTurnoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.esperapp.com/", name = "AsignarTurnoResponse")
    public JAXBElement<AsignarTurnoResponse> createAsignarTurnoResponse(AsignarTurnoResponse value) {
        return new JAXBElement<AsignarTurnoResponse>(_AsignarTurnoResponse_QNAME, AsignarTurnoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginAdmin }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.esperapp.com/", name = "loginAdmin")
    public JAXBElement<LoginAdmin> createLoginAdmin(LoginAdmin value) {
        return new JAXBElement<LoginAdmin>(_LoginAdmin_QNAME, LoginAdmin.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarEntidad }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.esperapp.com/", name = "BuscarEntidad")
    public JAXBElement<BuscarEntidad> createBuscarEntidad(BuscarEntidad value) {
        return new JAXBElement<BuscarEntidad>(_BuscarEntidad_QNAME, BuscarEntidad.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrarUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.esperapp.com/", name = "RegistrarUsuario")
    public JAXBElement<RegistrarUsuario> createRegistrarUsuario(RegistrarUsuario value) {
        return new JAXBElement<RegistrarUsuario>(_RegistrarUsuario_QNAME, RegistrarUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarSedesClaseResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.esperapp.com/", name = "BuscarSedesClaseResponse")
    public JAXBElement<BuscarSedesClaseResponse> createBuscarSedesClaseResponse(BuscarSedesClaseResponse value) {
        return new JAXBElement<BuscarSedesClaseResponse>(_BuscarSedesClaseResponse_QNAME, BuscarSedesClaseResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.esperapp.com/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CambiarEstado }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.esperapp.com/", name = "CambiarEstado")
    public JAXBElement<CambiarEstado> createCambiarEstado(CambiarEstado value) {
        return new JAXBElement<CambiarEstado>(_CambiarEstado_QNAME, CambiarEstado.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.esperapp.com/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

}
