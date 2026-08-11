/*
 * @lc app=leetcode id=13 lang=java
 *
 * [13] Roman to Integer
 */

// @lc code=start
class Solution {
    public int romanToInt(String s) {
        int value=0; 

    for(int i=0;i<s.length();i++){
       int current=getValue(s.charAt(i));
       if(i+1<s.length() && current<getValue(s.charAt(i+1))){
        value-=current;
       }else{
        value+=current;
       }
       }
       return value;
    }
    public int getValue(char c){
    if(c == 'I')
        return 1;
    if(c == 'V')
        return 5;
    if(c == 'X')
        return 10;
    if(c == 'L')
        return 50;
    if(c == 'C')
        return 100;
    if(c == 'D')
        return 500;
    if(c == 'M')
        return 1000;
    return 0;
    }
}
// @lc code=end

