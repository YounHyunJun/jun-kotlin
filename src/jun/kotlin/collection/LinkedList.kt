package jun.kotlin.collection

class LinkedList {

    private var head: Node? = null
    private var tail: Node? = null
    private var size = 0

    fun size ():Int {
        return size
    }

    fun add (node: Node) {
        if (isEmpty()) {
            head = node
            tail = node
        } else {
            val temp = head
            head = node
            head?.next = temp
            temp?.prev = node
        }
    }

    private fun isEmpty():Boolean {
        if (size == 0 || (head == null && tail == null)) {
            return true
        }
        return false
    }

    fun get(n: Int): Node? {

        if (isEmpty()) {
            return null;
        }

        var cur = head;
        var i = 0;

        while (cur != null || i <= n) {
            if (n == i) {
                return cur;
            }

            i++;
            cur = head?.next;
        }

        return null
    }

    fun remove(n: Int): Node? {
        if (isEmpty()) {
            return null;
        }

        val cur = head;
        val i = 0;

        while (cur != null || i <= n) {
            if (n == i) {
                if (cur?.next == null) { // tail
                    cur?.prev?.next = null;
                    tail = cur?.prev;
                    return cur
                } else {
                    cur.prev?.next = cur.next;
                    cur.next?.prev = cur.prev;
                    return cur;
                }
            }
        }

        return null
    }

}

object Node {

    var prev:Node? = null
    var next:Node? = null

}