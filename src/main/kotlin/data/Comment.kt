package data

import data.attachment.*

data class Comment (
    val id: Int = 0,
    val fromId: Int = 1,
    val date: Int = 200,
    val text: String = "An empty string",
    val donut: Donut = Donut(false, 0, Placeholder("сообщение не проплачено!"), true, EditMode.ALL),
    val replyToUser: Int = 2,
    val replyToComment: Int = 3,
    val attachments: Array<AttachmentIntrface>? = arrayOf(
        AttachmentAudio(AttachmentType.AUDIO, Audio()),
        AttachmentGraffity(AttachmentType.GRAFFITY, Graffity()),
        AttachmentPhoto(AttachmentType.PHOTO, Photo()),
        AttachmentGraffity(AttachmentType.GRAFFITY, Graffity()),
        AttachmentNote(AttachmentType.NOTE, Note())
    ),
    val parentsStack: Array<Int> = arrayOf(0, 1, 3),
    val thread: ThreadComment = ThreadComment()

        ) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Comment

        if (id != other.id) return false
        if (fromId != other.fromId) return false
        if (date != other.date) return false
        if (text != other.text) return false
        if (donut != other.donut) return false
        if (replyToUser != other.replyToUser) return false
        if (replyToComment != other.replyToComment) return false
        if (attachments != null) {
            if (other.attachments == null) return false
            if (!attachments.contentEquals(other.attachments)) return false
        } else if (other.attachments != null) return false
        if (!parentsStack.contentEquals(other.parentsStack)) return false
        if (thread != other.thread) return false

        return true
    }

    override fun hashCode(): Int {
        var result = id
        result = 31 * result + fromId
        result = 31 * result + date
        result = 31 * result + text.hashCode()
        result = 31 * result + donut.hashCode()
        result = 31 * result + replyToUser
        result = 31 * result + replyToComment
        result = 31 * result + (attachments?.contentHashCode() ?: 0)
        result = 31 * result + parentsStack.contentHashCode()
        result = 31 * result + thread.hashCode()
        return result
    }

    override fun toString(): String {
        return "id=$id, " +
                "fromId=$fromId, " +
                "date=$date, " +
                "text=$text, " +
                "donut=$donut, " +
                "replyToUser=$replyToUser, " +
                "replyToComment=$replyToComment, " +
                "attachments=$attachments, " +
                "parentsStack=$parentsStack, " +
                "thread=$thread"
    }
}

class ThreadComment(
    val count: Int = 0,
    val items: Array<Comment>? = emptyArray(),
    val canPost: Boolean = false,
    val showReplyButton: Boolean = false,
    val groupsCanPost: Boolean = false
) {

}
