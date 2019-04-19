package jun.kotlin.collection

object LinkedList {

    var head: Node? = null
    var tail: Node? = null
    var size = 0

    fun size ():Int {
        return size
    }

    fun add (n: Node) {
        if (head == null && tail == null) {
            head = n
            tail = n
        }

        val node = head
        head = n
        node?.next = head
        head?.prev = node
    }

    fun get(n: Int): Node? {
        return null
    }

    fun remove() {

    }

}

object Node {

    var prev:Node? = null
    var next:Node? = null

}