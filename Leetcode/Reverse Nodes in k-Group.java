class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null || head.next==null) return head;
        
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        
        int totalNodes = 0;
        ListNode curr = head;
        while(curr!=null) { curr = curr.next; totalNodes++;}
        
        curr = head;
        ListNode next = null;
        ListNode prev = dummy;
        
        while(totalNodes>=k){
            curr = prev.next;
            next = curr.next;
            
            for(int i=1; i<k; i++){
                curr.next = next.next;
                next.next = prev.next;
                prev.next = next;
                next = curr.next;
            }
        prev = curr;
        totalNodes-=k;
        }
   return dummy.next; }
}
