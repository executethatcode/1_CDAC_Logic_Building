class Avg{
	public static void main(String[] args){
	int array[]={5,4,3,9,1,7,9};
	float sum=0;
	float avg;
	int len=array.length;
	System.out.println("Length of the array is" +""+ len);
	for(int i=0; i<len; i++){
		sum=(sum+array[i]);
		}
	avg=sum/len;
	System.out.println("Average of given array is" + avg);
}
}
			