package FunWithProgramming;

import java.util.stream.IntStream;

public class FunwithJava8Features {

	public static void main(String[] args) {
		
		//Using For Loop
		System.out.println("Using Normal For Loop");
		for(int i =0; i<10 ; i++)
			System.out.println("Result ->" +i);
		
		System.out.println( );
		System.out.println("1st OutPut Of the Stream Api");
		
		// Java8 Stream Example 
		IntStream.iterate(1, i -> i<10, i->i+1)
		         .filter(i-> i % 2 == 0)
		         .forEach(result -> System.out.printf("% d",result));
		
		System.out.println( );
		System.out.println("Second OutPut Of the Stream");
		
		IntStream.iterate(1, i -> i<=15, i-> i+2)
		          .forEach(result -> System.out.printf("% d", result));
		
		System.out.println( );
		System.out.println("Third OutPut Of the Stream");
		
		IntStream.iterate(15, i-> i<=20, i->i+3)
		          .forEach(result -> System.out.printf("% d", result));
		
		System.out.println( );
		System.out.println("Character OutPut of the Stream");
		
		IntStream.iterate('A', i -> i <='Z', i->i+1) // ascii 97
		            .filter(i -> Character.toUpperCase(i) > 'E')
		           .forEach(result -> System.out.printf("%c", result));
		
		System.out.println( );
		System.out.println("Character OutPut of the Stream");
		
		IntStream.iterate('a', i -> i <= 'z', i-> i+1)
		 .filter(i -> Character.toLowerCase(i) > 'f')
		  .filter(i -> i % 2 == 0)
		 .forEach(result -> System.out.printf("%c", result));
		
		System.out.println( );
		System.out.println("Character print by div of 3 OutPut");
		
		IntStream.iterate('a', i -> i<= 'z', i-> i+1)
		         .filter(i -> i % 3 == 0)
		          .forEach( result -> System.out.printf("%c",result));
		
		System.out.println( );
		System.out.println("Reverse Order of Stream");
		
		IntStream.iterate('z', i -> i>='a', i-> i-1)
		 .forEach( result -> System.out.printf("%c",result));
		
		System.out.println( );
		System.out.println("Lowercase Alphabet");
		
		IntStream.iterate('A', i -> i <= 'Z', i-> i+1)
		    .map(Character::toLowerCase)
		    .forEach(result -> System.out.printf("%c", result));
		
	}

}
