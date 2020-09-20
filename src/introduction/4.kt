package introduction

fun main(args: Array<String>) {
    val words: List<String> = getSortedInputList(args)
    val map: MutableMap<String, Int> = getMapKeyCount(words)
    printMap(map)
}