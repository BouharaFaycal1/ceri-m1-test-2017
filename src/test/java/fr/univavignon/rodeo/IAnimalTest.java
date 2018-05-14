package fr.univavignon.rodeo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mockito.Mockito;

import fr.univavignon.rodeo.api.IAnimal;



public class IAnimalTest  {
	
	public static IAnimal createMock(int xp, boolean secret, boolean endagered, boolean boss) {
		IAnimal iAnimal = Mockito.mock(IAnimal.class);
		Mockito.when(iAnimal.getXP()).thenReturn(xp);
		Mockito.when(iAnimal.isSecret()).thenReturn(secret);
		Mockito.when(iAnimal.isEndangered()).thenReturn(endagered);
		Mockito.when(iAnimal.isBoss()).thenReturn(boss);
		return iAnimal;
}
	public IAnimal getMock() {
		return createMock(1899,true,false,true);
		
	}
	
		

	@Test
	public void testgetXP(){
		assertEquals(1899,createMock(1899,true,false,true).getXP());
	}
	
	@Test
	public void testIsBoss(){
		assertEquals(true,createMock(1899,true,false,true).isBoss());
	}
	
	
	@Test
	public void testIsEndangered(){
		assertEquals(false,createMock(1899,true,false,true).isEndangered());
	}
	
	@Test
	public void testIsSecret(){
		assertEquals(true,createMock(1899,true,false,true).isSecret());
		
	}
	
}