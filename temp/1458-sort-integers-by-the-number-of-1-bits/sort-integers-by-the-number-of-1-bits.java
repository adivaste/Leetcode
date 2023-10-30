import java.util.Arrays;

class Solution {
    public int[] sortByBits(int[] arr) {
        Integer[] boxedArr = Arrays.stream(arr).boxed().toArray(Integer[]::new);

        Arrays.sort(boxedArr, (Integer x, Integer y) -> {
            int diff = Integer.compare(getOnesCount(x), getOnesCount(y));
            if (diff == 0) {
                return Integer.compare(x, y);
            }
            return diff;
        });

        return Arrays.stream(boxedArr).mapToInt(Integer::intValue).toArray();
    }

    public int getOnesCount(int number) {
        int count = 0;
        while (number != 0) {
            count += number & 1;
            number = number >> 1;
        }
        return count;
    }
}
