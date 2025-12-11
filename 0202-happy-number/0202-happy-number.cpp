class Solution {
public:
    bool isHappy(int n) {
       unordered_set<int> b;
       while(true){
            if(n==1){
                return true;
            }
            if(b.count(n)==1){
                return false;
            }
            b.insert(n);
            int d=0;
            
            while(n>0){
                int c=n%10;
                d+=c*c;
                n/=10;
            }
            n=d;
        }
    }
};