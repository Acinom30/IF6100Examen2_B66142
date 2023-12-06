package cr.go.ucr;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import cr.go.ucr.operaciones.Division;
import cr.go.ucr.operaciones.Multiplicacion;
import cr.go.ucr.operaciones.Resta;
import cr.go.ucr.operaciones.Sumar;


//Mónica Rodríguez Vásquez - B66142

class Test {
	
	//Método que prueba que la suma está correcta
	@org.junit.jupiter.api.Test
    public void testSumar() {
        OperacionAritmetica operacion = new OperacionAritmetica(new Sumar());
        assertEquals(15, operacion.procesar(5, 10));
    }
		
	//Método que prueba que la suma no puede recibir un número negativo.
	//Se usa el assertNotEquals
	@org.junit.jupiter.api.Test
    public void testSumarNegativo() {
        OperacionAritmetica operacion = new OperacionAritmetica(new Sumar());
        assertNotEquals(4, operacion.procesar(5, -1));
    }
	

	//Método que prueba la resta de manera correcta
	@org.junit.jupiter.api.Test
    public void testResta() {
        OperacionAritmetica operacion = new OperacionAritmetica(new Resta());
        assertEquals(16, operacion.procesar(20, 4));
    }
	
	//Método que prueba que la resta no se puede llevar a cabo si el primer dígito es menor
	//que el segundo
	@org.junit.jupiter.api.Test
    public void testRestaNegativa() {
        OperacionAritmetica operacion = new OperacionAritmetica(new Resta());
        assertNotEquals(-16, operacion.procesar(4, 20));
    }

	//Método que muestra la multiplicación
	@org.junit.jupiter.api.Test
    public void testMultiplicacion() {
        OperacionAritmetica operacion = new OperacionAritmetica(new Multiplicacion());
        assertEquals(20, operacion.procesar(5, 4));
    }
	
	//Método que muestra la multiplicación
	@org.junit.jupiter.api.Test
    public void testMultiplicacion2() {
        OperacionAritmetica operacion = new OperacionAritmetica(new Multiplicacion());
        assertEquals(6, operacion.procesar(3, 2));
    }

	//Método que muestra la división
	@org.junit.jupiter.api.Test
    public void testDivision() {
        OperacionAritmetica operacion = new OperacionAritmetica(new Division());
        assertEquals(1, operacion.procesar(5, 4));
    }

	//Método que no permite la división entre cero.
	//Se utiliza assertNotEquals
	@org.junit.jupiter.api.Test
    public void testDivisionEntreCero() {
        OperacionAritmetica operacion = new OperacionAritmetica(new Division());
        assertNotEquals(1, operacion.procesar(5, 0));
    }

}
