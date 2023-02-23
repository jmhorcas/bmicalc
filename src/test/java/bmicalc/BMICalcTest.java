package bmicalc;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeout;

import java.time.Duration;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BMICalcTest {
	
	private BMICalcImpl calculadora = new BMICalcImpl();	
	
	//Se comprueba inicialmente de que el objeto calculadora no sea nulo
	@Test
	@DisplayName("Comprobar si el objeto es nulos")
	public void valoresNulos() {
		assertNotNull(calculadora);
	}
	
	
	
	//No sabemos cuanto tiempo puede tardar los metodos en finalizar sus tareas
	//así que vamos a ver como de rapido es el procesamiento de estos.
	
	@Test
	@DisplayName("Tiempo que tardae el metodo bmi en finalizar su tarea")
	public void tMetodo1() {
		assertTimeout(Duration.ofMillis(1), () ->calculadora.bmi(56, 12));
		assertTimeout(Duration.ofMillis(1), () ->calculadora.bmi(56, 12));
		assertTimeout(Duration.ofMillis(1), () ->calculadora.bmi(56, 12));


	}
	
	@Test
	@DisplayName("Tiempo que tardae el metodo categoria en finalizar su tarea")
	public void tMetodo2() {
		assertTimeout(Duration.ofMillis(1), () ->calculadora.category(23));
		assertTimeout(Duration.ofMillis(1), () ->calculadora.category(33));
		assertTimeout(Duration.ofMillis(1), () ->calculadora.category(18));


	}
	
	@Test
	@DisplayName("Tiempo que tardae el metodo bmi en finalizar su tarea")
	public void tMetodo3() {
		assertTimeout(Duration.ofMillis(1), () ->calculadora.abdominalObesity(70, 'M'));
		assertTimeout(Duration.ofMillis(1), () ->calculadora.abdominalObesity(99, 'M'));
		assertTimeout(Duration.ofMillis(1), () ->calculadora.abdominalObesity(56, 'F'));


	}
	
	//Aparentemente al ser 3 metodos sencillos tiene sentido que tarden tan poco en ejecutarse
	//
	
	
	
	//Los dos siguientes tests son para el metodo bmi
	
	@Test
	@DisplayName("En el BMI intentar dividir una masa entre 0")
    public void calculoIMB1() {
		Exception exception = assertThrows(ArithmeticException.class, () ->
        calculadora.bmi(2, 0));
        assertEquals("No puede ser 0", exception.getMessage());
    }
	
	@Test
	@DisplayName("En el BMI insertar valores negativos")
	public void calculoIMB2() {
		Exception exception = assertThrows(IllegalArgumentException.class, () ->
        calculadora.bmi(-5, -2));
        assertEquals("No pueden ser valores negativos", exception.getMessage());
    }
	
	
	//Los siguientes 4 tests son para comprobar que se devuelve 
	//cada string correspondiente a su intervalo
	@Test
	@DisplayName("Comprobar intervalos 1")
    public void intervalos1() {
		assertEquals("UNDERWEIGHT", calculadora.category(5));
    }
	
	@Test
	@DisplayName("Comprobar intervalos 2")
    public void intervalos2() {
		assertEquals("NORMAL", calculadora.category(21));
    }
	
	@Test
	@DisplayName("Comprobar intervalos 3")
    public void intervalos3() {
		assertEquals("OVERWEIGHT", calculadora.category(27));
    }
	
	
	@Test
	@DisplayName("Comprobar intervalos 4")
    public void intervalos4() {
		assertEquals("OBSESE", calculadora.category(35));
    }
	
	//Para el método category nos aseguramos que saltan las excepciones con valores
	//imposibles
	
	@Test
	@DisplayName("Testeando valores poco realistas")
    public void categoriaException() {
		Exception exception1 = assertThrows(IllegalArgumentException.class, () ->
        calculadora.category(-4));
		Exception exception2 = assertThrows(IllegalArgumentException.class, () ->
        calculadora.category(67));

        assertEquals("Valores imposibles", exception1.getMessage());
        assertEquals("Valores imposibles", exception2.getMessage());

    }
	
	//Para hombres y mujeres comprobar que si superan el intervalo estan obesos
	//y si no pues no lo estan
	
	@Test
	@DisplayName("Comprobando obesidad")
    public void abdObsesityTest1() {

        assertTrue(calculadora.abdominalObesity(99,'M'));
        assertTrue(calculadora.abdominalObesity(81,'F'));
        assertFalse(calculadora.abdominalObesity(77,'M'));
        assertFalse(calculadora.abdominalObesity(65,'M'));



    }
	
	
	//Si se introduce un char distinto a M o F saltara una excepcion
	@Test
	@DisplayName("Comprobando que sea hombre o mujer")
    public void abdObsesityTest2() {
		
		Exception exception = assertThrows(IllegalArgumentException.class, () ->
        calculadora.abdominalObesity(90, 'J'));
        assertEquals("Argumento incorrecto", exception.getMessage());


    }
}
