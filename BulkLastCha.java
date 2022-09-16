package For2;

public class BulkLastCha {
	public static void main(String[]args) {
		String names[]= {"ram","arj","aju"};
		for(int i=names.length-1;i>=0;i--) {
			System.out.println(names[i].charAt(names[i].length()-1));
		}
		
	}

}
