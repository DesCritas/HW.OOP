package data.attachment

class AttachmentAudio(
    override val type: AttachmentType = AttachmentType.AUDIO,
    val attachmentData: Audio
    ) : AttachmentIntrface {
}

class Audio (
    val id: Int = 0,
    val ownerId: Int = 1,
    val artist: String = "Unknown artist",
    val title: String = "Unknown title",
    val duration: Int = 10,
    val url: String = "none",
    val lyricsId: Int? = null,
    val albumId: Int? = null,
    val genreId: Int? = null,
    val date: Int = 100,
    val noSearch: Boolean? = true,
    val isHq: Boolean? = false
        ) {}

