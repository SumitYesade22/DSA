class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        int n = skill.length;
        long p = 0; 
        int s = skill[0] + skill[n - 1]; 

        int i = 0;   
        int j = n - 1; 

        while (i < j) {
            if (skill[i] + skill[j] != s) {
                return -1; 
            }
            p += (long) skill[i] * skill[j]; 
            i++;
            j--;
        }

        return p;
    }
}
