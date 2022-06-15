package data

import data.attachment.*

class Comment (
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
}

class ThreadComment(
    val count: Int = 0,
    val items: Array<Comment>? = emptyArray(),
    val canPost: Boolean = false,
    val showReplyButton: Boolean = false,
    val groupsCanPost: Boolean = false
) {

}
