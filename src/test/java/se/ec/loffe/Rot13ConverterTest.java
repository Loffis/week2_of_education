package se.ec.loffe;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Rot13ConverterTest
{
    // Se till att testa alla gränsvärden! a, z, A, Z, m, M.
    @Test
    public void test_a_becomes_n(){
        char source = 'a';
        char expected = 'n';

        char actual = Rot13Converter.convertChar(source);
        assertEquals(expected, actual);
    }

    @Test
    public void test_n_becomes_a(){
        char source = 'n';
        char expected = 'a';

        char actual = Rot13Converter.convertChar(source);
        assertEquals(expected, actual);
    }

    @Test
    public void test_Z_becomes_M(){
        char source = 'Z';
        char expected = 'M';

        char actual = Rot13Converter.convertChar(source);
        assertEquals(expected, actual);
    }

    @Test
    public void test_Ö_stays_Ö(){
        char source = 'Ö';
        char expected = 'Ö';

        char actual = Rot13Converter.convertChar(source);
        assertEquals(expected, actual);
    }

    @Test
    public void test_A_becomes_N(){
        char source = 'A';
        char expected = 'N';

        char actual = Rot13Converter.convertChar(source);
        assertEquals(expected, actual);
    }

    @Test
    public void test_java_becomes_wnin() {
        String source = "java";
        String expected = "wnin";

        String actual = Rot13Converter.convertString(source);
        assertEquals(expected, actual);
    }

    @Test
    public void test_wnin_becomes_java() {
        String source = "wnin";
        String expected = "java";

        String actual = Rot13Converter.convertString(source);
        assertEquals(expected, actual);
    }

    @Test
    public void test_Hello_World_becomes_Uryyb_Jbeyq() {
        String source = "Hello World!";
        String expected = "Uryyb Jbeyq!";

        String actual = Rot13Converter.convertString(source);
        assertEquals(expected, actual);
    }
}
