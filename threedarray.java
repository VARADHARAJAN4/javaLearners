package array;

public class threedarray {

	public static void main(String[] args) {
		// THREE D ARRAY   4x3x4
		int x[][][]= {{	{11111,2,3,4},
						{4,5,6,6},
						{3,3,4,8}},
				
						{{1,2,3,4},
						{4,5,6,6},
						{3,3,4,8}},
						
						{{1,2,3,4},
						{4,5,6,6},
						{3,3,4,8}},
						
						{{1,2,3,4},
						{4,5,6,6},
						{3,3,4,8}}
					};
		int y[][][]=x.clone();
		
		
	for(int h=0;h<4;h++)
	{
		for(int i=0;i<3;i++)//row
		{
			for(int j=0;j<4;j++)//column
			{
				System.out.print(y[h][i][j]+" ");
			}
				System.out.println();
		}
		System.out.println();
	}
}
}
