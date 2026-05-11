class Solution {
    public int[] topKFrequent(int[] arr, int k) {
               HashMap<Integer, Integer> map = new HashMap<>();

        for(int num: arr){
            map.merge(num, 1, Integer::sum);
        }

        List<Integer>[]bucket = new List[arr.length + 1];
        map.forEach((num, freq) -> {
            if(bucket[freq] == null) bucket[freq] = new ArrayList<>();
            bucket[freq].add(num);
        });
        
        List<Integer>result = new ArrayList<>();

        for(int i = bucket.length - 1; i >=0 && result.size() < k; i--){
            if(bucket[i] != null) result.addAll(bucket[i]);
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
