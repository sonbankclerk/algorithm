import java.io.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int inputInt = Integer.parseInt(br.readLine());
		String inputString = br.readLine();
		String a = " ";
		for(int i=0; i<inputString.length(); i++){
			char x = inputString.charAt(i);
			
			if(Character.isUpperCase(x)){
				a += Character.toLowerCase(x);
			}else{
				a += Character.toUpperCase(x);
			}
		}
		
		System.out.println(a);
	}
}