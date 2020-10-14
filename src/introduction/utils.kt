package introduction


fun getInputList(args: Array<String>) = when {  // Обработка ввода
    args.isNotEmpty() -> args.toList()
    else -> readLine()!!.split(" ")
}

fun getSortedInputList(args: Array<String>) = getInputList(args).sorted()  // Обработка ввода с сортировкой

fun formatList(result_list: List<String>) = result_list.joinToString(separator = "\n")  // Вывод массива

// Словарь; ключ - слово, значение - количество слов
fun getMapWordCount(list_words: List<String>): MutableMap<String, Int> {
    val mapWordCount: MutableMap<String, Int> = mutableMapOf()
    list_words.forEach { mapWordCount[it] = mapWordCount.getOrDefault(it, 0) + 1 }
    return mapWordCount
}

fun myPrintMap(map: MutableMap<String, Int>) = map.forEach { println("${it.key} ${it.value}") }  // Вывод словаря
