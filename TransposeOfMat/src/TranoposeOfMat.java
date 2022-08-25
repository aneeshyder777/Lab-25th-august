
// Program to transpose a 3X2 matrix
public class TranoposeOfMat {
	public static void main(String[] args) {
		//Given matrix 
		int mat[][]= {{1,2},{4,5},{8,9}};
		//another matrix to store transpose of a matrix 
		int transpose[][]=new int[2][3];//matrix with 2 rows and three columns
		//Transpose of matrix using for loop
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				transpose[i][j]=mat[j][i];
			}
		}
		
		System.out.println("Transpose of matrix:");
		for(int i=0;i<2;i++){    
			for(int j=0;j<3;j++){    
			System.out.print(transpose[i][j]+" "); 
		
	}
			System.out.println();
		
		

		}
	}
}
