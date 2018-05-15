package fr.univavignon.rodeo;



import fr.univavignon.rodeo.api.IAnimal;

import org.junit.*;
import org.mockito.*;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;

public class IAnimalTest {

    IAnimal animal;
   
    @Before
    public  void getInstance(){
        animal=mock(IAnimal.class);
    when(animal.isBoss()).thenReturn(false);
    when(animal.getName()).thenReturn("bimbo");
    when(animal.getXP()).thenReturn(8);
    when(animal.isSecret()).thenReturn(true);
    
    when(animal.isEndangered()).thenReturn(false);
    
   

    }
   
 
   
    @Test
    public void testIsBoss(){
    assertEquals(false,animal.isBoss());
    System.out.println(animal.getXP());

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
