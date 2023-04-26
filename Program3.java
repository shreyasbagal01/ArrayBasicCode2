import java.io.*;
class Demo{
	public static void main(String [] Shreyas)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the size :");
		int size = Integer.parseInt(br.readLine());
		int arr [] = new int[size];
		System.out.println("Enter the array input :");
		for (int i = 0;i<size;i++){
			arr[i] = Integer.parseInt(br.readLine());
		}	for (int i =0;i<size;i++){
			System.out.println(arr[i]);
		}
	}
}
