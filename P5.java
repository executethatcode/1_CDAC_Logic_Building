class P5{
	public static void main(String[] args){
		int arr[]={5,3,9,7,1};
		int i;
		int max=arr[0];
		int smax=arr[1];
		for(i=0;i<arr.length;i++){
			if(arr[i]<max && arr[i]>smax){
				smax=arr[i];}
			else{
				max=arr[i];}
		}
	System.out.println("Second largest element is"+""+smax);
}
} 