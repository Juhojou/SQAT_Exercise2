import static org.junit.Assert.*;

import org.junit.Test;

public class TestPlanetExplorer {
	

	@Test
	public void test_planetIsMade() throws PlanetExplorerException{
		int xkoord = 100;
		int ykoord = 100;
		PlanetExplorer explorer = new PlanetExplorer(100, 100, null);
		assertNotNull(explorer);
	}
	
}
