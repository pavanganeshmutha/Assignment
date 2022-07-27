public class As1p4{
  public static void main(String[] args) {
  int n=15;
    for(int i=0;i<n;i++)
    {
    	for(int j=0;j<n;j++)
        {
        	if(i-j>=(n-3)/2 || i+j>=n+(n-5)/2)
        	System.out.print("*");
            else
            System.out.print(" ");
        }
        System.out.println();
    }
  }
}
