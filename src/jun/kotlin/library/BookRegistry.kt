package jun.kotlin.library

class BookRegistry {

    var bookMap: HashMap<String, Book> = HashMap()

    fun addBook(book: Book) {
        bookMap.put(book.id, book)
    }

    fun removeBook(id: String) {
        bookMap.remove(id)
    }

    fun getBook(id: String) {
        bookMap.get(id)
    }

    fun updateBook(book: Book) {
        bookMap.putIfAbsent(book.id, book)
    }

}