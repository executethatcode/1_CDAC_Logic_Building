class Room{
	int height;
	int width;
	int breadth;

	int volume (int h1, int w1, int b1){
	              return(h1*w1*b1);
	}

	
	Room(int h,  int w, int b){
		height = h;
		width = w;
		breadth = b;
		int v= volume(height,width,breadth);
		System.out.println("volume :" + v);
 }
 


public static void main(String args[]){
	Room R1=new Room(5,6,7);

}
}