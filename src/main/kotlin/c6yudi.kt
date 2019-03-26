import io.javalin.Javalin
import controllers.IndexController

fun main (args: Array<String>) {
    val app = Javalin.create()
    app.enableStaticFiles("/public")
    app.start(3000)

    app.get("/" ) {
        ctx -> ctx.redirect(IndexController.index())
    }
}