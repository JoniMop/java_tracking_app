package interfazoop;

import cr_ac_ucenfotec.bl_dao.actividad.Actividad;
import cr_ac_ucenfotec.bl_dao.cliente.Cliente;
import cr_ac_ucenfotec.bl_dao.clienteFisico.ClienteFisico;
import cr_ac_ucenfotec.bl_dao.clienteJuridico.ClienteJuridico;
import cr_ac_ucenfotec.bl_dao.proyecto.Proyecto;
import cr_ac_ucenfotec.bl_dao.tecnologia.Tecnologia;
import cr_ac_ucenfotec.bl_dao.usuario.Usuario;
import cr_ac_ucenfotec.tl.ControllerActividad;
import cr_ac_ucenfotec.tl.ControllerClienteFisico;
import cr_ac_ucenfotec.tl.ControllerClienteJuridico;
import cr_ac_ucenfotec.tl.ControllerLogin;
import cr_ac_ucenfotec.tl.ControllerProyecto;
import cr_ac_ucenfotec.tl.ControllerTecnologia;
import java.io.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;
import cr_ac_ucenfotec.tl.ControllerUsuario;  

public class UI {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;

    static ControllerUsuario gestorUsuario = new ControllerUsuario();
    static ControllerProyecto gestorProyecto = new ControllerProyecto();
    static ControllerActividad gestorActividad = new ControllerActividad();
    static ControllerTecnologia gestorTecnologia = new ControllerTecnologia();
    static ControllerClienteJuridico gestorClienteJuridico = new ControllerClienteJuridico();
    static ControllerClienteFisico gestorClienteFisico = new ControllerClienteFisico();
    static ControllerLogin gestorLogin = new ControllerLogin();

    static ArrayList tecnologias = new ArrayList<>();
    static ArrayList actividades = new ArrayList<>();

    public static void main(String[] args) throws IOException, ParseException, Exception {
        registrarUsuario();
     }

    public static void mostrarMenu() throws IOException, ParseException, Exception {

        int opcion = 0;

        do {
            out.println();
            out.println();

            out.println("Digite la opcion deseada: ");
            out.println();
            out.println();

            out.println("1. Registrar tecnologia");
            out.println("2. Registrar cliente juridico");
            out.println("3. Regitrar cliente fisico");
            out.println("4. Registrar proyecto");

            out.println("5. Actualizar tecnologis");
            out.println("6. Actualizar cliente juridico");
            out.println("7. Actualizar cliente fisico");
            out.println("8. Actualizar proyecto");

            out.println("9. Buscar tecnologia");
            out.println("10. Buscar cliente fisico");
            out.println("11. Buscar cliente juridico");
            out.println("12. Buscar proyecto");

            out.println("13. Ver lista de tecnologias");
            out.println("14. Ver lista de proyectos");
            out.println("15. Ver lista de clientes fisicos");
            out.println("16. Ver lista de clientes juridicos");

            
            out.println("17. Mi Perfil");
            out.println("18. Reportes");
            out.println("19. Para cerrar sesion");
            out.println("0. Apagar");

            opcion = Integer.parseInt(in.readLine());
            procesarOpcion(opcion);
        } while (opcion != 0);

    }

    //Se ejecuta segun opcion digitada. Para opcion invalida lo regresa al mostrarMenu().
    public static void procesarOpcion(int opcion) throws IOException, ParseException, Exception {
        switch (opcion) {
            case 1:
                registrarTecnologia();
                out.println();
                out.println();

                break;

            case 2:
                registrarClienteJuridico();
                out.println();
                out.println();
                break;

            case 3:
                voyARegistrarClienteFisico();
                out.println();
                out.println();
                break;

            case 4:
                voyARegistrarProyecto();
                out.println();
                out.println();
                break;

            case 5:
                voyAActualizarTecnologia();
                out.println();
                out.println();
                break;

            case 6:
                voyAActualizarClienteJuridico();
                out.println();
                out.println();
                break;

            case 7:
                voyAActualizarClienteFisico();
                out.println();
                out.println();
                break;

            case 8:
                voyAActualizarProyecto();
                out.println();
                out.println();
                break;

            case 9:
                voyABuscarTecnologia();
                out.println();
                out.println();
                break;

            case 10:
                voyABuscarClienteFisico();
                out.println();
                out.println();
                break;

            case 11:
                voyABuscarClienteJuridico();
                out.println();
                out.println();
                break;

            case 12:
                voyABuscarProyecto();
                out.println();
                out.println();
                break;

            case 13:
                voyAListarTecnologia();
                out.println();
                out.println();
                break;

            case 14:
                voyAListarProyecto();
                out.println();
                out.println();
                break;
                
            case 15:
                voyAListarClientesFisicos();
                out.println();
                out.println();
                break;
                
            case 16:
                voyAListarClientesJuridicos();
                out.println();
                out.println();
                break;
                
            case 17:
                 voyAActualizarUsuario();
                voyAListarUsuario();
                out.println();
                out.println();
                break;
                
            case 18:
                reportes();
                
            case 19:
                cerrarSesion();
                out.println();
                out.println();
                break;
                

            default:
                out.println("Opción inválida");
                out.println();
                out.println();
                mostrarMenu();
                break;
        }
    }

    public static void voyARegistrarClienteFisico() throws Exception {

        String nombre;
        String primer_apellido;
        String segundo_apellido;
        String provincia;
        String canton;
        String distrito;
        String direccion_exacta;
        String correo_electronico;
        int telefono;

        out.println("Digite nombre del cliente");
        nombre = in.readLine();

        out.println("Digite primer apellido del cliente");
        primer_apellido = in.readLine();

        out.println("Digite segundo apellido");
        segundo_apellido = in.readLine();

        out.println("Digite provincia");
        provincia = in.readLine();

        out.println("Digite canton");
        canton = in.readLine();

        out.println("Digite distrito");
        distrito = in.readLine();

        out.println("Digite direccion exacta");
        direccion_exacta = in.readLine();

        out.println("Digite correo electronico");
        correo_electronico = in.readLine();

        out.println("Digite numero telefonico");
        telefono = Integer.parseInt(in.readLine());

        gestorClienteFisico.registrarClientefisico(nombre, primer_apellido, segundo_apellido, provincia, canton, distrito, direccion_exacta, correo_electronico, telefono);

    }

    public static void voyAActualizarClienteFisico() throws Exception {
        String nombre;
        String primer_apellido;
        String segundo_apellido;
        String provincia;
        String canton;
        String distrito;
        String direccion_exacta;
        String correo_electronico;
        int telefono;

        out.println("Digite nombre del cliente");
        nombre = in.readLine();

        out.println("Digite primer apellido del cliente");
        primer_apellido = in.readLine();

        out.println("Digite segundo_apellido del cliente");
        segundo_apellido = in.readLine();

        out.println("Digite provincia del cliente");
        provincia = in.readLine();

        out.println("Digite canton");
        canton = in.readLine();

        out.println("Digite distrito");
        distrito = in.readLine();

        out.println("Digite direccion exacta");
        direccion_exacta = in.readLine();

        out.println("Digite correo electronico");
        correo_electronico = in.readLine();

        out.println("Digite telefono");
        telefono = Integer.parseInt(in.readLine());

        gestorClienteFisico.actualizarClienteFisico(nombre, primer_apellido, segundo_apellido, provincia, canton, distrito, direccion_exacta, correo_electronico, telefono);

    }

    public static void voyABuscarClienteFisico() throws Exception {
        String correo_electronico;

        out.println("Digite correo electronico de cliente fisico a buscar");
        correo_electronico = in.readLine();

        System.out.println(gestorClienteFisico.buscarClienteFisico(correo_electronico).toString());

    }

     public static void voyAListarClientesFisicos() throws Exception {
        ArrayList<ClienteFisico> clientesFisicos = gestorClienteFisico.listarClienteFisico();
        for (int i = 0; i < clientesFisicos.size(); i++) {
            System.out.println(clientesFisicos.get(i).toString());
        }
    }
    
    
    public static void registrarClienteJuridico() throws IOException, ParseException, Exception {
        String nombre;
        String cedula_juridica;
        String provincia;
        String distrito;
        String canton;
        String direccion_exacta;
        String correo_electronico;
        int telefono;
        String contacto;

        out.println("Digite nombre de la empresa");
        nombre = in.readLine();

        out.println("Digite la cedula juridica");
        cedula_juridica = in.readLine();

        out.println("Provincia");
        provincia = in.readLine();

        out.println("Distrito");
        distrito = in.readLine();

        out.println("Canton");
        canton = in.readLine();

        out.println("Digite direccion exacta del cliente");
        direccion_exacta = in.readLine();

        out.println("Correo electronico");
        correo_electronico = in.readLine();

        out.println("Digite numero telefonico del cliente");
        telefono = Integer.parseInt(in.readLine());

        out.println("Digite nombre de la persona encargada de la empresa, procederemos a registrarla ahora...");
        contacto = in.readLine();

        out.println("A continuacion ingrese informacion de contacto de la persona responsable de la empresa");
        voyARegistrarClienteFisico();

        gestorClienteJuridico.registrarClienteJuridico(nombre, provincia, canton, distrito, direccion_exacta, correo_electronico, telefono, cedula_juridica, contacto);

    }

    public static void voyABuscarClienteJuridico() throws Exception {
        String nombre;

        out.println("Digite nombre de cliente juridico a buscar");
        nombre = in.readLine();

        System.out.println(gestorClienteJuridico.buscarClienteJuridico(nombre).toString());

    }

   
     public static void voyAListarClientesJuridicos() throws Exception {
        ArrayList<ClienteJuridico> clientesJuridicos = gestorClienteJuridico.listarClienteJuridico();
        for (int i = 0; i < clientesJuridicos.size(); i++) {
            System.out.println(clientesJuridicos.get(i).toString());
        }
    }
    
    public static void voyAActualizarClienteJuridico() throws Exception {
        String nombre;
        String provincia;
        String canton;
        String distrito;
        String direccion_exacta;
        String correo_electronico;
        int telefono;
        String cedula_juridica;
        String contacto;

        out.println("Digite nombre juridico del cliente");
        nombre = in.readLine();

        out.println("Digite provincia del cliente");
        provincia = in.readLine();

        out.println("Digite canton");
        canton = in.readLine();

        out.println("Digite distrito");
        distrito = in.readLine();

        out.println("Digite direccion exacta");
        direccion_exacta = in.readLine();

        out.println("Digite correo electronico");
        correo_electronico = in.readLine();

        out.println("Digite telefono");
        telefono = Integer.parseInt(in.readLine());

        out.println("Digite cedula juridica");
        cedula_juridica = in.readLine();

        out.println("Digite contacto");
        contacto = in.readLine();

        gestorClienteJuridico.actualizarClienteJuridico(nombre, provincia, canton, distrito, direccion_exacta, correo_electronico, telefono, cedula_juridica, contacto);

    }
    /////////////////////////////////////////////////////////////////////////////

    public static void registrarTecnologia() throws IOException, Exception {
        out.println("Digite el codigo para esta tecnologia");
        String codigo = in.readLine();

        out.println("Digite el nombre de la tecnologia");
        String nombre = in.readLine();

        gestorTecnologia.registrarTecnologia(codigo, nombre);

    }

    public static void voyABuscarTecnologia() throws Exception {
        String codigo;
        String nombre;

        out.println("Digite codigo de la tecnologia a buscar");
        codigo = in.readLine();

        System.out.println(gestorTecnologia.buscarTecnologia(codigo).toString());

    }

    public static void voyAActualizarTecnologia() throws Exception {
        String codigo;
        String nombre;

        out.println("Digite codigo de la tecnologia");
        codigo = in.readLine();

        out.println("Digite el nombre");
        nombre = in.readLine();

        gestorTecnologia.actualizarTecnologia(codigo, nombre);

    }

    public static void voyAListarTecnologia() throws Exception {
        ArrayList<Tecnologia> lista = gestorTecnologia.listarTecnologias();
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).toString());
        }
    }
//////////////////////////////////////////////////////////////////////

    public static void registrarUsuario() throws IOException, Exception {
        
        out.println("Bienvenidos, vamos a proceder a registrarte, ");
        out.println("asi comienzas a hacer completo uso de la aplicacion.");
        out.println("");
        out.println("");
        out.println("");
        out.println("");
        
        
        out.println("Digite su nombre");
        String nombre = in.readLine();

        out.println("Digite su primer_apellido");
        String primer_apellido = in.readLine();

        out.println("Digite su segundo apellido");
        String segundo_apellido = in.readLine();

        out.println("Digite su correo electronico");
        String correo_electronico = in.readLine();

        out.println("Digite su cedula");
        String cedula = in.readLine();

        out.println("Digite su genero");
        String genero = in.readLine();

        out.println("Digite su clave");
        String clave = in.readLine();

        gestorUsuario.registrarUsuario(nombre, primer_apellido, segundo_apellido,
                correo_electronico, cedula, genero, clave);

        login();

    }

    private static void login() throws IOException, ParseException, Exception {
        out.println("Bienvenidos!!");
        out.println("Iniciar sesion");

        out.println("Digite el correo electronico");
        String nombre = in.readLine();
        out.println("Digite su clave");
        String clave = in.readLine();

        if (gestorLogin.login(nombre, clave)!=null) {
            mostrarMenu();
        } else {
            out.println("Usuario y/o clave incorrecto");
            login();
        }
    }

     public static void voyAListarUsuario() throws Exception {
        ArrayList<Usuario> usuarios = gestorUsuario.listarUsuario();
        for (int i = 0; i < usuarios.size(); i++) {
            System.out.println(usuarios.get(i).toString());
        }
    }
    
     public static void cerrarSesion() throws IOException, ParseException, Exception{
         login();
     }
    ///////////////////////////PROYECTO/////////////////////////////////////////
    public static void voyARegistrarProyecto() throws Exception {
        String codigo;
        String nombre;
        Cliente tmpCliente = new Cliente();
        String clienteAsociado = tmpCliente.getNombre();

        out.println("Digite codigo del proyecto");
        codigo = in.readLine();

        out.println("Digite el nombre de proyecto");
        nombre = in.readLine();

        out.println("Digite descripcion de proyecto");
        String descripcion = in.readLine();

        out.println("Digite el fecha inicio de proyecto");
        String fechaI = in.readLine();

        out.println("Digite el fecha fin de proyecto");
        String fechaF = in.readLine();

        //Digita cantidad de tecnologias
        out.println("Digite cantidad de tecnologias");
        ArrayList<String> lista = new ArrayList<>();
        Tecnologia tmpTecnologia = new Tecnologia();
        int num = Integer.parseInt(in.readLine());
        for (int i = 0; i < num; i++) {
            out.println("Digite codigo de tecnologia que utiliza");
            String tecnologia = in.readLine();
            lista.add(tecnologia);
        }

        //Digita cantidad de actividades
        out.println("Digite cantidad de actividades en las que realizara el proyecto");
        ArrayList<String> lista2 = new ArrayList<>();
        Actividad tmpActividad = new Actividad();
        int num2 = Integer.parseInt(in.readLine());
        for (int i = 0; i < num2; i++) {
            out.println("Digite codigo de actividad");
            String actividad = in.readLine();
            lista2.add(actividad);
        }

        out.println("Digite nombre de cliente asociado de proyecto");
        clienteAsociado = in.readLine();

        out.println("Digite tipo dede proyecto");
        String tipo = in.readLine();

        gestorProyecto.registrarProyecto(codigo, nombre, descripcion, fechaI, fechaF, lista, lista2, clienteAsociado, tipo);

    }

    public static void voyAActualizarProyecto() throws Exception {
        String codigo;
        String nombre;
        Cliente tmpCliente = new Cliente();
        String clienteAsociado = tmpCliente.getNombre();

        out.println("Digite codigo del proyecto");
        codigo = in.readLine();

        out.println("Digite el nombre de proyecto");
        nombre = in.readLine();

        out.println("Digite descripcion de proyecto");
        String descripcion = in.readLine();

        out.println("Digite el fecha inicio de proyecto");
        String fechaI = in.readLine();

        out.println("Digite el fecha fin de proyecto");
        String fechaF = in.readLine();

        /*
         //Digita cantidad de tecnologias
         out.println("Digite cantidad de tecnologias");
         ArrayList<String> lista= new   ArrayList<>();
         Tecnologia tmpTecnologia = new Tecnologia();
         int num = Integer.parseInt(in.readLine());
         for(int i=0;i<num;i++){
         out.println("Digite codigo de tecnologia que utiliza");
         String tecnologia = in.readLine();
         lista.add(tecnologia);}
            
         //Digita cantidad de actividades
         out.println("Digite cantidad de actividades en las que realizara el proyecto");
         ArrayList<String> lista2= new   ArrayList<>();
         Actividad tmpActividad = new Actividad();
         int num2 = Integer.parseInt(in.readLine());
         for(int i=0;i<num2;i++){
         out.println("Digite codigo de actividad");
         String actividad = in.readLine();
         lista2.add(actividad);}         
         */
        out.println("Digite nombre de cliente asociado de proyecto");
        clienteAsociado = in.readLine();

        out.println("Digite tipo dede proyecto");
        String tipo = in.readLine();

        gestorProyecto.actualizarProyecto(codigo, nombre, descripcion, fechaI, fechaF, null, null, clienteAsociado, tipo);

    }
 
    public static void voyABuscarProyecto() throws Exception {
        String codigo;

        out.println("Digite codigo del proyecto a buscar");
        codigo = in.readLine();

        System.out.println(gestorProyecto.buscarProyecto(codigo).toString());

    }
    
     public static void voyAListarProyecto() throws Exception {
        ArrayList<Proyecto> lista = gestorProyecto.listarProyectos();
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).toString());
        }
    }
     
     
     public static void reportes(){
         out.println("Debe de acumular al menos informacion de 1 semana completa para poder tirar reportes....");
     }
     
     
     
     
     public static void voyAActualizarUsuario() throws Exception {
        String nombre;
        String primer_apellido;
        String segundo_apellido;
        String correo_electronico;
        String cedula;
        String genero;
        String clave;

        out.println("Digite su nombre");
        nombre = in.readLine();

        out.println("Digite su primer apellido");
        primer_apellido = in.readLine();

        out.println("Digite su segundo apellido");
        segundo_apellido = in.readLine();

        out.println("Digite correo electronico");
        correo_electronico = in.readLine();

        out.println("Digite su cedula");
        cedula = in.readLine();

        out.println("Digite su genero");
        genero = in.readLine();

        out.println("Digite su nueva clave");
        clave = in.readLine();

        

        gestorUsuario.actualizarUsuario(nombre, primer_apellido, segundo_apellido, correo_electronico, cedula, genero, clave);

    }

}

/* public static void registrarProyectoAcademico() throws IOException, ParseException {
 String codigo;
 String nombre;
 String descripcion;

 Date fecha_inicio;
 Date fecha_fin;
 DateFormat formatter = new SimpleDateFormat("MM/dd/yy");

 ArrayList<String> tecnologias = new ArrayList<String>();
 String tecnologia;

 ArrayList<String> actividades = new ArrayList<String>();
 String actividad;

 out.println("Digite el codigo de este proyecto");
 codigo = in.readLine();

 out.println("Digite el nombre de este proyecto");
 nombre = in.readLine();

 out.println("Digite descripcion para este proyecto");
 descripcion = in.readLine();

 out.println("Fecha de inicio del proyecto");
 fecha_inicio = (Date) formatter.parse(in.readLine());

 out.println("Fecha en que el proyecto debe finalizar ");
 fecha_fin = (Date) formatter.parse(in.readLine());

 out.println("Tecnologias que se utilizaran en este proyecto ");
 tecnologia = in.readLine();//falta validar tecnologia si esta o no en la lista
 tecnologias.add(tecnologia);

 out.println("Actividades que estara desarrollando en este proyecto ");
 actividad = in.readLine();
 actividades.add(actividad);

 gestor.registrarProyectoAcademico(codigo, nombre, descripcion, fecha_inicio, fecha_fin, tecnologia, actividad);


 //////////////////////////////////////////////////////////



 public static void registrarProyectoAcademico() throws IOException, ParseException {
 String codigo;
 String nombre;
 String descripcion;

 Date fecha_inicio;
 Date fecha_fin;
 DateFormat formatter = new SimpleDateFormat("MM/dd/yy");

 ArrayList<String> tecnologias = new ArrayList<String>();
 String tecnologia;

 ArrayList<String> actividades = new ArrayList<String>();
 String actividad;

 out.println("Digite el codigo de este proyecto");
 codigo = in.readLine();

 out.println("Digite el nombre de este proyecto");
 nombre = in.readLine();

 out.println("Digite descripcion para este proyecto");
 descripcion = in.readLine();

 out.println("Fecha de inicio del proyecto");
 fecha_inicio = (Date) formatter.parse(in.readLine());

 out.println("Fecha en que el proyecto debe finalizar ");
 fecha_fin = (Date) formatter.parse(in.readLine());

 out.println("Tecnologias que se utilizaran en este proyecto ");
 tecnologia = in.readLine();//falta validar tecnologia si esta o no en la lista
 tecnologias.add(tecnologia);

 out.println("Actividades que estara desarrollando en este proyecto ");
 actividad = in.readLine();
 actividades.add(actividad);

 gestor.registrarProyectoAcademico(codigo, nombre, descripcion, fecha_inicio, fecha_fin, tecnologia, actividad);

 }


 //////////////////////////////////////////////////////////////



 public static void actualizarProyectoAcademico() throws IOException {
 String codigo;

 out.println("Digite el codigo del proyecto academico que desea actualizar");
 codigo = in.readLine();

 gestor.buscarProyectoAcademico(codigo);

 if (codigo.equals(proyectoAcademico.get(codigo))) {
 proyectoAcademico(codigo).toString();

 } else {
 out.println("Proyecto no existe");
 }

 }

 }*/
/* public static void loginUsuario() throws Exception {

 out.println("digite numero de cedula para ingresar a la aplicacion");
 String cedula = in.readLine();
 gestor.buscarUsuario(cedula);

 out.println("Cedula correcta!!!");
 mostrarMenu();

 }


 //////////////////////////////////////////////////////////////


 //////////////////////////////MODO ACADEMICO/////////////////////
 public static void modoAcademico() throws IOException {
 int opcionAcademica = 0;

 do {
 out.println();
 out.println();

 out.println("digite la opcion deseada ");
 out.println();
 out.println();

 out.println("1. Registrar proyecto academico");
 out.println("2. Actualizar proyecto academico");
 out.println("3. Reportes ");
 out.println();
 out.println("0. Para regresar al menu principal de la bitacora");

 opcionAcademica = Integer.parseInt(in.readLine());
 procesarOpciionAcademica(opcionAcademica);
 } while (opcionAcademica != 0);

 if (opcionAcademica == 0) {
 mostrarMenu();
 }
 }

 public static void procesarOpcionAcademica(int opcionAcademica) throws IOException, ParseException {
 switch (opcionAcademica) {
 case 1:
 registrarProyectoAcademico();
 out.println();
 out.println();

 break;

 case 2:
 actualizarProyectoAcademico();
 out.println();
 out.println();
 break;

 case 3:
 reporteProyectoAcademico();
 out.println();
 out.println();
 break;

 default:
 out.println("Opción inválida");
 out.println();
 out.println();
 modoComercial();
 break;
 }
 }


 public static void procesarOpcionComercial(int opcionComercial) throws IOException, ParseException {
 switch (opcionComercial) {
 case 1:
 registrarProyectoComercial();
 out.println();
 out.println();

 break;

 case 2:
 actualizarProyectoComercial();
 out.println();
 out.println();
 break;

 case 3:
 reporteProyectoComercial();
 out.println();
 out.println();
 break;

 default:
 out.println("Opción inválida");
 out.println();
 out.println();
 modoComercial();
 break;
 }
 }

 public static void registrarProyectoComercial() throws IOException, ParseException {
 String codigo;
 String nombre;
 String descripcion;

 Date fecha_inicio;
 Date fecha_fin;
 DateFormat formatter = new SimpleDateFormat("MM/dd/yy");

 ArrayList<String> tecnologias = new ArrayList<String>();
 String tecnologia;

 String nombreCliente;

 ArrayList<Actividad> actividades = new ArrayList();
 String actividad;

 out.println("Digite el codigo de este proyecto");
 codigo = in.readLine();

 out.println("Digite el nombre de este proyecto");
 nombre = in.readLine();

 out.println("Digite descripcion para este proyecto");
 descripcion = in.readLine();

 out.println("Fecha de inicio del proyecto");
 fecha_inicio = (Date) formatter.parse(in.readLine());

 out.println("Fecha en que el proyecto debe finalizar ");
 fecha_fin = (Date) formatter.parse(in.readLine());

 out.println("Tecnologias que se utilizaran en este proyecto ");
 tecnologia = in.readLine();
 tecnologias.add(tecnologia);

 out.println("Actividades que estara desarrollando en este proyecto ");
 actividad = in.readLine();
 actividades.add(actividad);

 gestor.registrarActividad(String codigoActividad
 , String nombreActividad, String descripcionActividad
 );

 out.println("Nombre del cliente");
 if (buscarCliente(nombreCliente) == true) {
 nombreCliente = in.readLine();
 gestor.registrarProyectoComercial(codigo, nombre, descripcion, fecha_inicio, fecha_fin, tecnologia, nombreCliente);
 } else {
 out.println("Error, el cliente no se encuentra registrado, por favor proceder a registro de cliente");
 menuRegistrarCliente();
 }

 }

 public static void menuRegistrarCliente() throws IOException, ParseException {

 int opcionRegistrarCliente = 0;

 do {

 out.println("Digite la opcion deseada, el cliente debe estar registrado");

 out.println("1. Registrar registrar cliente fisico");

 out.println("2. Registrar cliente juridico");

 out.println("0. Volver a menu principal");

 opcionRegistrarCliente = Integer.parseInt(in.readLine());
 procesarOpcionParaRegistrarCliente(opcionRegistrarCliente);

 } while (opcionRegistrarCliente != 0);

 if (opcionRegistrarCliente == 0) {
 mostrarMenu();
 }

 }

 public static void procesarOpcionParaRegistrarCliente(int popcionRegistrarCliente) throws IOException, ParseException {

 switch (popcionRegistrarCliente) {
 case 1:
 out.println();
 out.println();
 registrarClienteFisico();
 break;

 case 2:
 out.println();
 out.println();
 registrarClienteJuridico();
 break;

 default:
 out.println();
 out.println();
 out.println("Opcion incorrecta");
 menuRegistrarCliente();
 break;

 }
 }



 /////////////////////////////////////////////////



 public static void asociandoTecnologia() throws IOException, ParseException {
 //ArrayList tecnologias;
 int opcionAsociarTecnologia;
 do {

 out.println("Tecnologias que a utilizar en este proyecto ");
 String tecnologia = in.readLine();
 gestor.buscarTecnologiaXNombre(tecnologia);
 //tecnologias = new ArrayList<String>();
 tecnologias.add(tecnologia);

 out.println("1. Si desea agregar 0tra tecnologia?");
 out.println("2. para continuar registrando proyecto");
 out.println("0. Menu principal");

 opcionAsociarTecnologia = Integer.parseInt(in.readLine());
 procesarOpcionAsociarTecnologia(opcionAsociarTecnologia);

 } while (opcionAsociarTecnologia != 0);

 }

 public static void procesarOpcionAsociarTecnologia(int popcionAsociarTecnologia) throws IOException, ParseException {

 switch (popcionAsociarTecnologia) {
 case 1:
 out.println();
 out.println();
 asociandoTecnologia();
 break;

 case 2:
 out.println();
 out.println();
 registrarActividad();
 break;

 case 0:
 out.println();
 out.println();
 mostrarMenu();
 break;

 default:
 out.println();
 out.println();
 out.println("Opcion incorrecta");
 menuRegistrarCliente();
 break;

 }
 }

 public static void asociandoActividad() throws IOException, ParseException {
 //ArrayList actividades;
 int opcionAsociarActividad;

 do {

 out.println("Actividades a realizar para este proyecto ");
 String actividad = in.readLine();
 //actividades = new ArrayList<String>();
 actividades.add(actividad);

 out.println("1. Si desea agregar 0tra actividad?");
 out.println("2. para continuar registrando este proyecto");
 out.println("0. Menu principal");

 opcionAsociarActividad = Integer.parseInt(in.readLine());
 procesarOpcionAsociarActividad(opcionAsociarActividad);

 } while (opcionAsociarActividad != 0);

 }

 public static void procesarOpcionAsociarActividad(int popcionAsociarActividad) throws IOException, ParseException {

 switch (popcionAsociarActividad) {
 case 1:
 out.println();
 out.println();
 asociandoActividad();
 break;

 case 2:
 out.println();
 out.println();
 registrarActividad();
 break;

 default:
 out.println();
 out.println();
 out.println("Opcion incorrecta");
 menuRegistrarCliente();
 break;

 }
 }

    


 public static void actualizarProyectoComercial() throws IOException {
 String codigo;

 out.println("Digite el codigo del proyecto comercial que desea actualizar");
 codigo = in.readLine();

 gestor.buscarProyectoComercial(codigo);

 if (codigo.equals(proyectoComercial.get(codigo))) {
 proyectoComercial(codigo).toString();

 } else {
 out.println("Proyecto no existe");
 }

 }

 public static void reporteProyectoComercial() {

 }


 public static void registrarActividad() throws IOException {
 out.println("Digite codigo de la actividad");
 String codigo = in.readLine();

 out.println("Digite como quiere nombrar la actividad");
 String nombre = in.readLine();

 out.println("Disigite su nombre");
 String descripcion = in.readLine();

 gestor.registrarActividad(codigo, nombre, descripcion);
 }

 */
