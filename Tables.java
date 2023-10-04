public class Tables {
	public static void main(String[] args) {
		int i = 1; 
		while(i<=20) {
			System.out.println(i+" Table started");
			int j = 1;
			while(j<=10){
				System.out.println(i+"*"+j+"="+(i*j));
				j = j+1;
			}
			System.out.println(i+" Table completed");
			System.out.println("------------------");
			i = i+1;
			
		}
	}

}
