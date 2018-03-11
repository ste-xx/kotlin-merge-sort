fun sort2(list: MutableList<Int>): List<Int> {
    if (list.size <= 1) {
        return list
    }
    return msort(list, 0, list.size - 1)
}

private fun msort(list: MutableList<Int>, startIdx: Int, endIdx: Int):List<Int>{
    //System.out.println("start: ${startIdx} end: ${endIdx} diff: ${endIdx - startIdx + 1}")

    if (endIdx - startIdx + 1 == 1) {
        return list
    }
    val middleIdx = Math.floor((startIdx + endIdx) / 2.0).toInt()//(startIdx + endIdx)/2
    msort(list, startIdx, middleIdx)
    msort(list, middleIdx + 1, endIdx)

    val left = list.subList(startIdx, middleIdx + 1).toList()
    val right = list.subList(middleIdx + 1, endIdx + 1).toList()

    merge(list, startIdx..endIdx, left, right)
    return list
}

private fun merge(list: MutableList<Int>, range:IntRange, left: List<Int>, right: List<Int>) {

    var i = 0
    var j = 0

    for (k in range) {
        list[k] = when {
            (i <= left.size - 1) && ((j >= right.size) || (left[i] <= right[j])) -> {
                left[i++]
            }
            else ->{
                right[j++]
            }
        }
    }
}