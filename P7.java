class P7{
	public static void main(String[] args){
		int arr1[]={1,2,3,4,5};
		int arr2[]={3,4,5,6,7};
		
		int i,j,k;
		int len1=arr1.length;
		int len2=arr2.length;
		int common[]= new int[len1];
		for(i=0,k=0;i<len1&&k<len1;i++,k++){
			for(j=0;j<len2;j++){
				if(arr1[i]==arr2[j]){
					common[k]=arr2[j];}
				else{
					continue;}
			}
		}
		System.out.println("common elements are:");
		for(i=0;i<len1;i++){
		
				System.out.print(common[i]);
			}
		
}
}