class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for(int num: nums){
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 1) + 1);
        }

        // Min Heap sorting by frequency (value) to pop the smallest element;
        PriorityQueue<Pair<Integer, Integer>> heap = new PriorityQueue<>(
            (a, b) -> a.getValue() - b.getValue());
        
        for(Map.Entry<Integer, Integer> entry: frequencyMap.entrySet()){
            heap.offer(new Pair<>(entry.getKey(), entry.getValue()));
            if(heap.size() > k) heap.poll();
        }

        int[] res = new int[k];
        int i = 0;
        while(!heap.isEmpty() && i < k){
            res[i++] = heap.poll().getKey();
        }

        return res;
    }
}
