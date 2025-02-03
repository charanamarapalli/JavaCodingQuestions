package patterns;

public class AllPatterns {
	public static void main(String[] args) {
		//nStarTriangle(5);
		nStarTriangleChatgptSol(3);

	}

	public static void nForest(int n) {
//		* * *
//		* * *
//		* * *
		// Write your code here
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("* ");
			}
			System.out.println();

		}
	}
	
	public static void n2Forest(int n) {
//		* 
//		* *
//		* * *
        // Write your code here
        for(int i=0; i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

	public static void nTriangle(int n) {
//		1
//		2 2 
//		3 3 3
		// Write your code here
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
	
	

	public static void seeding(int n) {
//		* * *
//		* *
//		*
		// Write your code here
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void nNumberTriangle(int n) {
//		1 2 3
//		1 2
//		1
		// Write your code here
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i + 1; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
	
	public static void nStarTriangle(int n) {
//		   *
//		  ***
//		 *****

        // Write your code here
        for(int i=1;i<=n; i++){
            for(int j=1; j<=((n*2)-1); j++){
                if(j<=n-i || j>=n+i){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
                
            }
                 System.out.println();


        }
    }
	
	public static void nStarTriangleReverse(int n) {
//
//*****
// ***
//  *
		// Write your code here
        for(int i=1; i<=n; i++){
            for(int j=1; j<=(2*n-1); j++){
                if(j<=i-1 || j>2*n-i){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();

        }
 }
	
	public static void nStarTriangleChatgptSol(int n) {

	    for (int i = 1; i <= n; i++) {
	        // Print spaces
	        for (int j = 1; j <= n - i; j++) {
	            System.out.print(" ");
	        }
	        // Print stars
	        for (int j = 1; j <= (2 * i - 1); j++) {
	            System.out.print("*");
	        }
	        // Move to the next line
	        System.out.println();
	    }
	}
	

    public static void nStarDiamondBothStars(int n) {
//		  *
//		  ***
//		 *****
//		 *****
//		  ***
//		   *
        // Write your code here
        for(int i=0; i<n;i++){
            for(int j=1; j<n-i; j++){
                System.out.print(" ");
            }
            for(int j=0; j<2*i+1;j++){
                System.out.print("*");
            }
            for(int j =1; j<n-i; j++){
                System.out.print(" ");
            }
            System.out.println();
        }

        for(int i=0; i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=1; j<2*(n-i); j++){
                System.out.print("*");
            }
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    
    public static void pattern10(int n) {
//    	*
//    	**
//    	***
//    	**
//    	*
        // Write your code here
        for(int i=1; i<=n ; i++){
            for(int j=1;j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1; i<=n-1;i++){
            for(int j=1; j<n-i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    
    public static void nBinaryTrianglePatern11(int n) {
//    	1
//    	0 1
//    	1 0 1
        // Write your code here.
        for(int i=1; i<=n; i++){
            for(int j=1;j<=i; j++){
                if(i%2==1){
                    if(j%2==1){
                        System.out.print("1 ");
                    }
                    else{
                        System.out.print("0 ");
                    }
                }
                else{
                    if(j%2==1){
                        System.out.print("0 ");
                    }
                    else{
                        System.out.print("1 ");
                    }
                }
                
            }
            System.out.println();
        }
    }
    
    public static void numberCrownPattern12(int n) {
//    	1         1
//    	1 2     2 1
//    	1 2 3 3 2 1
        // Write your code here.
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            int k=i;
            for(int j=1;j<=i;j++){
                System.out.print(k-- +" ");
            }
            System.out.println();
        }
    }
    
    public static void nNumberTrianglePattern13(int n) {
//    	1
//    	2 3
//    	4 5 6
        // Write your code here
        int s=1;
        for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(s++ + " ");
			}
			System.out.println();
		}
    }
    
    public static void nLetterTrianglePattern14(int n) {
//    	A
//    	A B
//    	A B C
        // Write your code here
        for (int i = 1; i <= n; i++) {
            int a=65;
			for (int j = 1; j <= i; j++) {
				System.out.print((char) a + " ");
                a++;
			}
			System.out.println();
		}
    }
    
    public static void nLetterTrianglePattern15(int n) {
//    	A B C
//    	A B
//    	A
        // Write your code here
        for (int i = 1; i <= n; i++) {
            int a=65;
			for (int j = i; j <= n; j++) {
				System.out.print((char) a + " ");
                a++;
			}
			System.out.println();
		}
    }
    

    public static void alphaRampPattern16(int n) {
        // Write your code here
//    	A
//    	B B
//    	C C C
        int a=65;
        for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print((char) a + " ");   
			}
            a++;
			System.out.println();
		}
    }
    
    public static void alphaHillPattern17(int n) {
//        A
//        A B A
//      A B C B A
        // Write your code here
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            int s=65;
            for(int j=1;j<=2*i-1;j++){
                System.out.print((char) s+" ");
                //s++;
                if(j>=i){
                    s--;
                }
                else{
                    s++;
                }
            }
            
            for(int j=1;j<=n-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    
    public static void alphaTrianglePattern18(int n) {
        // Write your code here
//    	C
//    	C B 
//    	C B A
            for(int i=1; i<=n; i++){
                int k=65;
                for(int j=1; j<=i; j++){
                    System.out.print((char) (k+n-j) + " ");
                }
                System.out.println();

            }
    }
    
    public static void symmetryPattern19(int n) {
//    	* * * * * * 
//    	* *     * * 
//    	*         * 
//    	*         * 
//    	* *     * * 
//    	* * * * * * 
        // Write your code here
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i; j++){
                System.out.print("*"+" ");
            }
            for(int j=0;j<2*i; j++){
                System.out.print(" ");
            }
            for(int j=0;j<n-i; j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print("*"+" ");
            }
            for(int j=0;j<2*(n-i-1); j++){
                System.out.print(" ");
            }
            for(int j=0;j<=i; j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    
    public static void symmetryPattern20(int n) {
        // Write your code here
            for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print("*"+" ");
            }
            for(int j=0;j<2*(n-i-1); j++){
                System.out.print(" ");
            }
            for(int j=0;j<=i; j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }

        for(int i=1; i<n; i++){
            for(int j=0; j<n-i; j++){
                System.out.print("*"+" ");
            }
            for(int j=0;j<2*i; j++){
                System.out.print(" ");
            }
            for(int j=0;j<n-i; j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    
    public static void getStarPattern21(int n) {
        // Write your code herePattern21
//    	****
//    	*  *
//    	*  *
//    	****
        for(int i=0; i<n ; i++){
            for(int j=0; j<n ;j++){
                if(i==0 || i==n-1){
                    System.out.print("*");
                }
                else{
                    if(j==0 || j==n-1){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
    
    
    
    
}
    


