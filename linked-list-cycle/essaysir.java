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
        Set<ListNode> nodes = new HashSet<>();
        ListNode cur = head;

        while ( cur != null /* 아직 끝이 아닌 동안 */ ) {
            if ( nodes.contains(cur)/* 이미 방문한 노드라면 */ ) {
                return true;
            }
            nodes.add(cur);
            cur = cur.next;
        }

        return false;
    }

}
