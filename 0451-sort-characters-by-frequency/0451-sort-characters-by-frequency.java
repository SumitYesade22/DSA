class Element implements Comparable<Element> {
    char ch;
    int freq;

    public Element(char ch, int freq) {
        this.ch = ch;
        this.freq = freq;
    }

    @Override
    public int compareTo(Element that) {
        return that.freq - this.freq; // max-heap by frequency
    }
}

class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> mp = new HashMap<>();
        for (char c : s.toCharArray()) {
            mp.put(c, mp.getOrDefault(c, 0) + 1);
        }

        PriorityQueue<Element> que = new PriorityQueue<>();
        for (Map.Entry<Character, Integer> entry : mp.entrySet()) {
            Element element = new Element(entry.getKey(), entry.getValue());
            que.offer(element);
        }

        StringBuilder ans = new StringBuilder();
        while (!que.isEmpty()) {
            Element element = que.poll();
            while (element.freq > 0) {
                ans.append(element.ch);
                element.freq--;
            }
        }
        return ans.toString();
    }
}
