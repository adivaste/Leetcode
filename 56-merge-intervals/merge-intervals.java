class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> merged = new ArrayList<>();
        boolean[] checked = new boolean[intervals.length];

        for (int i = 0; i < intervals.length; i++) {
            if (!checked[i]) {
                int[] local = new int[]{intervals[i][0], intervals[i][1]};
                checked[i] = true;

                int curr = i;
                int next = i + 1;

                while (next < intervals.length && local[1] >= intervals[next][0]) {
                    local[1] = Math.max(local[1], intervals[next][1]);
                    checked[next] = true;

                    curr = next;
                    next = next + 1;
                }

                merged.add(local);
            }
        }

        return merged.toArray(new int[merged.size()][]);

    }
}