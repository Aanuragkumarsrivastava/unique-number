public class Main 
{
 
	 public static void main(String[] args) 
	{
  
		 int a=0;
		
for(int i=1;i<=4;i++) 
		{
  
			for(int j=1;j<=4;j++)
			{
    
				for(int k=1;k<=4;k++) 
				{
     
					 if(i!=j && i!=k && k!=j) //checking the digits are unique or not
					{
					System.out.println(i+""+j+""+k); //displaying output of unique number
					
        a++;
     
				 	}      
   
			 	}
 
		 	}
		
}
		
System.out.println("total number is"+a);
 //displaying the number of unique number has been formed
	}

}
