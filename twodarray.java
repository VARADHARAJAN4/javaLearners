package array;

public class twodarray {

	public static void main(String[] args) {
		// TwO-D Array	3x4
		int r[][]= {	{1,2,3,4},
						{4,5,6,6},
						{3,3,4,8}};
	
	for(int i=0;i<3;i++)//row
	{
		for(int j=0;j<4;j++)//column
		{
			System.out.print(r[i][j]+" ");
		}
			System.out.println();
	}
	}

}
