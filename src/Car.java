
public class Car {
	

	public static void main(String args[])
	{
		class Car{
			
			int year;
			String make;
			double speed;

			public Car(int y,String m,double s){
				this.year = y;
				this.make = m;
				this.speed = s;
			}

			public double getSpeed(){
				return this.speed;
			}
			public String getMake(){
				return this.make;
			}
			public int getYear(){
				return this.year;
			}

			public void accelerate(){
				this.speed+=1;
			}
		
		
		
		}
	}
}



