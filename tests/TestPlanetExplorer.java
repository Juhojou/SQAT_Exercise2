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
	
	@Test
	public void test_explorerTurnsToLeft() throws PlanetExplorerException{
		PlanetExplorer explorer = new PlanetExplorer(100, 100, null);
		explorer.executeCommand("l");
		assertEquals("(0,0,W)", explorer.getStatus());
	}
	
	@Test
	public void test_explorerMovesForwardOnce() throws PlanetExplorerException{
		PlanetExplorer explorer = new PlanetExplorer(100, 100, null);
		explorer.executeCommand("f");
		assertEquals("(0,1,N)", explorer.getStatus());
	}
	
	@Test
	public void test_explorerMovesForwardOnceInStatus_2_2_N() throws PlanetExplorerException{
		PlanetExplorer explorer = new PlanetExplorer(100, 100, null);
		explorer.setStatus("(2,2,N)");
		explorer.executeCommand("f");
		assertEquals("(2,3,N)", explorer.getStatus());
	}
	
	@Test
	public void test_explorerMovesBackwardOnceInStatus_10_3_N() throws PlanetExplorerException{
		PlanetExplorer explorer = new PlanetExplorer(100, 100, null);
		explorer.setStatus("(2,2,N)");
		explorer.executeCommand("f");
		assertEquals("(10,4,N)", explorer.getStatus());
	}
}
