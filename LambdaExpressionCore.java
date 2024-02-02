package FunWithProgramming;

import java.util.ArrayList;

public class LambdaExpressionCore {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> li2 = new ArrayList<Integer>();
		li2.add(16);
		li2.add(18);
		li2.add(19);
		li2.add(50);
		li2.add(165);
		li2.add(150);
		li2.add(36);
		li2.add(86);
		System.out.println("output");
		li2.forEach(digit  -> {
			
			if(digit % 2 ==0)
			{
				System.out.println("Even Number -->"+digit);
			}
			if(digit% 3 == 0)
			{
				System.out.println("Odd Number -->"+digit);
			}
			if(digit % 4 == 0)
			{
				System.out.println("Number div by 4 -->"+digit);
			}
			if(digit % 5  == 0)
			{
				System.out.println("Number div by 5 -->"+digit);
			}
			if(digit % 6 == 0)
			{
				System.out.println("Number div by 6 -->"+digit);
			}
			
		});
		
		System.out.println("String type Lambda Expression");
		ArrayList<String> li3 = new ArrayList<String>();
		li3.add("Siva");
		li3.add("Prajwal");
		li3.add("Lalu");
		li3.add("Krishna ");
		li3.add("Ananya");
		li3.add("Sharat");
		li3.add("Ritesh");
		li3.add("Parasuram");
		li3.forEach(name  -> {
			
			if(name.startsWith("A"))
			{
				System.out.println("Name start with A-:"+name);
			}
			
			if(name.contains("Siva")) 
			{
				System.out.println(name);
			}
			
	
		});
		
		
		

		
		
		
		
		
		
		
		
		
		

	}

}
