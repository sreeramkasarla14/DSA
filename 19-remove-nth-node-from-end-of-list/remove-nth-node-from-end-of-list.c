/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* removeNthFromEnd(struct ListNode* head, int n) {
    if(head==NULL)return NULL;
    if(head->next==NULL){
        free(head);
        return NULL;
    }
    struct ListNode* temp=head;
    int c=0;
    while(temp!=NULL){
        temp=temp->next;
        c++;
    }
    int k=c-n;
    if (k==0){
        struct ListNode* h=head->next;
        free(head);
        return h;
    }
    temp=head;
    struct ListNode* prev=head;
    while(temp!=NULL && k!=0){
        prev=temp;
        temp=temp->next;
        k--;

    }
    struct ListNode* t=temp;
    prev->next=temp->next;
    free(t);
    return head;


    
}