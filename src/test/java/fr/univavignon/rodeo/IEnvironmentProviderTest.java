package fr.univavignon.rodeo;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;
import org.mockito.Mockito;

import fr.univavignon.rodeo.api.IEnvironment;
import fr.univavignon.rodeo.api.IEnvironmentProvider;
import fr.univavignon.rodeo.api.ISpecie;

public class IEnvironmentProviderTest {

	
	static IEnvironmentProvider environementProvider; 
	
	static ISpecie specie;
	
	static ArrayList<String> environementName;	
	static IEnvironment environement;

		
	    public static  IEnvironmentProvider MockEnvironementProvider(){
	        environementProvider=Mockito.mock(IEnvironmentProvider.class);
	        environement = IEnvironmentTest.MockEnvironement();
	        Mockito.when(environement.getName()).thenReturn("facile");
	        
	        Mockito.when(environement.getAreas()).thenReturn(1);
	        specie= ISpecieTest.MockSpecie();
	        
	        environementName = new ArrayList();
	        environementName.add(environement.getName());
	        
	        
	        Mockito.when(environementProvider.getAvailableEnvironments()).thenReturn(environementName);
	        Mockito.when(environementProvider.getEnvironment("facile")).thenReturn(environement);
	        
	        return environementProvider;
	        
	 }
	    
	    
	    @Test
	    public void testGetAvailableEnvironments(){
	    	
	    	environementProvider=MockEnvironementProvider();
	    	assertEquals(environementName,environementProvider.getAvailableEnvironments());
	    	
	    }
	    
	    @Test
	    public void testGetEnvironment(){
	    	
	    	environementProvider=MockEnvironementProvider();
	    	assertEquals("facile",environementProvider.getEnvironment("facile").getName());
	    	
	    }
	    
	    
	    
	    
	    
}
