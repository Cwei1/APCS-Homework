public class RPN{
	
	public MyStack newStack = new MyStack();

	public String calculate(String s){
		int index=0;
		while (index < s.length()){
			String operator = s.substring(index, index+1);
			if (operator.equals("*")){
				newStack.push(" "+(Integer.parseInt(newStack.pop())*Integer.parseInt(newStack.pop())));
				System.out.println(newStack);
			}
			else if (operator.equals("/")){
				newStack.push(" "+(Integer.parseInt(newStack.pop())/Integer.parseInt(newStack.pop())));
				System.out.println(newStack);
			}
			else if (operator.equals("-")){
				newStack.push(" "+(Integer.parseInt(newStack.pop())-Integer.parseInt(newStack.pop())));
				System.out.println(newStack);
			}
			else if (operator.equals("+")){
				newStack.push(" "+(Integer.parseInt(newStack.pop())+Integer.parseInt(newStack.pop())));
				System.out.println(newStack);
			}
			index++;
		}
		return newStack.pop();
	}

	public static void main(String[] args){
		RPN calculator=new RPN();
		System.out.println(calculator.calculate("1 4 2 4 6 2 3 4 / * - + * / - +"));
	}
}