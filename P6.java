class P6{
	public static void main(String[] args){
		int arr[]={1,2,3,4,5};
		int i,j, temp;
		int len=arr.length;
		temp=arr[0];
		for(i=0, j=1;i<len && j<len;i++,j++){
			temp=arr[i];
			arr[i]=arr[arr.length-j];
			arr[arr.length-j]=temp;
		}
		System.out.println("reversed array is:");
		for(i=0;i<len;i++){
			System.out.print(arr[i]);
		}
		
}
}
		