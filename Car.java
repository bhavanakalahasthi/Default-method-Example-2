
public class Car implements Vehicle, FourWheeler{
	
	 public void print(){
	      Vehicle.super.print();
	      FourWheeler.super.print();
	 }
		@Override
		public void blowHorn() {
			System.out.println("noise");
			
		}
		}

