import static org.junit.Assert.*;

import org.junit.Test;

public class TestPlanetExplorer {
	

	@Test
	public void test_planetIsMade() throws PlanetExplorerException{
		PlanetExplorer explorer = new PlanetExplorer(100, 100, null);
		assertNotNull(explorer);
	}
	
	@Test
	public void test_explorerIsFacingNorth() throws PlanetExplorerException{
		PlanetExplorer explorer = new PlanetExplorer(100, 100, null);
		assertEquals("(0,0,N)", explorer.getStatus());
	}

	@Test
	public void test_emptyCommandGivesLandingStatus() throws PlanetExplorerException{
		PlanetExplorer explorer = new PlanetExplorer(100, 100, null);
		explorer.executeCommand("");
		assertEquals("(0,0,N)", explorer.getStatus());
	}
	
	@Test
	public void test_explorerTurnsToRigth() throws PlanetExplorerException{
		PlanetExplorer explorer = new PlanetExplorer(100, 100, null);
		explorer.executeCommand("r");
		assertEquals("(0,0,E)", explorer.getStatus());
	}
	
	
}
