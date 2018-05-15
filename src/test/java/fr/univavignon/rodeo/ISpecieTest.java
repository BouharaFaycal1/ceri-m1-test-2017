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
	
	IAnimal animal;

	ISpecie specie;
	
	ArrayList<IAnimal> listAnimal;	
	
	
	 @Before
	    public  void getInstance(){
	        specie=Mockito.mock(ISpecie.class);
	        Mockito.when(specie.getArea()).thenReturn(1);
	        animal= IAnimalTest.getInstance();
	        
	        listAnimal = new ArrayList();
	        listAnimal.add(animal);
	        
	        
	        Mockito.when(specie.getAnimals()).thenReturn(listAnimal);
	        Mockito.when(specie.getName()).thenReturn("la race");
	        
	 }
	   
	  @Test
	  public void testGetArea(){
		
		  assertEquals(1, specie.getArea());
		  
		  
		  
	   

	    }
	
	
	
	
	
	
	
	
	
	
	

}
