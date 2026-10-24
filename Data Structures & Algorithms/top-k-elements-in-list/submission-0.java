class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer,Integer> HM = new HashMap<>();

        for(int num: nums){
            
            if(HM.containsKey(num)){
                HM.put(num, HM.get(num)+1);
            }
            else{
                 HM.put(num, 1);
            }
        }

    PriorityQueue<Map.Entry<Integer, Integer>> pq =
    new PriorityQueue<>(
        (a, b) -> b.getValue() - a.getValue()
    );

    pq.addAll(HM.entrySet());

    int arr[] = new int[k];

    for(int i =0; i< k; i++){
        arr[i] = pq.poll().getKey();
    }

    return arr;
         
    }
}
