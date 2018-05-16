package fr.univavignon.rodeo;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import fr.univavignon.rodeo.api.IAnimal;
import fr.univavignon.rodeo.api.IEnvironment;
import fr.univavignon.rodeo.api.IEnvironmentProvider;
import fr.univavignon.rodeo.api.IGameState;
import fr.univavignon.rodeo.api.ISpecie;
import fr.univavignon.rodeo.api.SpecieLevel;
import static org.junit.Assert.*;
import static org.mockito.Mockito.doThrow;

public class IGameStateTest {	
	
	public static IGameState gameState;
	public static IEnvironmentProvider environementProvider; 
	public static ISpecie specie;	
	public static ArrayList<ISpecie> listeSpices;	
	public static IEnvironment environement;
	public static IAnimal bimbo =new IAnimalTest().mockAnimal();
		
	    public static  IGameState mockGameState(){
	        gameState=Mockito.mock(IGameState.class);	        
	        Mockito.when(gameState.getName()).thenReturn("partie State");
	        Mockito.when(gameState.getProgression()).thenReturn(70);
	        specie= ISpecieTest.mockSpecie();        
	        doThrow(new IllegalArgumentException()).when(gameState).catchAnimal(null);
	        doThrow(new IllegalStateException()).when(gameState).catchAnimal(bimbo);	        
	        Mockito.doThrow(new IllegalStateException()).when(gameState).exploreArea();	    	
	    	Mockito.when(gameState.getSpecieLevel(specie)).thenReturn(SpecieLevel.NOVICE);	        
	        
	        return gameState;
	        
	    }
	    
	    
	    
	    @Before  
	    public void initialisation(){
	    	
	    	gameState= mockGameState();	   	 
	    }
	    
	    
	    @Test
	    public void testGetProgression(){	
	    	
	    	assertEquals(70,gameState.getProgression());
	    }
	    
	    
	    
	    @Test(expected=IllegalArgumentException.class)
	    public void testCatchAnimal(){
	    	
	    	gameState.catchAnimal(null);
	    }
	    
	    
	    @Test(expected=IllegalStateException.class)
	    public void testCatchAnimall(){
	    	
	    	gameState.catchAnimal(bimbo);
	    }
	    
	    
	    
	    @Test(expected=IllegalStateException.class)
	    public void testExploreArea(){
	    	
	    	gameState.exploreArea();
	    }
	    
	   
	    @Test
	    public void testGetSpecieLevel(){
	    	
	    	assertEquals(SpecieLevel.NOVICE, gameState.getSpecieLevel(specie));    	
	    	
	    }
	    
	
	
	
	
	
	
	
	

}
