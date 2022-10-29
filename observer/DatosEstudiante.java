package observer;

import java.util.HashMap;
import java.util.Map;

public class DatosEstudiante {
    Map<String, Boolean> rubrosPagados = new HashMap<>();
    Map<String, Boolean> asignaturasAprobadas = new HashMap<>();

    boolean adeudaLibros = false;
    boolean adeudaLaboratorio = false;

    public DatosEstudiante() {
        // para prueba...
        rubrosPagados.put("matricula", false);
        rubrosPagados.put("derechosGrado", false);
        rubrosPagados.put("libros", false);

        asignaturasAprobadas.put("matematicas", false);
        asignaturasAprobadas.put("literatura", false);
        asignaturasAprobadas.put("ciencias", false);
    }

    public boolean todoPagado() {
        for (var k : rubrosPagados.keySet()) {
            if (!rubrosPagados.get(k))
                return false;
        }
        return true;
    }

    public boolean todoAprobado() {
        for (var k : asignaturasAprobadas.keySet()) {
            if (!asignaturasAprobadas.get(k))
                return false;
        }
        return true;
    }

    public boolean isAdeudaLibros() {
        return adeudaLibros;
    }

    public void setAdeudaLibros(boolean adeudaLibros) {
        this.adeudaLibros = adeudaLibros;
    }

    public boolean isAdeudaLaboratorio() {
        return adeudaLaboratorio;
    }

    public void setAdeudaLaboratorio(boolean adeudaLaboratorio) {
        this.adeudaLaboratorio = adeudaLaboratorio;
    }


}
