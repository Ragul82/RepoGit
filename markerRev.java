package For2;

public class markerRev {
	public static void main(String[]args) {
		int[] markersPrice= {250,150,60,10};
		int total=0;
		for(int i=markersPrice.length/2;i>=0;i--) {
			System.out.println(markersPrice[i]);
			total=total+markersPrice[i];
		}
			System.out.println(total);
			
		}
	}


