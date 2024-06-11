//two sum
class Solution {
    public int[] twoSum(int[] nums, int target) {
       
        int n=nums.length;
        if(nums==null|| nums.length<2){
            return new int[]{0,0};
        }
        HashMap<Integer,Integer> map =new HashMap<Integer,Integer>();
        for(int i=0;i<n;i++){
            if(map.containsKey(nums[i])){
                return new int[]{map.get(nums[i]),i};
            }
            else{
                map.put(target-nums[i],i);
            }
        }
        return new int[]{0,0};
    }
}
