package app

import dev.fritz2.core.render

val SHADOWS = listOf(
    "shadow-sm",
    "shadow-md",
    "shadow-lg",
    "shadow-xl",
    "shadow-2xl",
    "shadow-inner",
    "shadow-none"
)

fun main() {

    render {
        // card
        div("max-w-2xl mx-auto sm:px-6 lg:px-8 py-12 bg-slate-300") {
            div {
                SHADOWS.forEach {
                    div("$it shadow w-16 h-16 mb-5 bg-slate-100") { }
                }
            }
        }
    }
}