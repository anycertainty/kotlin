package foo

class TabIterator : Iterator<Any?> {
    override fun hasNext(): Boolean = false

    override fun next(): Any? {
        return null
    }
}

fun box(): String {
    return if (!TabIterator().hasNext()) return "OK" else "fail"
}
