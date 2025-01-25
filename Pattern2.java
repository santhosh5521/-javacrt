package day5;

public class Pattern2 {
     public static void main(String[] args) {
		for(int r = 1,sp=40;r<=5;r++) {
			for(int k =1;k<sp;k++) {
			System.out.print(" ");
		}//for int k
		sp = sp-1;
		for(int c=1;c<=r;c++) {
			System.out.print(r+" ");
		}//for int c
		System.out.println();
		}
		
	}//main method
     
}//class




/*         1
 *        2 2
 *       3 3 3
 *      4 4 4 4
 *     5 5 5  5  5
 * 
 */