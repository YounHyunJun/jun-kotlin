package jun.kotlin.library

class BookRegistry {

    var bookMap: HashMap<String, List<Book>> = HashMap()

    fun addBook(book: Book) {
        val books: List<Book>? = bookMap[book.code]

        if (books == null) {
            bookMap.put(book.code, ArrayList())
        }

        books?.plus(book)
    }

    fun removeBook(id: String) {
        val books: List<Book>? = bookMap[id]

        if (books?.isNotEmpty()!!) {
            bookMap.remove(id)
        }
    }

    fun getBooks(code: String): List<Book>? {
        return this.bookMap[code]
    }

    fun getBook(book: Book): Book? {
        val books: List<Book>? = this.bookMap[book.code]

        for (bookEntry: Book in books!!) {
            if (bookEntry.id.equals(book.id)) {
                return bookEntry
            }
        }

        return null
    }

    fun getBorrowValidBook(code: String): Book? {
        val books = getBooks(code)

        if (books != null) {
            for (bookEntry in books) {
                if (! bookEntry.borrowred) {
                    return bookEntry
                }
            }
        }

        return null
    }

    fun updateBook(book: Book) {
        val selectedBook = this.getBook(book)

        if (selectedBook != null) {
            selectedBook.code = book.code
            selectedBook.name = book.name
        }
    }

}