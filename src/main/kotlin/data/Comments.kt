package data

class Comments (
    var count: Int,
    var canPost: Boolean,
    var groupCanPost: Boolean,
    var canClose: Boolean,
    var canOpen: Boolean
    ) {

    override fun toString(): String{
        return "count: $count"
    }

}
