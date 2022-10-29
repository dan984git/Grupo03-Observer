package observer;

public class DemoObserver {

    public static void demo() {
        var datos = new DatosEstudiante();
        var uni = new Universidad();

        var manejador = new EventoEstudiante();

        uni.escuchar("rubroPagado", manejador);
        uni.escuchar("materiaAprobada", manejador);

        // operacion
        datos.setAdeudaLibros(false);
        datos.setAdeudaLaboratorio(false);
        uni.pagar(datos, "matricula");
        uni.pagar(datos, "derechosGrado");
        uni.pagar(datos, "libros");
        uni.aprobarMateria(datos, "matematicas");
        uni.aprobarMateria(datos, "literatura");
        uni.aprobarMateria(datos, "ciencias");
    }
}
