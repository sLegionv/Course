package introduction

fun main(args: Array<String>) {
    val words: List<String> = getCroppedSortedInputList()
    val map: MutableMap<String, Int> = getMapKeyCount(words)
    printMap(map.toSortedMap(compareBy({ -map[it]!! }, { it })))
}