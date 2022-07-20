import kotlinx.browser.document
import react.*
import react.dom.render
import csstype.Position
import csstype.px
import emotion.react.css
import react.dom.client.createRoot
import react.dom.html.ReactHTML.h1
import react.dom.html.ReactHTML.h3
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.p
import react.dom.html.ReactHTML.img

fun main() {
    val container = document.getElementById("root") ?: error("Couldn't find root container!")
    container.setAttribute("style", "background-color: beige; min-height: 100vh; margin: 0")

    render(App.create(), container)
}