package net.typeblog.fishroomandroid.model
import nz.bradcampbell.paperparcel.*
import com.fasterxml.jackson.annotation.JsonIgnoreProperties

/**
 * Created by peter on 6/14/16.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@PaperParcel
data class Message(val botmsg: Boolean = false, val channel: String? = "", val content: String? = "", val date: String? = "",
                   val mtype: String? = "", val media_url: String? = "", val room: String? = "",
                   val sender: String? = "", val time: String? = ""
) : PaperParcelable {
    companion object {
        @JvmField val CREATOR = PaperParcelable.Creator<Message>(Message::class.java)
    }
}