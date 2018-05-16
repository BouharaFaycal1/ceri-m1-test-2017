package fr.univavignon.rodeo;

import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import fr.univavignon.rodeo.api.IEnvironment;
import fr.univavignon.rodeo.api.ISpecie;

public class IEnvironmentTest {
	
	 public static ISpecie specie;	
	 public static ArrayList<ISpecie> listSpecies;	
	 public static IEnvironment environement;

		
	    public static  IEnvironment mockEnvironement(){
	    	
	        environement=Mockito.mock(IEnvironment.class);	        
	        Mockito.when(environement.getAreas()).thenReturn(1);
	        specie= ISpecieTest.mockSpecie();	        
	        listSpecies = new ArrayList();
	        listSpecies.add(specie);	        
	        Mockito.when(environement.getName()).thenReturn("mon environement");
	        Mockito.when(environement.getSpecies()).thenReturn(listSpecies);
	        return environement;
	        
	    }
	    
	    @Before  
	    public void initialisation(){
	    	environement=mockEnvironement();
	   	 
	    }
	 
	
		 @Test
		 public void testGetAreas(){
			
			 assertEquals(1,environement.getAreas());		 
			 
		 }
	 
	 
		 @Test
		 public void testGetSpecies(){
			 
			 assertEquals(listSpecies,environement.getSpecies());		 
			 
		 }
	   
	
	
	
	
	

}
