package sg.gov.cpf.javafoundation.day1;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		int arr[][]= {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
		
		for (int i=0;i<4;i++) {
			for (int j=0;j<3;j++) {
				System.out.println(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
