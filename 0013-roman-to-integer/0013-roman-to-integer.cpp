class Solution {
public:

    int romanToInt(string s) {
        int I=1,V=5,X=10,L=50,C=100,D=500,M=1000;
        auto value = [&](char c){
            if(c == 'I') return I;
            if(c == 'V') return V;
            if(c == 'X') return X;
            if(c == 'L') return L;
            if(c == 'C') return C;
            if(c == 'D') return D;
            return M;
        };
        int a=0;
        for(int i=0;i<s.length()-1;i++){
            int curr = value(s[i]);
            int next = value(s[i+1]);
            if(curr < next){
                a -= curr;     
            } else {
                a += curr;     
            }
        }
        a += value(s.back());
        return a;
    }
};