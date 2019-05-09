package jun.kotlin.library

class Library {

    var registry: BookRegistry = BookRegistry()

    fun register(book: Book) {
        println("책을 추가했습니다.")
        registry.addBook(book)
    }

    fun borrowBook(user: User, bookCode: String): Book {
        val book = registry.getBorrowValidBook(bookCode)
        if (book == null) {
            println("책이 존재하지 않습니다.")
            throw RuntimeException()
        }

        return book;
    }


}