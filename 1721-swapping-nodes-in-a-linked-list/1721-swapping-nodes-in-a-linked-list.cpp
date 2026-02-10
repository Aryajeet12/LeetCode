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
    ListNode* swapNodes(ListNode* head, int k){
        if(head==nullptr){
            return head;
        }
        ListNode* store = head;
        for(int i=1;i<k;i++){
            store=store->next;
        }
        ListNode* slow=head;
        ListNode* fast=store;
        while(fast->next!=nullptr){
            slow=slow->next;
            fast=fast->next;
        }
        swap(store->val, slow->val);
        return head;

    }
};