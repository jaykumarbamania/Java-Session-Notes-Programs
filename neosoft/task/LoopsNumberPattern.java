package Lab2;

public class LoopsNumberPattern {

	public static void main(String[] args) {
		
		int n=5;
		
		for (int i = 1; i <=n; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print(j+" ");
			}
			for (int j = i; j <n; j++) {
				System.out.print("  ");
			}
			for (int j = i; j <n; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <=i; j++) {
				System.out.print(" "+j);
			}
			System.out.println();
			
		}
		
		
//		for (int i = 0; i <=n; i++) {
//		for (int j = n; j >=i; j--) {
//			System.out.print(j+" ");
//		}
//		System.out.println();
//	}
//	for (int i = 0; i <=n; i++) {
//		for (int j = n,p=n; j >=i; j--,p--) {
//			System.out.print(p+" ");
//		}
//		System.out.println();
//	}
//	
//	5 4 3 2 1 0 
//	5 4 3 2 1 
//	5 4 3 2 
//	5 4 3 
//	5 4 
//	5 

//	for (int i = 0; i <=n; i++) {
//		int p=5;
//		for (int j = 0; j <=i; j++) {
//			System.out.print(p +" ");
//			p--;
//		}
//		System.out.println();
//	}
	
//	5 
//	5 4 
//	5 4 3 
//	5 4 3 2 
//	5 4 3 2 1 
//	5 4 3 2 1 0 

	}

}
