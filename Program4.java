import java.io.*;
class Demo{
	public static void main(String [] Shreyas)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the size :");
		int size =Integer.parseInt(br.readLine());
		
		
		float arr = new float [size];
		System.out.println("Enter th inputs :");
		for(int i =0 ; i<size ;i++){

	        	arr[i]=Float.parseFloat(br.readLine());
		}for(int i =0;i<size ; i++){
			System.out.println(arr[i]);
		}
	}
}


