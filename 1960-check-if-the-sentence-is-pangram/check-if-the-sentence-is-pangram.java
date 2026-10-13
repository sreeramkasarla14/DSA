class Solution {
    public boolean checkIfPangram(String sentence) {
        int n=sentence.length();
        if(n<26){
            return false;
        }
      for(char ch='a';ch<='z';ch++) {
        if(sentence.indexOf(ch)==-1){
            return false;
        }
      }
      return true;
    }
}
