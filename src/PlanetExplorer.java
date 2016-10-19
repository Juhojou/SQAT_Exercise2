
// Before submitting write your ID and finish time here. Your ID is written on project description sheets.
// ID:
// Finish time:

public class PlanetExplorer {
	
	private int xkoord = 0, ykoord = 0, ySize=0, xSize=0;
	private String facingDirection = "N";
	
	public PlanetExplorer(int x, int y, String obstacles){
		y = ySize;
		x = xSize;
	/*	x and y represent the size of the grid.
	 *  Obstacles is a String formatted as follows: "(obs1_x,obs1_y)(obs2_x,obs2_y)...(obsN_x,obsN_y)" with no white spaces. 
	 *  
		Example use: For a 100x100 grid with two obstacles at coordinates (5,5) and (7,8)
		PlanetExplorer explorer = new PlanetExplorer(100,100,"(5,5)(7,8)")  
		 
	 */
	}
	
	public int getPlanetYSize(){
		return ySize;
	}
	
	public int getPlanetXSize(){
		return xSize;
	}
	
	public String executeCommand(String command){
		/* The command string is composed of "f" (forward), "b" (backward), "l" (left) and "r" (right)
		 * Example: 
		 * The explorer is on a 100x100 grid at location (0, 0) and facing NORTH. 
		 * The explorer is given the commands "ffrff" and should end up at (2, 2) facing East.
		 
		 * The return string is in the format: "(pos_x,pos_y,facing)(obs1_x,obs1_y)(obs2_x,obs2_y)..(obsN_x,obsN_y)" 
		 * Where pos_x and pos_y are the final coordinates, facing is the current direction the explorer is pointing to (N,S,W,E).
		 * The return string should also contain a list of coordinates of the encountered obstacles. No white spaces.
		 */
		//For some reason I can't get e.g. "ff" work with my split
		String[] commands = command.split("");
		for (int j=0; j<command.length(); j++)
		{
			if (commands[j] == "r"){
				 turnRight();
			}
			if (commands[j] == "l"){
				turnLeft();
			}
			if (commands[j] == "f"){
				goForward();
			}
			if (commands[j] == "b"){
				goBackward();
			}
		}
		return null;
	}

	private void goForward() {
		ykoord++;
	}
	
	private void goBackward() {
		if (ykoord == 0){
			ykoord = 100;
		}
		ykoord--;
	}

	private void turnLeft() {
		facingDirection = "W";
	}

	private void turnRight() {
		facingDirection = "E";
	}

	public String getStatus() {
		return "(" + xkoord + "," + ykoord + "," + facingDirection + ")";
	}

	public void setStatus(String givenStatus) {
		String[] values = givenStatus.replaceAll("\\(", "").replaceAll("\\)","").replaceAll(",", " ").split(" ");
		xkoord = Integer.parseInt(values[0]);
		ykoord = Integer.parseInt(values[1]);
		facingDirection = values[2];
	}


}
