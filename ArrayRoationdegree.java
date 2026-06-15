import java.util.*;
public class ArrayRoationdegree{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int choice no=sc.nextInt();
		int n= sc.nextInt();
		int[][] arr= new int[n][n];
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				arr[i][j]=sc.nextInt();
}
}
		if(choice==1){
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
		int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
       
 	    for(int i = 0; i < n; i++) {

            int left = 0;
            int right = n - 1;

            while(left < right) {

                int temp = arr[i][left];
                arr[i][left] = arr[i][right];
                arr[i][right] = temp;

                left++;
                right--;
            }
        }
        System.out.println("90 Degree Clockwise Rotation:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
}


			else{
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
		int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
       
 	    for(int j = 0; j < n; j++) {

            int top = 0;
            int bottom = n - 1;

            while(top < bottom) {

                int temp = arr[top][j];
                arr[top][j] = arr[bottom][j];
                arr[bottom][j] = temp;

                top++;
                bottom--;
            }
        }
        System.out.println("90 Degree AntiClockwise Rotation:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
}

    }
}