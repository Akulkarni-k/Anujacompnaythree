
public class Maxno {
public static void main(String[] args) {
	
	int a[]= {18,569,856};
	int max=a[0];
	for(int i=1;i<a.length;i++) {
		if(a[i]>max)
		{
			max=a[i];
			
		}
	}System.out.println("max no"+max);
	
	int min=a[0];
	for(int i=1;i<a.length;i++)
	{
		if(a[i]<min)
		{
			min=a[i];
	
}}System.out.println("max no"+min);
	
}
}
