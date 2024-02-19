package PracticeQuestions;
import java.util.ArrayList;
import java.util.List;

public class flatten_array {

    @SuppressWarnings("unchecked")
    public static List<Integer> flattenArray(List<Object> nestedList) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < nestedList.size(); i++) {
            Object element = nestedList.get(i);

            if (element instanceof Integer) {
                result.add((Integer) element);
            } else if (element instanceof List) {
                // Recursive call to flatten the nested list
                result.addAll(flattenArray((List<Object>) element));
            }
        }

        return result;
    }

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        // Example 1
        List<Object> array1 = new ArrayList<Object>();
        array1.add(1);
        array1.add((List<Object>) (Object) List.of(2, 3));
        array1.add((List<Object>) (Object) List.of(4, (List<Object>) (Object) List.of(5, 6)));
        array1.add(7);

        List<Integer> flattenedArray1 = flattenArray(array1);
        System.out.println("Flattened Array 1: " + flattenedArray1);

        // Example 2
        List<Object> array2 = (List<Object>) (Object) List.of(
                (List<Object>) (Object) List.of(1, 2),
                (List<Object>) (Object) List.of(3, 4),
                (List<Object>) (Object) List.of(5, 6)
        );

        List<Integer> flattenedArray2 = flattenArray(array2);
        System.out.println("Flattened Array 2: " + flattenedArray2);
    }
}
