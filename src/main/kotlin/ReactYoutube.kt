@file:JsModule("react-youtube")
@file:JsNonModule

import react.*

@JsName("default")
external val ReactYoutube: ComponentClass<ReactYoutubeProps>

external interface ReactYoutubeProps : Props {
    var videoId: String?
    var opts: Any
}