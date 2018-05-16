package fr.univavignon.rodeo;



import fr.univavignon.rodeo.api.IAnimal;

import org.junit.*;
import org.mockito.*;

import static org.junit.Assert.*;


public class IAnimalTest {

   static IAnimal animal=null;
   
    
    public static  IAnimal MockAnimal(){
    	IAnimal animal=Mockito.mock(IAnimal.class);
        Mockito.when(animal.isBoss()).thenReturn(false);
        Mockito.when(animal.getName()).thenReturn("bimbo");
        Mockito.when(animal.getXP()).thenReturn(8);
        Mockito.when(animal.isSecret()).thenReturn(true);
    
        Mockito.when(animal.isEndangered()).thenReturn(false);
    
        return animal;
     }
   
   
 
    
 
   
    @Test
    public void testIsBoss(){
    	animal =MockAnimal();
    assertEquals(false,animal.isBoss());
  

    }
    
    
    @Test
    public void testIsSecret(){
    	animal =MockAnimal();
    assertEquals(true,animal.isSecret());
   

    }
    
    @Test
    public void testisEndangered(){
    	animal =MockAnimal();
    assertEquals(false,animal.isEndangered());
   

    }
    @Test
    public void testisgetName(){
    	animal =MockAnimal();
    assertEquals("bimbo",animal.getName());
   

    }
    

}
