package fr.univavignon.rodeo;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;
import org.mockito.Mockito;
import org.omg.CORBA.Environment;

import fr.univavignon.rodeo.api.IAnimal;
import fr.univavignon.rodeo.api.IEnvironment;
import fr.univavignon.rodeo.api.ISpecie;

public class IEnvironmentTest {
	
	


	static ISpecie specie;
	
	static ArrayList<ISpecie> listSpecies;	
	static IEnvironment environement;


	    public static  IEnvironment getInstance(){
	        environement=Mockito.mock(IEnvironment.class);
	        
	        Mockito.when(environement.getAreas()).thenReturn(1);
	        specie= ISpecieTest.getInstance();
	        
	        listSpecies = new ArrayList();
	        listSpecies.add(specie);
	        
	        
	        Mockito.when(environement.getName()).thenReturn("mon environement");
	        Mockito.when(environement.getSpecies()).thenReturn(listSpecies);
	        return environement;
	        
	 }
	 
	 public  IEnvironment getMockEnvironement(){
	    	
	    	return getInstance();
	    	
	    	
	    }
	 
	 @Test
	 public void testGetAreas(){
		 environement=getMockEnvironement();
	assertEquals(1,environement.getAreas());	 
		 
		 
	 }
	 
	 
	 @Test
	 public void testGetSpecies(){
		 environement=getMockEnvironement();
		 assertEquals(listSpecies,environement.getSpecies());
		 
		 
		 
	 }
	   
	
	
	
	
	

}
