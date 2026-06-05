package pt2;

import java.time.LocalDate;

public class Persona {

    private String nombre;
    private LocalDate fechaNac;
    private FormatoFecha formatoFecha;

    public Persona(String nombre, LocalDate fechaNac, FormatoFecha formatoFecha) {
        this.nombre = nombre;
        this.fechaNac = fechaNac;
        this.formatoFecha = formatoFecha;
    }

    public String nombre() {
        return nombre;
    }

    public String fechaNacimiento() {
        return formatoFecha.formatear(this.fechaNac);
    }

    public void formatoFecha(FormatoFecha formato) {
        this.formatoFecha = formato;
    }
}
