package com.so.revelation.glua.core.log

/**
 * 定长环形缓冲。写满后覆盖最旧的记录，避免长期运行导致内存无限增长。
 *
 * 非线程安全，调用方需自行加锁（见 [LogBus]）。
 */
class RingBuffer<T>(val capacity: Int) {

    init {
        require(capacity > 0) { "capacity must be positive, was $capacity" }
    }

    private val items = arrayOfNulls<Any?>(capacity)
    private var head = 0
    private var size = 0

    fun add(item: T) {
        items[head] = item
        head = (head + 1) % capacity
        if (size < capacity) size++
    }

    fun snapshot(): List<T> {
        if (size == 0) return emptyList()
        val out = ArrayList<T>(size)
        val start = if (size < capacity) 0 else head
        for (i in 0 until size) {
            @Suppress("UNCHECKED_CAST")
            out.add(items[(start + i) % capacity] as T)
        }
        return out
    }

    fun clear() {
        items.fill(null)
        head = 0
        size = 0
    }
}
