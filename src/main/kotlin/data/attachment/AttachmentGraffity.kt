package data.attachment

class AttachmentGraffity(
    override val type: AttachmentType = AttachmentType.GRAFFITY,
    val attachmentData: Graffity
) : AttachmentIntrface {
}

class Graffity (
    val id: Int = 0,
    val ownerId: Int = 1,
    val url: String = "none",
    val wigth: Int = 100,
    val height: Int = 100,
) {}

