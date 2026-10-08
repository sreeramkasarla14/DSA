# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def getIntersectionNode(self, headA: ListNode, headB: ListNode) -> Optional[ListNode]:
        l1=0
        l2=0
        temp=headA
        while temp!=None:
            l1+=1
            temp=temp.next
        temp=headB
        while temp!=None:
            l2+=1
            temp=temp.next
        while l1>l2:
            headA=headA.next
            l1-=1
        while l2>l1:
            headB=headB.next
            l2-=1
        while headA!=headB:
            headA=headA.next
            headB=headB.next
        return headB