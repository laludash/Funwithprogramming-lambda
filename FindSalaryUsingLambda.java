package FunWithProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindSalaryUsingLambda {

	public static void main(String[] args) {
		
	
		List<Integer> sal = Arrays.asList(20000,30000,25000,25000,10000,45000);
		List<Integer> sort_sal = sal.stream().sorted((s1,s2)  -> s2.compareTo(s1))
				.distinct().collect(Collectors.toList());
		System.out.println(sort_sal.get(1));
		
		
	}

}
