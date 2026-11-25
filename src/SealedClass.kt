/*
interface Error

class FileError(val fileName: String): Error

class DatabaseError(val dbmsType: DbmsType): Error

class RedisError(val host: String): Error

enum class DbmsType {
    MYSQL, MARIADB, ORACLE
}

fun getErrorMessage(error: Error) = when (error) {
    is FileError -> "Error is occurred at : ${error.fileName}"
    is DatabaseError -> "Error on DBMS : ${error.dbmsType}"
    // RedisError에 대한 처리를 놓칠 가능성이 있다. -> 그래서 sealed class가 중요!
    else -> throw IllegalArgumentException("Unknown Type Error")
}
*/
sealed class Error

class FileError(val fileName: String): Error()

class DatabaseError(val dbmsType: DbmsType): Error()

class RedisError(val host: String): Error()

enum class DbmsType {
    MYSQL, MARIADB, ORACLE
}

fun getErrorMessage(error: Error) = when (error) {
    is FileError -> "Error is occurred at : ${error.fileName}"
    is DatabaseError -> "Error on DBMS : ${error.dbmsType}"
    // RedisError에 대한 처리를 놓치면 컴파일 에러 발생
    is RedisError -> "Error on Redis : ${error.host}"
}
