package fr.univavignon.rodeo;

import fr.univavignon.rodeo.api.IAnimal;
import org.junit.*;
import org.mockito.*;
import static org.junit.Assert.*;

public class IAnimalTest {

	private static IAnimal animal;
   
    
    public static  IAnimal mockAnimal(){
    	IAnimal animal=Mockito.mock(IAnimal.class);
        Mockito.when(animal.isBoss()).thenReturn(false);
        Mockito.when(animal.getName()).thenReturn("bimbo");
        Mockito.when(animal.getXP()).thenReturn(8);
        Mockito.when(animal.isSecret()).thenReturn(true);    
        Mockito.when(animal.isEndangered()).thenReturn(false);
    
        return animal;
    }
   
	 @Before  
	 public void initialisation(){
		 animal=mockAnimal();
		 
	 }
    
 
   
    @Test
    public void testIsBoss(){
    	
    assertEquals(false,animal.isBoss());  

    }
    
    
    @Test
    public void testIsSecret(){
    	
    assertEquals(true,animal.isSecret());   

    }
    
    @Test
    public void testisEndangered(){
    	
    assertEquals(false,animal.isEndangered());
    
    }
    
    @Test
    public void testisgetName(){
    	
    assertEquals("bimbo",animal.getName());   

    }
    

}
