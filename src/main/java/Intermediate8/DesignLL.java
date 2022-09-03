package Intermediate8;

import java.util.ArrayList;

public class DesignLL {

    //  Definition for singly-linked list.
      class ListNode {
          public int val;
          public ListNode next;
          ListNode(int x) { val = x; next = null; }
      }

    public class Solution {
        ListNode insertBeg(Integer v, ListNode head){//for zero index
            if(head==null) return new ListNode(v);
            ListNode newNode =  new ListNode(v);
            newNode.next = head;
            // head = newNode;
            // return head;
            return newNode;
        }
        ListNode insertEnd(Integer v, ListNode head){//insert at end
            if(head==null) return new ListNode(v);
            ListNode t = head;
            while(t.next != null) t = t.next;
            t.next = new ListNode(v);
            return head;
        }
        ListNode insertAtIndex(Integer v, Integer ind, ListNode head){
            if(head==null){
                if(ind==0) return new ListNode(v);
            }
            int c = ind;
            ListNode t = head;
            ListNode pt = t;
            while(c>0 && t!=null){
                pt = t;
                t = t.next;
                c--;
            }
            if(t!=null){
                ListNode newNode = new ListNode(v);
                newNode.next = t;
                pt.next = newNode;
            }
            return head;
        }
        ListNode deleteAtIndex(Integer ind, ListNode head){
            if(head==null) return head;
            if(ind==0) return head.next;
            ListNode t = head;
            ListNode pt = t;
            int c = ind-1;
            while(c>0 && t!=null){
                pt = t;
                t = t.next;
                c--;
            }
            if(t!=null){
                pt.next = t.next;
            }
            return head;
        }
        String printLL(ListNode head){
            StringBuilder s = new StringBuilder();
            while(head!=null){
                s.append(head.val+"->");
                head = head.next;
            }
            return s.toString();
        }

        public ListNode solve(ArrayList<ArrayList<Integer>> A) {
            ListNode head = null;
            for(ArrayList<Integer> o : A){
                Integer op = o.get(0);
                if(op==0) head = insertBeg(o.get(1),head);
                else if(op==1) head = insertEnd(o.get(1),head);
                else if(op==2) head = insertAtIndex(o.get(1),o.get(2),head);
                else if(op==3) head = deleteAtIndex(o.get(1),head);
                // System.out.println(o+" : "+printLL(head));
            }
            return head;
        }
    }

}
