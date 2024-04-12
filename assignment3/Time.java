package assignment3;

public class Time {
	int hr,min,sec;
	
	public Time(int hr, int min, int sec) {
		if(isValid(hr,min,sec))
		{
			
		this.hr = hr;
		this.min = min;
		this.sec = sec;
		}
		else {
			System.out.println("set to default values"+hr+":"+min+":"+sec);
			hr=0;
			min=0;
			sec=0;
		}
	}
	public boolean isValid(int hr, int min,int sec) {
		if(hr==24) {
			return (min==0&& sec==0);
		}
		else
			return(hr>=0 && hr<=24 )&&(min>=0 && min<=60)&&(sec>=0 && sec<=60);
	}
	public void display() {
		System.out.println(hr+":"+min+":"+sec);
	}

	public static void main(String[] args) {
		Time time=new Time(24, 0, 0);
		time.display();
	}

}
