package week1.day2;

public class FindInterSection {
	public static void main(String[] args) {
		int a[] = {3,2,11,4,6,7};
		int b[] = {1,2,8,4,9,7};
		
		int alen = a.length;
		int blen = b.length;
		
		
		for (int i=0; i<alen; i++) {
		for (int j=0; j<blen; j++) {
	
		if(a[i]==b[j]){
			System.out.println(a[i]);
		}
		}
		}
	}

}

