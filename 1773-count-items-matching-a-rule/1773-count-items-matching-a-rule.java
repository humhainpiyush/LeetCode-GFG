class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0, i = 0,j = 0;
        if(ruleKey.equals("type")) i = 0;
        else if(ruleKey.equals("color")) i=1;
        else if(ruleKey.equals("name")) i=2;
        
        while(j < items.size()){
            if(items.get(j).get(i).equals(ruleValue)) count += 1;
            j++;
        }
        return count;
    }
}