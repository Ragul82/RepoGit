package For2;

public class StudentsMark {
	public static void main(String[] args) {
		int[] studentMarks=new int[5];
		studentMarks[0]=34;
		studentMarks[1]=50;
		studentMarks[2]=60;
		studentMarks[3]=50;
		studentMarks[4]=45;
		
		for(int i=studentMarks.length/2;i<studentMarks.length;i++) {
			System.out.println(studentMarks[i]);
			
		}
	}

}
