class Solution {
public:
    ListNode *reverse(ListNode *head){
        ListNode *curr=head, *next=NULL, *prev=NULL;
        while(curr){
            next=curr->next;
            curr->next=prev;
            prev=curr;
            curr=next;
        }
        return head=prev;
    }
    bool isPalindrome(ListNode* head) {
        ListNode *curr=head, *slow=head, *fast=head;
        while(fast->next && fast->next->next) {
            slow=slow->next;
            fast=fast->next->next;
        }
        slow->next=reverse(slow->next);
        slow=slow->next;
        while(slow){
            if(slow->val != curr->val) return 0;
            slow=slow->next;
            curr=curr->next;
        }
        return 1;
    }
};