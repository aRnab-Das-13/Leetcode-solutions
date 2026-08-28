class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> frequency = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            frequency.put(s.charAt(i), frequency.getOrDefault(s.charAt(i), 0) + 1);
        }

        ArrayList<Character> chars = new ArrayList<>(frequency.keySet());

        chars.sort((a, b) -> frequency.get(b) - frequency.get(a));

        StringBuilder result = new StringBuilder();
        for(char ch : chars){
            int count = frequency.get(ch);
            for(int i = 0; i < count ; i++){
                result.append(ch);
            }
        }
        return result.toString();

    }
}