
public class TwoDimentionalArray {
	public static void main(String[] args) {
		int ROWS=3;
		int COLS =3;
		int table[][]= new int[ROWS][COLS];
		table[0][0]=10;
		table[0][1]=11;
		table[0][2]=12;
		
		table[1][0]=10;
		table[1][1]=11;
		table[1][2]=12;
		
			table[2][0]=20;
			table[2][1]=21;
			table[2][2]=22;
			
			System.out.println(table.length);
			System.out.println(table[0].length);
			System.out.println(table[0][0]);
			
			for(int i=0; i<ROWS; i++) {
				for(int j=0; j<COLS; j++) {
					System.out.print(" "+table[i][j]);
					                           System.out.println(" ");
				}
				
			}
			
			}
		
	}