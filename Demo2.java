class minmax{
	public static void main(String[] args){
	int array[]={5,4,3,9,1,7,9};
	int min=array[0];
	int max=array[0];
	int len=array.length;
	for(int i=0; i<len; i++){
		if(array[i]<min){
			min=array[i];}
		else{
			continue;
			}
		}

	for(int i=0; i<len; i++){
		if(array[i]>max){
			max=array[i];}
		else{
			continue;
			}
		}
	System.out.println("smallest number in given array is:"+""+min);
	System.out.println("largest number in given array is:"+""+max);
}
}
			