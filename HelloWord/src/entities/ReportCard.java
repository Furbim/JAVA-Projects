package entities;

public class ReportCard {

	public double ft;
	public double st;
	public double tt;
	
	public double finalgrade() {
	
		return ft + st + tt;
		
		
	}	
	public String result() {
		
		if (finalgrade() >= 60) {
		
			return ("PASS");
			
		}else {
			
			return ("Failed     Missing Points: " + (60 - finalgrade()));
			
			
			
		}
		
		
	}
	
	
}
