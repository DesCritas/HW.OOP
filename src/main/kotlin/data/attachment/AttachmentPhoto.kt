package data.attachment

class AttachmentPhoto(
    override val type: AttachmentType = AttachmentType.PHOTO,
    val attachmentData: Photo
) : AttachmentIntrface {
}

class Photo (
    val id: Int = 0,
    val albumId: Int = 1,
    val ownerId: Int = 2,
    val userId: Int = 3,
    val text: String = "food photo",
    val sizes: ArrayList<PhotoSizes>? = null,
    val url: String = "none",
    val width: Int = 100,
    val height: Int = 100,
    val date: Int = 100
) {}

class PhotoSizes(
    val type: Char = 'z',
    val url: String = "LINK!",
    val width: Int = 100,
    val height: Int = 100
){

}

