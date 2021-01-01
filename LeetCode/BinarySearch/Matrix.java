// Java program to print the elements of 
// a 2 D array or matrix 
import java.io.*; 
class GFG { 

	public static int countNegative(int grid[][]) 
	{ 
		int count = 0;
		int n = grid.length;
		int m = grid[0].length;
		int row = n - 1;
		int col = 0;

		while(row >= 0 && col < m){
			if(grid[row][col] < 0){
				count = count + (m-col);
				row -=1;
			}else{
				col+=1;
			}
		}
        // for(int i=0;i<grid.length;i++){
        //     for(int j = 0;j<grid[i].length;j++){
        //         System.out.println("element : "+grid[i][j]);
        //         if(grid[i][j] < 0){
        //             count += 1;
        //         }
        //     }
        // }
        return count;
	} 

	public static void main(String args[]) throws IOException 
	{ 
		int mat[][] = { { 5,1,0 }, 
						{-5,-5,-5 }, 
						 }; 
		int count = countNegative(mat); 
        System.out.println("count : "+count);
	} 
} 
