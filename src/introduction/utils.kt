package introduction


fun getInputList(args: Array<String>) = when {
    args.isNotEmpty() -> args.toList()
    else -> readLine()!!.split(" ")
}

fun getSortedInputList(args: Array<String>): List<String> {
    return getInputList(args).sorted()
}

fun formatList(result_list: List<String>): String {
    return result_list.joinToString(separator = "\n")
}

fun getMapKeyCount(list_words: List<String>): MutableMap<String, Int> {
    val map: MutableMap<String, Int> = mutableMapOf()
    list_words.forEach { map[it] = map.getOrDefault(it, 0) + 1 }
    return map
}

fun myPrintMap(map: MutableMap<String, Int>) {
    map.forEach { println("${it.key} ${it.value}") }
}