package observer;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Universidad {
    Map<String, List<EventHandler>> manejadoresEventos = new HashMap<>();

    public void escuchar(String eventType, EventHandler listener) {
        manejadoresEventos.computeIfAbsent(eventType, k -> new ArrayList<>());
        manejadoresEventos.get(eventType).add(listener);
    }

    public void unsubscribe(String eventType, EventHandler listener) {
        List<EventHandler> users = manejadoresEventos.get(eventType);
        users.remove(listener);
    }

    public void dispararEvento(String eventType, DatosEstudiante datos) {
        List<EventHandler> users = manejadoresEventos.get(eventType);
        for (EventHandler listener : users) {
            listener.procesar(eventType, datos);
        }
    }

    public void pagar(DatosEstudiante datos, String rubro) {
        datos.rubrosPagados.put(rubro, true);
        this.dispararEvento("rubroPagado", datos);
    }

    public void aprobarMateria(DatosEstudiante datos, String materia) {
        datos.asignaturasAprobadas.put(materia, true);
        this.dispararEvento("materiaAprobada", datos);
    }

}
