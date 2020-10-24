package introduction

fun main(args: Array<String>) {
    val words: List<String> = getSortedInputList(args)
    val map: Map<String, Int> = getMapWordCount(words)
    myPrintMap(map.toSortedMap(compareBy({ -map.getValue(it) }, { it })))
}
