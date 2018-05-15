package fr.univavignon.rodeo;

import java.util.ArrayList;

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
	
	
	static IGameState gameState;
	static IEnvironmentProvider environementProvider; 
	
	static ISpecie specie;
	
	static ArrayList<ISpecie> listeSpices;	
	static IEnvironment environement;
	static IAnimal bimbo =new IAnimalTest().MockAnimal();
		
	    public static  IGameState MockGameState(){
	        gameState=Mockito.mock(IGameState.class);
	        //environement = IEnvironmentTest.MockEnvironement();
	        Mockito.when(gameState.getName()).thenReturn("partie State");
	        Mockito.when(gameState.getProgression()).thenReturn(70);
	        specie= ISpecieTest.MockSpecie();
	      // bimbo = new IAnimalTest().MockAnimal();
	        
	        doThrow(new IllegalArgumentException()).when(gameState).catchAnimal(null);
	        doThrow(new IllegalStateException()).when(gameState).catchAnimal(bimbo);
	        doThrow(new IllegalArgumentException()).when(gameState).getSpecieLevel(specie);
	        
	        Mockito.doThrow(new IllegalStateException()).when(gameState).exploreArea();
	     //  Mockito.when(gameState.getSpecieLevel(specie)).thenReturn(SpecieLevel.NOVICE);
	        
	        
	        
	        
	        return gameState;
	        
	 }
	    
	    
	    
	    
	    @Test
	    public void testGetProgression(){
	    	
	    	gameState= MockGameState();
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
	    	gameState= MockGameState();	
	    gameState.exploreArea();
	    }
	    
	   
	    @Test
	    public void testGetSpecieLevel(){
	    	ISpecie iSpecie = ISpecieTest.MockSpecie();
	  
	    	
	    	  Mockito.when(gameState.getSpecieLevel(iSpecie)).thenReturn(SpecieLevel.CHAMPION);
	    	assertEquals(SpecieLevel.CHAMPION, gameState.getSpecieLevel(iSpecie));
	    	
	    	
	    }
	    
	
	
	
	
	
	
	
	

}
