package mediumLevelProgramms;

public class ArrayIndexPosition {
	public static void main(String[] args) {
		
	int a[] = {1,2,3,4,5};
	int b[] = {2,3};
	int index = 0;
	int count =0;
	
	for(int i = 0;i<b.length;i++)

	{
		for(int j=index;j<a.length;j++)          
		{
			if(b[i]==a[j])
			{		
				count++;                                                            
				if(count==1)		  				
				{
					index=j;   
				}	
			}
		}
	}

	if(b.length==count)

	System.out.println(index);

}}
