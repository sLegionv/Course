package introduction


// Обработка ввода
fun getInputList(args: Array<String>) = when {
    args.isNotEmpty() -> args.toList()
    else -> readLine()!!.split(" ")
}

// Обработка ввода с сортировкой
fun getSortedInputList(args: Array<String>) = getInputList(args).sorted()

// Форматирование массива
fun formatList(resultList: List<String>) = resultList.joinToString(separator = "\n")

// Словарь; ключ - слово, значение - количество слов
fun getMapWordCount(listWords: List<String>) = listWords.groupingBy { it }.eachCount().toMutableMap()

// Вывод словаря
fun myPrintMap(map: Map<String, Int>) = map.forEach { println("${it.key} ${it.value}") }
