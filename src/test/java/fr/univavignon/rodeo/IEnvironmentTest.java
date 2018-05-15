package fr.univavignon.rodeo;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
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

		
	    public static  IEnvironment MockEnvironement(){
	        environement=Mockito.mock(IEnvironment.class);
	        
	        Mockito.when(environement.getAreas()).thenReturn(1);
	        specie= ISpecieTest.MockSpecie();
	        
	        listSpecies = new ArrayList();
	        listSpecies.add(specie);
	        
	        
	        Mockito.when(environement.getName()).thenReturn("mon environement");
	        Mockito.when(environement.getSpecies()).thenReturn(listSpecies);
	        return environement;
	        
	 }
	 
	
	 @Test
	 public void testGetAreas(){
		environement=MockEnvironement();
	assertEquals(1,environement.getAreas());	 
		 
		 
	 }
	 
	 
	 @Test
	 public void testGetSpecies(){
		 environement=MockEnvironement();
		 assertEquals(listSpecies,environement.getSpecies());
		 
		 
		 
	 }
	   
	
	
	
	
	

}
