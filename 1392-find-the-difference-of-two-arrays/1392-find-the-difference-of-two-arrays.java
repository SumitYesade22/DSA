class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
     HashSet<Integer>set=new HashSet<>();
     HashSet<Integer>set1=new HashSet<>();
     for(int num:nums1){
        set.add(num);
     }
    for(int num:nums2){
        set1.add(num);
    }
    List<Integer>arr=new ArrayList<>();
    for(int n:nums1){
        if(!set1.contains(n) && !arr.contains(n)){
            arr.add(n);
        }
    }
     List<Integer>arr1=new ArrayList<>();
    for(int n:nums2){
        if(!set.contains(n) && !arr1.contains(n)){
            arr1.add(n);
        }
    }
    List<List<Integer>>ans=new ArrayList<>();
    ans.add(arr);
    ans.add(arr1);
    return ans;
    }
}