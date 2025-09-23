class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer>num=new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            num.add(nums1[i]);
        }
        Set<Integer>list=new HashSet<>();
        for(int i=0;i<nums2.length;i++){
            if(num.contains(nums2[i])){
                list.add(nums2[i]);
            }
        }
     return list.stream().mapToInt(i->i).toArray();   
    }
}