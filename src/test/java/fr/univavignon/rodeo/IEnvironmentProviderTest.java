package fr.univavignon.rodeo;

import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import fr.univavignon.rodeo.api.IEnvironment;
import fr.univavignon.rodeo.api.IEnvironmentProvider;
import fr.univavignon.rodeo.api.ISpecie;

public class IEnvironmentProviderTest {
	
	public static IEnvironmentProvider environementProvider; 	
	public static ISpecie specie;	
	public static ArrayList<String> environementName;	
	public static IEnvironment environement;
	
	    public static  IEnvironmentProvider mockEnvironementProvider(){
	    	
	        environementProvider=Mockito.mock(IEnvironmentProvider.class);
	        environement = IEnvironmentTest.mockEnvironement();
	        Mockito.when(environement.getName()).thenReturn("dificile");	        
	        Mockito.when(environement.getAreas()).thenReturn(1);
	        specie= ISpecieTest.mockSpecie();	        
	        environementName = new ArrayList();
	        environementName.add(environement.getName());	        
	        Mockito.when(environementProvider.getAvailableEnvironments()).thenReturn(environementName);
	        Mockito.when(environementProvider.getEnvironment("dificile")).thenReturn(environement);
	        
	        return environementProvider;
	        
	    }
	    
	    @Before  
	    public void initialisation(){
	    	environementProvider=mockEnvironementProvider();
	   	 
	    }
	    
	    @Test
	    public void testGetAvailableEnvironments(){	
	    	
	    	assertEquals(environementName,environementProvider.getAvailableEnvironments());
	    	
	    }
	    
	    @Test
	    public void testGetEnvironment(){ 	
	    	
	    	assertEquals("facile",environementProvider.getEnvironment("dificile").getName());
	    	
	    }
	    
	    
	    
	    
	    
}
