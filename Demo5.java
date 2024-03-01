import java.util.*;
class MatrixComp{
	public static void main(String[] args){
		int matrix1[][]={{1,2},{2,4}};
		int matrix2[][]={{1,2},{3,4}};
		int c=0;
	for(int i=0;i<2;i++){
		for(int j=0;j<2;j++){
			if(matrix1[i][j]==matrix2[i][j]){
			c=1;}
			else{	
			c=2;
			break;}
		}
	}

if(c==1){
System.out.println("Matrices are equal");}
else{
System.out.println("Matrices are not equal");}

}
}