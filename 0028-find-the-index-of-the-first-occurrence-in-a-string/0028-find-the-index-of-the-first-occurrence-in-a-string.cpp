class Solution {
public:
    int strStr(string haystack, string needle){
        int b=haystack.length();
        int c=needle.length();
        for(int i=0;i<=b-c;i++){
            int a=0;
            while (a < c && haystack[i + a] == needle[a]) {
            a++;
            }
            if(a==c){
                return i;
            }
        }
        return -1;
    }
};