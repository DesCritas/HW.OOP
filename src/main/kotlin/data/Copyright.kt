package data

class Copyright (
    val id: Int,
    val link: String,
    val name: String,
    val type: String
    ) {
    override fun toString(): String{
        return "id: $id, link: $link"
    }

}
