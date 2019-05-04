package jun.kotlin.library

class Library {

    var registry: BookRegistry = BookRegistry()

    fun register(book: Book) {
        println("책을 추가했습니다.")
        registry.addBook(book)
    }

    fun borrowBook(user: User, bookCode: String) {
        val borrowValidBook = registry.getBorrowValidBook(bookCode)


    }


}