package For2;

public class studentsMarkReve {
	public static void main(String[] args) {
		int[] marks=new int[4];
		marks[0]=45;
		marks[1]=50;
		marks[2]=40;
		marks[3]=50;
		for(int i=marks.length-1;i>=marks.length/2;i--) {
			System.out.println(marks[i]);
		}
	}
	

}
