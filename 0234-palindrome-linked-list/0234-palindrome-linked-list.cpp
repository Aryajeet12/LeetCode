/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    bool isPalindrome(ListNode* head) {
        int count=0;
        ListNode* l1=head;
        ListNode* l2=head;
        while(l2 != nullptr && l2->next != nullptr){
            l1=l1->next;
            l2=l2->next->next;
        }
        ListNode* perv=nullptr;
        ListNode* curr=l1;
        while(curr!=nullptr){
            ListNode* reverse=curr->next;
            curr->next=perv;
            perv=curr;
            curr=reverse;
        }
        ListNode* first=head;
        ListNode* second=perv;
        while(second!=nullptr){
            if(first->val!=second->val){
                return false;
            }
            first=first->next;
            second=second->next;
        }
        return true;
    }
};