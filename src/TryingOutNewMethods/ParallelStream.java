package TryingOutNewMethods;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ParallelStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> ll = Arrays.asList(12, 4, 6, 78, 9);

		ll.stream().parallel().sorted(Comparator.reverseOrder()).forEach(n -> System.out.println(n));

	}

}
