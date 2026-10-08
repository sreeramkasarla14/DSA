# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def partition(self, head: ListNode | None, x: int) -> ListNode | None:
        arr=[]
        curr=head
        while curr!=None:
            arr.append(curr.val)
            curr=curr.next
        less=[]
        more=[]
        for i in arr:
            if i<x:
                less.append(i)
            else:
                more.append(i)
        less.extend(more)
        newhead=None
        temp=None
        for i in less:
            if newhead==None:
                newhead=ListNode(i)
                temp=newhead
            else:
                newnode=ListNode(i)
                temp.next=newnode
                temp=newnode
        return newhead