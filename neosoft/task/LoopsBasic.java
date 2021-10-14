package Lab2;

public class LoopsBasic {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int n=5;
//		for (int i = 1; i <= n; i++) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
//		* 
//		* * 
//		* * * 
//		* * * * 
//		* * * * * 
		
//		for (int i = 1; i <= n; i++) {
//			for (int j = i; j <= n; j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
//		
//		* * * * * 
//		* * * * 
//		* * * 
//		* * 
//		*
		
//		for (int i = 1; i <= n; i++) {
//			for (int j = i; j <= n; j++) {
//				System.out.print("* ");
//			}
//			for (int j = 1; j < i; j++) {
//				System.out.print(" ");
//			}
//			for (int j = 1; j <i; j++) {
//				System.out.print(" ");
//			}
//			for (int j = 1; j <= i; j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		
//		for (int i = 1; i <= n; i++) {
//			for (int j = i; j <= n; j++) {
//				System.out.print("  ");
//			}
//			for (int j = 1; j <= i; j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
//		
//			        * 
//			      * * 
//			    * * * 
//			  * * * * 
//			* * * * * 
		
//		for (int i = 1; i <= n; i++) {
//			for(int j=1; j<i;j++) {
//				System.out.print("  ");
//			}
//			for (int j = i; j <=n ; j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
//		* * * * * 
//		  * * * * 
//		    * * * 
//		      * * 
//		        * 
		
//		for (int i = 1; i <=n; i++) {
//			for (int j = i; j <= n; j++) {
//				System.out.print("  ");
//			}
//			for (int j = 1; j <=i; j++) {
//				System.out.print("* ");
//			}
//			for (int j = 1; j <=i; j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
//		
//			        * * 
//			      * * * * 
//			    * * * * * * 
//			  * * * * * * * * 
//			* * * * * * * * * * 
		
//		for (int i = 1; i <=n; i++) {
//			for (int j = 1; j < i; j++) {
//				System.out.print("  ");
//			}
//			for (int j = i; j <n; j++) {
//				System.out.print("* ");
//			}
//			for (int j = i; j <=n; j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
//		
//		* * * * * * * * * 
//		  * * * * * * * 
//		    * * * * * 
//		      * * * 
//		        * 
		
//		for (int i = 1; i <n; i++) {
//			for (int j = i; j < n; j++) {
//				System.out.print("  ");
//			}
//			for (int j = 1; j <i; j++) {
//				System.out.print("* ");
//			}
//			for (int j = 1; j <=i; j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
//		for (int i = 1; i <=n; i++) {
//			for (int j = 1; j < i; j++) {
//				System.out.print("  ");
//			}
//			for (int j = i; j <n; j++) {
//				System.out.print("* ");
//			}
//			for (int j = i; j <=n; j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
//	}
//		    * 
//		  * * * 
//		* * * * * 
//	  * * * * * * * * 
//		* * * * * * * * 
//		* * * * * * * 
//		* * * * * 
//		  * * * 
//		  	* 
		
//		for (int i = 1; i <n-1; i++) {
//			for (int j = 1; j <=i; j++) {
//				System.out.print("  ");
//			}
//			for (int j = i; j <n; j++) {
//				System.out.print("* ");
//			}
//			for (int j = i; j <=3; j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
//		for (int i = 1; i <=n-1; i++) {
//			for (int j = i; j < n; j++) {
//				System.out.print("  ");
//			}
//			for (int j = 1; j <=i; j++) {
//				System.out.print("* ");
//			}
//			for (int j = 1; j <i; j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
//		
//		  * * * * * * * 
//		    * * * * * 
//		      * * * 
//		        * 
//		      * * * 
//		    * * * * * 
//		  * * * * * * * 
		
		for (int i = 1; i <=4; i++) {
			for (int j = 1; j <=i; j++) {
				if(j==4) {
					System.out.print("* * ");
					break;
				}
				System.out.print("* ");
			}
			for (int j = i; j <4; j++) {
				System.out.print("  ");
			}
			for (int j = i; j <4; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <=i; j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
		for (int i = 1; i <4; i++) {
			for (int j = i; j <=3; j++) {
				System.out.print("* ");
			}
			for (int j = 1; j <=i; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <=i; j++) {
				System.out.print("  ");
			}
			for (int j = i; j <=3; j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}
}
