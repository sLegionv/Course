package introduction


fun getInputList(args: Array<String>) = when {  // Обработка ввода
    args.isNotEmpty() -> args.toList()
    else -> readLine()!!.split(" ")
}

fun getSortedInputList(args: Array<String>) = getInputList(args).sorted()  // Обработка ввода с сортировкой

fun formatList(resultList: List<String>) = resultList.joinToString(separator = "\n")  // Вывод массива

// Словарь; ключ - слово, значение - количество слов
fun getMapWordCount(listWords: List<String>) = listWords.groupingBy { it }.eachCount().toMutableMap()

fun myPrintMap(map: Map<String, Int>) = map.forEach { println("${it.key} ${it.value}") }  // Вывод словаря
