package data

class Donut(
    var isDonut: Boolean,
    var paidDuration: Int,
    var placeholder: Placeholder,
    var canPublishFreeCopy: Boolean,
    var editMode: EditMode
) {
    override fun toString(): String{
        return "Доступ: $placeholder"
    }

}
