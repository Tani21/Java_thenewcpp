public class solution {
	public static void main(String[] args){
	    
	    Scanner sc = new Scanner(System.in);
	    
	    int testcases=0;
	    testcases=sc.nextInt();
	    
	    while(testcases>0){
	        
	        int N = sc.nextInt();
	        int sum=0;
	        
	        for(int i=1; i<=N; i++){
	            sum = sum + i;
	        }
	        
	        sum=sum+N;
	        System.out.println(sum);
	        testcases=testcases-1;
	    }
}
}
