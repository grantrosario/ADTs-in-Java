package ds.stack;

public class App {

	public static void main(String[] args) {
//		Stack theStack = new Stack(5);
//		theStack.push(20);
//		theStack.push(40);
//		theStack.push(60);
//		theStack.push(80);
		
//		while(!theStack.isEmpty()){
//			long value = theStack.pop();
//			System.out.println(value);
//		}
		
		System.out.println(reverseString("Hello"));
		
	}
	
	public static String reverseString(String str){
		int stackSize = str.length();
		Stack strStack = new Stack(stackSize);
		for (int i = 0; i < stackSize; i++){
			strStack.push(str.charAt(i));
		}
		String result = "";
		while(!strStack.isEmpty()){
			char value = strStack.pop();
			result = result + value;
		}
		
		return result;
	}
	
}
