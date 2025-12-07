import java.util.List;

public class ManipulateArrayNumbers {

    public static int findNumberPosition(List<Integer> integers, int search) {
        if(integers.contains(search)) return integers.indexOf(search);
        else return -1;
    }

    public static void addNumber(List<Integer> integers, int add) throws Exception {
        if (findNumberPosition(integers, add) != -1) throw new Exception("Number already in the list");
        else integers.add(add);
    }

    public static void removeNumber(List<Integer> integers, int remove) throws Exception {
        if (findNumberPosition(integers, remove) ==-1) throw new Exception("Number not found in the list");
        else integers.remove(Integer.valueOf(remove));
    }

    public static void replaceNumber(List<Integer> integers, int numberToReplace, int replacementNumber) {
        if (findNumberPosition(integers, numberToReplace) == -1) {
            integers.add(replacementNumber);
        } else {
            integers.set(findNumberPosition(integers, numberToReplace), replacementNumber);
        }
    }
}
