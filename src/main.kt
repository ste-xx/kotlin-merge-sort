fun main(args: Array<String>) {
    println("Hello, world!")
}

public fun sort(list: List<Int>): List<Int> {
    if (list.size <= 1) {
        return list
    }
    val left = list.subList(0,list.size/2)
    val right = if(list.size/2 > 0) list.subList((list.size/2),list.size) else listOf()

    return merge(sort(left).toMutableList(),  sort(right).toMutableList())
}


private fun merge(left:MutableList<Int>, right:MutableList<Int>):List<Int>{

    val result = mutableListOf<Int>()

    while(left.isNotEmpty() and right.isNotEmpty()){

        if(left[0] <= right[0]){
            result.add(left[0])
            left.removeAt(0)
        }else{
            result.add(right[0])
            right.removeAt(0)
        }
    }

    while(left.isNotEmpty()){
        result.add(left[0])
        left.removeAt(0)
    }


    while(right.isNotEmpty()){
        result.add(right[0])
        right.removeAt(0)
    }


    return result
}