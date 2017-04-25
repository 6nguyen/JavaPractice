package testPackage;


public class timeFormat {

	private int hour;
	private int minute;
	private int second;
	

//4) Using the Time Class and conditional
	public void setTime(int h, int m, int s){
		// if h > 0, and h < 24, then h.  If not, then assign 0
		hour = ((h>=0 && h<24 ? h : 0));
		minute = ((m>=0 && m<60 ? m : 0));
		second = ((s>=0 && s<60 ? s : 0));
	}
	
	public String toMilitaryTime(){
		return String.format("%02d:%02d:%02d", hour, minute, second);
	}
	
	public String toNormalTime(){
		return String.format("%d:%02d:%02d %s", 
				(hour==0 || hour==12 ? 12:hour%12),
				minute, second, 
				(hour<12 ? "AM" : "PM"));
	}
}