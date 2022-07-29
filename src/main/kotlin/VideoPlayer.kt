import csstype.*
import react.*
import emotion.react.css
import react.dom.html.ReactHTML.button
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.h3
import react.dom.html.ReactHTML.img

external interface VideoPlayerProps : Props {
    var video: Video
    var onWatchedButtonPressed: (Video) -> Unit
    var unwatchedVideo: Boolean
}

val YoutubeVideoIdRegex = Regex("(.*?)(^|/|v=)([a-z0-9_-]{11})(.*)?")

val VideoPlayer = FC<VideoPlayerProps> { props ->
    var gotVideoId = YoutubeVideoIdRegex.find(props.video.videoUrl)?.value

    div {
        css {
            position = Position.absolute
            top = 10.px
            right = 10.px
        }
        EmailShareButton {
            url = props.video.videoUrl
            EmailIcon {
                size = 32
                round = true
            }
        }
        TelegramShareButton {
            url = props.video.videoUrl
            TelegramIcon {
                size = 32
                round = true
            }
        }
        h3 {
            +"${props.video.speaker}: ${props.video.title}"
        }
        button {
            css {
                display = Display.block
                backgroundColor = if (props.unwatchedVideo) NamedColor.lightgreen else NamedColor.darksalmon
            }
            onClick = {
                props.onWatchedButtonPressed(props.video)
            }
            if (props.unwatchedVideo) {
                +"Mark as watched"
            } else {
                +"Mark as unwatched"
            }
        }
        ReactYoutube {
            videoId = gotVideoId
        }

    }
}