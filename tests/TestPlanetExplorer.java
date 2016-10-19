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
		assertEquals("(0,0,N)", getStatus(explorer));
	}

	
	
}
