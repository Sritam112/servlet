package sritam.nit.com;

public class DuplicateData {
	public static void m1(int arr[]) {
		int count=1,no=0,temp=0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j <=arr.length-1; j++)
				if (arr[i]==arr[j]) 
					count++;
			//end of inner loop
			if (count>=temp) {
				temp=count;
				no=arr[i];
			}
			count=0;
		}//end of outer loop
		System.out.println("NO "+ no+" is presented highest "+ temp+" times");
		//System.out.println(temp);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {4,5,6,4,3,2,4,4};
            m1(arr);            
            
            
            
            
            
            
            
            
            
            
            
            
            
	}

}
