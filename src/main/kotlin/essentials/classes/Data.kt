
package essentials.classes.data

import java.util.*

fun main() {
    val user = User("John", "Doe");
    println("User name: ${user.fullName}")
}

interface Named {
    val name: String
    val fullName: String
}

class User (
    override val name: String,
    val surname: String,
) : Named {
    override val fullName : String
        get() = "$name $surname"
}