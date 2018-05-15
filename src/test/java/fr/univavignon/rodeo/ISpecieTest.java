package fr.univavignon.rodeo;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

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
	
	

	    public static  ISpecie getInstance(){
	        specie=Mockito.mock(ISpecie.class);
	        Mockito.when(specie.getArea()).thenReturn(1);
	        animal= IAnimalTest.getInstance();
	        
	        listAnimal = new ArrayList();
	        listAnimal.add(animal);
	        
	        
	        Mockito.when(specie.getAnimals()).thenReturn(listAnimal);
	        Mockito.when(specie.getName()).thenReturn("chien");
	        return specie;
	        
	 }
	 
	 public  ISpecie getMockSpecie(){
	    	
	    	return getInstance();
	    	
	    	
	    }
	   
	  @Test
	  public void testGetArea(){
		  specie =getMockSpecie();
		  assertEquals(1, specie.getArea());  

	    }
	  
	  @Test
	  public void testGetAnimals(){	
		  specie =getMockSpecie();
		  assertEquals(listAnimal, specie.getAnimals());  

	    }
	
	  @Test
	  public void testGetName(){		
		  assertEquals("chien", specie.getName());  

	    }
	
	
	
	
	
	
	
	
	

}
