package Java_Functional_Programming_Questions.Function_Composition_And_Pipelines;

import java.util.function.Function;

public class Q44 {
    public static void main(String[] args) {
        // Define two simple functions
        Function<Integer, Integer> multiplyByTwo = x -> x * 2;
        Function<Integer, Integer> addThree = x -> x + 3;

        // Compose functions: first addThree, then multiplyByTwo
        Function<Integer, Integer> addThenMultiply = multiplyByTwo.compose(addThree);

        // AndThen functions: first multiplyByTwo, then addThree
        Function<Integer, Integer> multiplyThenAdd = multiplyByTwo.andThen(addThree);

        // Apply the composed function
        Integer resultCompose = addThenMultiply.apply(5); // (5 + 3) * 2 = 16
        Integer resultAndThen = multiplyThenAdd.apply(5); // (5 * 2) + 3 = 13

        // Print the results
        System.out.println("Result of compose: " + resultCompose);
        System.out.println("Result of andThen: " + resultAndThen);
    }
}

