class Solution {
public:
    bool isHappy(int n) {
       priority_queue<int> a;
       unordered_set<int> b;
       while(true){
            if(n==1){
                return true;
            }
            if(b.count(n)){
                return false;
            }
            b.insert(n);
            a.push(n);
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