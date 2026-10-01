class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {

            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        int[] result = new int[k];

        for (int i = 0; i < k; i++) {

            int maxNum = 0;
            int maxCount = 0;

            for (int num : map.keySet()) {

                if (map.get(num) > maxCount) {
                    maxCount = map.get(num);
                    maxNum = num;
                }
            }

            result[i] = maxNum;

            map.put(maxNum, 0);
        }

        return result;
    }
}