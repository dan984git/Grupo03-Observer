package observer;

class EventoEstudiante implements EventHandler {
    @Override
    public void procesar(String eventType, DatosEstudiante datos) {
        System.out.print("Evento tipo:" + eventType + ", Comprobando condiciones...");
        if (comprobarCertificado(datos))
            System.out.println(": Condiciones cumplidas, enviando certificado");
        else {
            System.out.println(": no todavia");
        }
    }

    public boolean comprobarCertificado(DatosEstudiante datos) {
        if (datos.todoPagado()
                && datos.todoAprobado()
                && !datos.adeudaLaboratorio
                && !datos.adeudaLibros
        )
            return true;
        return false;
    }
}
