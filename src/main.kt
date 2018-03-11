fun main(args: Array<String>) {
    println("Hello, world!")
}

fun sort(list: List<Int>): List<Int> {
    if (list.size <= 1) {
        return list
    }
    val left = list.subList(0, list.size / 2)
    val right = if (list.size / 2 > 0) list.subList((list.size / 2), list.size) else listOf()


    return merge(sort(left).toMutableList(), sort(right).toMutableList())
}


private fun merge(left: MutableList<Int>, right: MutableList<Int>): List<Int> {

    val result = mutableListOf<Int>()

     while (left.isNotEmpty() or right.isNotEmpty()) {
        result += when {
            left.isNotEmpty() and right.isNotEmpty() -> {
                if (left[0] <= right[0]) {
                    left.removeAt(0)
                } else {
                    right.removeAt(0)
                }
            }

            left.isNotEmpty() -> {
                left.removeAt(0)
            }

            right.isNotEmpty() -> {
                right.removeAt(0)
            }

            else -> throw IllegalStateException()
        }
    }


    return result
}