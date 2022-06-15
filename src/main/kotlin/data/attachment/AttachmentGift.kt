package data.attachment

class AttachmentGift(
    override val type: AttachmentType = AttachmentType.GIFT,
    val attachmentData: Gift
) : AttachmentIntrface {
}

class Gift (
    val id: Int = 0,
    val thumb256: String = "LINK!",
    val thumb96: String = "LINK!",
    val thumb48: String = "LINK!",
) {}

