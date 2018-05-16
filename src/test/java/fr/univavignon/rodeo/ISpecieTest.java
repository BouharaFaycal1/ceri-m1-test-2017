package fr.univavignon.rodeo;

import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import fr.univavignon.rodeo.api.IAnimal;
import fr.univavignon.rodeo.api.ISpecie;

public class ISpecieTest {
	
	 static IAnimal animal;
	 static ISpecie specie;	
	 static ArrayList<IAnimal> listAnimal;	
	
	
		
	    public static  ISpecie mockSpecie(){
	        specie=Mockito.mock(ISpecie.class);
	        Mockito.when(specie.getArea()).thenReturn(1);
	        animal= IAnimalTest.mockAnimal();	        
	        listAnimal = new ArrayList();
	        listAnimal.add(animal);	        	        
	        Mockito.when(specie.getAnimals()).thenReturn(listAnimal);
	        Mockito.when(specie.getName()).thenReturn("chien");
	        return specie;
	        
	 }
	 
	
	    @Before  
	    public void initialisation(){
	    	 specie =mockSpecie();
	   	 
	    }
	   
	  @Test
	  public void testGetArea(){
		 
		  assertEquals(1, specie.getArea());  

	    }
	  
	  @Test
	  public void testGetAnimals(){	
		  
		  assertEquals(listAnimal, specie.getAnimals());  

	    }
	
	  @Test
	  public void testGetName(){		
		  assertEquals("chien", specie.getName());  

	    }
	
	
	
	
	
	
	
	
	

}
