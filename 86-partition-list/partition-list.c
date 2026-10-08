/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* partition(struct ListNode* head, int x) {
    // Dummy heads to start the two partitions
    struct ListNode less_head;
    struct ListNode greater_head;
    
    // Pointers to track the end of each partition
    struct ListNode* less = &less_head;
    struct ListNode* greater = &greater_head;
    
    less->next = NULL;
    greater->next = NULL;
    
    struct ListNode* curr = head;
    
    // Traverse the original list
    while (curr != NULL) {
        if (curr->val < x) {
            less->next = curr;
            less = less->next;
        } else {
            greater->next = curr;
            greater = greater->next;
        }
        curr = curr->next;
    }
    
    // Cut off any remaining nodes to prevent cycles
    greater->next = NULL;
    
    // Connect the less partition to the greater partition
    less->next = greater_head.next;
    
    return less_head.next;
}
