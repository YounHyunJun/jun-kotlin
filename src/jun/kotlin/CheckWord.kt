package jun.kotlin

class WordChecker {

    fun getWordSize(str: String): Int {
        val split = str.split(" ")
        return split.size
    }

    fun findWord(text:String, search: String): Boolean {
        val words = text.split(" ")
        for (word in words) {
            if (search.equals(word)) {
                return true
            }
        }
        return false
    }

}

fun main() {

    val text = readLine()!!
    println("You entered: $text")
    val wordChecker = WordChecker()

    println(wordChecker.getWordSize(text))
    println(wordChecker.findWord(text, "seoul"))
    println(wordChecker.findWord(text, "seo"))

}