@file:JsModule("react-youtube-lite")
@file:JsNonModule

import csstype.HtmlAttributes
import react.*

@JsName("ReactYouTubeLite")
external val ReactYtPlayer: ComponentClass<ReactPlayerProps>

external interface ReactPlayerProps : Props {
    var url: String
    var iframeProps: HtmlAttributes
}