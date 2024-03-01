import java.util.Scanner;
class Three{
	public static void main(String[] args){
	Scanner scn = new Scanner(System.in);
	System.out.println("Enter any number");
	int n=scn.nextInt();
	int sum=0;
	for (int i=1; i<n; i++){
		int t=2*(i-1);
		if(t%3==0){
			sum=sum+i;}
		else{
			continue;}
		}
	System.out.println("Sum is"+""+sum);
}
}	
			           