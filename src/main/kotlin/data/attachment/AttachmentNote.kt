package data.attachment

class AttachmentNote(
    override val type: AttachmentType = AttachmentType.NOTE,
    val attachmentData: Note
) : AttachmentIntrface {
}

class Note (
    val id: Int = 0,
    val ownerId: Int = 1,
    val title: String = "Unknown title",
    val text: String = "Long read",
    val date: Int = 100,
    val comments: Int = 0,
    val readComments: Int = 0,
    val viewUrl: String = "none",
    val privacyView: String = "none",
    val canComment: Boolean = true,
    val textWiki: String? = null,
) {}

