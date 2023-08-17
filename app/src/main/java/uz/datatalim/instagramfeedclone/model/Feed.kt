package uz.datatalim.instagramfeedclone.model

data class Feed(
    val userImage: String,
    val userName: String,
    val where: String,
    val postImage: String,
    val likesCount: Int,
    val stories:ArrayList<Story>?=null,
)
