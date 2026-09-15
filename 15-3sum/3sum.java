class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
       int n=nums.length;
       List<List<Integer>> ans = new ArrayList<>();
       for(int i=0;i<n-2;i++){
        if(i>0 && nums[i]==nums[i-1]){
            continue;
        }
        int l=i+1;
        int r=n-1;
        int t=0-nums[i];
        while(l<r){
            int sum=nums[l]+nums[r];
            if(sum==t){
                List<Integer> temp= new ArrayList<>();
                temp.add(nums[i]);
                temp.add(nums[l]);
                temp.add(nums[r]);
                ans.add(temp);
                l++;
                r--;
                while(l>0 &&l<r && nums[l]==nums[l-1]){
                    l++;
                }
                while(r<n-1 && l<r && nums[r]==nums[r+1]){
                    r--;
                }
            }
            else if(sum>t){
                r--;
            }
            else{
                l++;
            }
        }
       }
       return ans; 
    }
}