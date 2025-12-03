/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists){
        ListNode anotherone=new ListNode();
        ListNode a=anotherone;
        while(true){
            int currindex=-1;
            int minvalue=100;
            for(int i=0;i<lists.length;i++){
                if(lists[i]!=null){
                    if(lists[i].val<minvalue){
                        minvalue=lists[i].val;
                        currindex=i;
                    }
                }
            }
            if (currindex == -1) {
                break; 
            }       
            a.next=lists[currindex];
            a=a.next;
            lists[currindex] = lists[currindex].next;
        }
        return anotherone.next;
    }
}