package introduction


fun getInputList(): List<String> {
    return readLine()!!.split(" ")
}

fun getCroppedInputList(): List<String> {
    return getInputList().drop(1)
}

fun getCroppedSortedInputList(): List<String> {
    return getCroppedInputList().sorted()
}

fun formatList(result_list:List<String>): String {
    return result_list.joinToString(separator = "\n")
}

fun getMapKeyCount(list_words: List<String>): MutableMap<String, Int> {
    val map: MutableMap<String, Int> = mutableMapOf()
    list_words.forEach{map[it] =  map.getOrDefault(it, 0) + 1}
    return map
}

fun printMap(map: MutableMap<String, Int>) {
    map.forEach{println("${it.key} ${it.value}")}
}