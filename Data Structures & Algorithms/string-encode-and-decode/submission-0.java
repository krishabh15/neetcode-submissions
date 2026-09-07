class Solution {

    public String encode(List<String> strs) {
        if (strs.isEmpty()) return "EMPTY_LIST";
        StringBuilder encodedString = new StringBuilder();
        for(String str: strs){
            if("".equals(str)) encodedString.append("null");
            else encodedString.append(str);
            
            encodedString.append("π");
        }

        return encodedString.toString();
    }

    public List<String> decode(String str) {
        if ("EMPTY_LIST".equals(str)) return new ArrayList<>();
        String[] strs = str.split("π", -1);
        List<String> decodedStringList = new ArrayList<>();

        for(int i = 0; i < strs.length - 1; i++){
            String s = strs[i];
            if("null".equals(s)) decodedStringList.add("");
            else decodedStringList.add(s);
        }

        return decodedStringList;
    }
}
