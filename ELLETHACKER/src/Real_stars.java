
public class Real_stars {
	
	public static void main(String[] args) {
		
		int Lines = Integer.parseInt(args[0]);

		int X = 0;
		int C = 0;

		int lol = -1;
		while (X < Lines){	

			Lines -= 1;
			lol += 2;
			for (C = 0; C < Lines; C += 1){
				System.out.print(" ");
			}
			for (C = 0; C < lol; C += 1){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
