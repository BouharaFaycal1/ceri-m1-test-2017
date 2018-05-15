package fr.univavignon.rodeo;



import fr.univavignon.rodeo.api.IAnimal;

import org.junit.*;
import org.mockito.*;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;

public class IAnimalTest {

   static IAnimal animal=null;
   
    
    public static  IAnimal getInstance(){
    	IAnimal animal=Mockito.mock(IAnimal.class);
        Mockito.when(animal.isBoss()).thenReturn(false);
        Mockito.when(animal.getName()).thenReturn("bimbo");
        Mockito.when(animal.getXP()).thenReturn(8);
        Mockito.when(animal.isSecret()).thenReturn(true);
    
        Mockito.when(animal.isEndangered()).thenReturn(false);
    
        return animal;
     }
   
   
    public  IAnimal getMockAnimal(){
    	    	
    	return getInstance();
    	
    	
    }
    
 
   
    @Test
    public void testIsBoss(){
    	animal =getMockAnimal();
    assertEquals(false,animal.isBoss());
  

    }
    
    
    @Test
    public void testIsSecret(){
    	animal =getMockAnimal();
    assertEquals(true,animal.isSecret());
   

    }
    
    @Test
    public void testisEndangered(){
    	animal =getMockAnimal();
    assertEquals(false,animal.isEndangered());
   

    }
    @Test
    public void testisgetName(){
    	animal =getMockAnimal();
    assertEquals("bimbo",animal.getName());
   

    }
    

}
