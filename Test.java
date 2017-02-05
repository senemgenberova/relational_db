public class Test {
	public static void main(String args[]){
		int n = Integer.parseInt(args[0]);
		int n1 = 0, k=0;
		while(n!=0){
			n1 = n%10;
			if(n1==0)
			k++;
			n = n/10;
		}
		if(k>=2){
			System.out.println("YES");
		}
		else{
			System.out.println("NO");
		}
	}	
}	
