import java.io.*;
class Demo{
	public static void main(String [] Shreyas)throws IOException{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the size of array :");
		int size = Integer.parseInt(br.readLine());
		int EvenCount =0;
		int OddCount = 0;

		System.out.println("Enter the element :");
		int arr[]=new int[size];

		for(int i=0; i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		for(int i =0;i<arr.length;i++){
			if(arr[i] %2 == 0){
				EvenCount++;
			}else{
				OddCount++;
			}
			
	        	}
		        System.out.println("Even Number Count:"+EvenCount);
			System.out.println("Odd Number Count :"+OddCount);
			
	}
	
}
