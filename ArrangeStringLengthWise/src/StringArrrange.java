import java.util.*;
public class StringArrrange {
	static void sort(String[]s, int n)
	{
		for(int i=1;i<n;i++)
		{
			String temp = s[i];
			int j = i-1;
			while(j>=0 && temp.length() <s[j].length())
			{
				s[j+i]=s[j];
				j--;
			}
			s[j+1] = temp;
		}
		
		
	}
	static void printArrayString(String str[], int n)
	{
		for(int i=0; i<n; i++)
		System.out.print(str[i]+" ");
	}

	public static void main(String[] args) {
		String []arr = {"my","name","is","anees"};
		int n =arr.length;
		sort(arr,n);
		printArrayString(arr,n);
		

	}

}
