import react.*
import react.dom.html.ReactHTML.p


external interface VideoListProps : Props {
    var videos: List<Video>
    var selectedVideo: Video?
    var onSelectVideo: (Video) -> Unit

}
val VideoList = FC<VideoListProps> {props ->
    for (video in props.videos) {
        p {
            key = video.id.toString()
            onClick = {
                console.log("Clicked $video!")
                props.onSelectVideo(video)
            }
            +"${if (props.selectedVideo == video)  "▶ " else ""}${video.speaker}: ${video.title}"
        }
    }
}