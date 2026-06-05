package pt2;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PersonaTest {

    @Test
    public void testFechaNacimientoFormatoCorto() {
        //setup
        LocalDate fecha = LocalDate.of(1986, 6, 3);
        Persona persona = new Persona("Juan", fecha, new FechaFormatoCorto());
        //ejec y verif
        assertEquals("3-06-1986", persona.fechaNacimiento());
    }

    @Test
    public void testFechaNacimientoFormatoLargo() {
        //setup
        LocalDate fecha = LocalDate.of(1986, 6, 3);
        Persona persona = new Persona("Juan", fecha, new FechaFormatoLargo());
        //ejec y verif
        assertEquals("3 de junio de 1986", persona.fechaNacimiento());
    }

    @Test
    public void testCambioDeEstrategiaDinamico() {
        //setup
        LocalDate fecha = LocalDate.of(1986, 6, 3);
        Persona persona = new Persona("Juan", fecha, new FechaFormatoCorto());
        //verif
        assertEquals("3-06-1986", persona.fechaNacimiento());

        //Cambiamos la estrategia
        persona.formatoFecha(new FechaFormatoLargo());
        //verif
        assertTrue(persona.fechaNacimiento().equalsIgnoreCase("3 de junio de 1986"));
    }

}