/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        // list 가 정상적으로 순환된다면, true 아니면 false
        // LinkedList 의 특징상, 요소가 이미 존재했던 내용을 가르키면, cycle 될 수 밖에 없다.
        ListNode slow = head; // 한 칸씩 이동
        ListNode fast = head; // 두 칸씩 이동

        while( fast != null && fast.next != null /* fast 가 null 이 아니면 진행   */ ){

            slow = slow.next;
            fast = fast.next.next;

            if (  slow == fast /* 슬로우와 fast 가 만나면 종료  */ ){
                return true;
            }
        }
        return false;
    }

}
