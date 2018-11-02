package br.edu.fapi.tarefa;

import br.fapi.edu.tarefa.Despertador;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class DespetadorTest{
    Despertador despertador;
    Date dateMock;


    @Before
    public void setUp(){
        dateMock = mock(Date.class);
        despertador = new Despertador(dateMock);
    }

    @Test
    public void testPassouTempoTrue(){
        when(dateMock.after(any(Date.class))).thenReturn(true);

        assertTrue(despertador.passouDoTempo(new Date()));
    }

    @Test
    public void testPassouTempoFalse(){
        when(dateMock.after(any(Date.class))).thenReturn(false);

        assertTrue(despertador.passouDoTempo(new Date()));
    }

    @Test
    public void testAntesTempoTrue(){
        Date date = mock(Date.class);

        when(despertador.antesDoTempo(any(Date.class))).thenReturn(true);

        assertTrue(despertador.antesDoTempo(date));
    }


    @Test
    public void testAntesTempoFalse(){
        Date date = mock(Date.class);

        when(despertador.antesDoTempo(any(Date.class))).thenReturn(false);

        assertFalse(despertador.antesDoTempo(date));
    }

    @Test
    public void testeTrocarTempo(){
        Date date = mock(Date.class);

        assertFalse(despertador.antesDoTempo(date));
    }
}
