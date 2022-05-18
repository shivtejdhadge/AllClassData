package SundayPratice2;

public class ArthematicOpertator {
	//Room Bills
	public static void main(String[] args) {
		
		int RoomRent=6000/3;
         int Totallightbill=600;
		int Lightbill=800/3;
		int Cook=3000/3;
	int R=(RoomRent+Lightbill+Cook);
	int S=(RoomRent+Lightbill+Cook);
	int V=(RoomRent+Lightbill+Cook);
		
		System.out.println("Room Rent Per Head="+RoomRent);
		System.out.println("Light Bill Per Head"+Lightbill);
		System.out.println("Cook Per Head="+Cook);
		System.out.println("Shivtej Total Amount="+(RoomRent+Lightbill+Cook));
		System.out.println("Rajesh Total Amount="+(RoomRent+Lightbill+Cook));
		System.out.println("Vaibhav Total Amount="+(RoomRent+Lightbill+Cook));

		if(RoomRent==2000&&Totallightbill>=500) {
			System.out.println("Need to Save Electricity Extra amout for this Month="+(Totallightbill-500)+"RS");
		} else if (RoomRent==2000&&Totallightbill<500){
			System.out.println("Congrats You SaveThis Month="+(500-Totallightbill));
		}
		
		
		System.out.println("Same Amout of all="+"Rajesh= "+(R==V)+"Shivtej= "+(R==S));
		
		
		
		
	}

}
