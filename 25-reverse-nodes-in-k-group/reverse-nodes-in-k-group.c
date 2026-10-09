 struct ListNode* reverseKGroup(struct ListNode* head, int k) {
    if (!head || k == 1) {
        return head;
    }
    
    struct ListNode* curr = head;
    for (int i = 0; i < k; i++) {
        if (!curr) {
            return head;
        }
        curr = curr->next;
    }
    
    struct ListNode* prev = NULL;
    curr = head;
    for (int i = 0; i < k; i++) {
        struct ListNode* nextNode = curr->next;
        curr->next = prev;
        prev = curr;
        curr = nextNode;
    }
    
    head->next = reverseKGroup(curr, k);
    
    return prev;
}
   