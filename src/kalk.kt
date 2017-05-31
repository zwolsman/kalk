/**
 * Created by Marvin on 31-May-17.
 */

object kalk {
    fun reset(vararg ts: String): String = "\u001B[0m" + ts.joinToString(separator = " ") + "\u001B[0m"
    fun bold(vararg ts: String): String = "\u001B[1m" + ts.joinToString(separator = " ") + "\u001B[22m"
    fun dim(vararg ts: String): String = "\u001B[2m" + ts.joinToString(separator = " ") + "\u001B[22m"
    fun italic(vararg ts: String): String = "\u001B[3m" + ts.joinToString(separator = " ") + "\u001B[23m"
    fun underline(vararg ts: String): String = "\u001B[4m" + ts.joinToString(separator = " ") + "\u001B[24m"
    fun inverse(vararg ts: String): String = "\u001B[7m" + ts.joinToString(separator = " ") + "\u001B[27m"
    fun hidden(vararg ts: String): String = "\u001B[8m" + ts.joinToString(separator = " ") + "\u001B[28m"
    fun strikethrough(vararg ts: String): String = "\u001B[9m" + ts.joinToString(separator = " ") + "\u001B[2m"
    fun black(vararg ts: String): String = "\u001B[30m" + ts.joinToString(separator = " ") + "\u001B[39m"
    fun red(vararg ts: String): String = "\u001B[31m" + ts.joinToString(separator = " ") + "\u001B[39m"
    fun green(vararg ts: String): String = "\u001B[32m" + ts.joinToString(separator = " ") + "\u001B[39m"
    fun yellow(vararg ts: String): String = "\u001B[33m" + ts.joinToString(separator = " ") + "\u001B[39m"
    fun blue(vararg ts: String): String = "\u001B[34m" + ts.joinToString(separator = " ") + "\u001B[39m"
    fun magenta(vararg ts: String): String = "\u001B[35m" + ts.joinToString(separator = " ") + "\u001B[39m"
    fun cyan(vararg ts: String): String = "\u001B[36m" + ts.joinToString(separator = " ") + "\u001B[39m"
    fun white(vararg ts: String): String = "\u001B[37m" + ts.joinToString(separator = " ") + "\u001B[39m"
    fun gray(vararg ts: String): String = "\u001B[90m" + ts.joinToString(separator = " ") + "\u001B[39m"
    fun redBright(vararg ts: String): String = "\u001B[91m" + ts.joinToString(separator = " ") + "\u001B[39m"
    fun greenBright(vararg ts: String): String = "\u001B[92m" + ts.joinToString(separator = " ") + "\u001B[39m"
    fun yellowBright(vararg ts: String): String = "\u001B[93m" + ts.joinToString(separator = " ") + "\u001B[39m"
    fun blueBright(vararg ts: String): String = "\u001B[94m" + ts.joinToString(separator = " ") + "\u001B[39m"
    fun magentaBright(vararg ts: String): String = "\u001B[95m" + ts.joinToString(separator = " ") + "\u001B[39m"
    fun cyanBright(vararg ts: String): String = "\u001B[96m" + ts.joinToString(separator = " ") + "\u001B[39m"
    fun whiteBright(vararg ts: String): String = "\u001B[97m" + ts.joinToString(separator = " ") + "\u001B[3m"
    fun bgBlack(vararg ts: String): String = "\u001B[40m" + ts.joinToString(separator = " ") + "\u001B[49m"
    fun bgRed(vararg ts: String): String = "\u001B[41m" + ts.joinToString(separator = " ") + "\u001B[49m"
    fun bgGreen(vararg ts: String): String = "\u001B[42m" + ts.joinToString(separator = " ") + "\u001B[49m"
    fun bgYellow(vararg ts: String): String = "\u001B[43m" + ts.joinToString(separator = " ") + "\u001B[49m"
    fun bgBlue(vararg ts: String): String = "\u001B[44m" + ts.joinToString(separator = " ") + "\u001B[49m"
    fun bgMagenta(vararg ts: String): String = "\u001B[45m" + ts.joinToString(separator = " ") + "\u001B[49m"
    fun bgCyan(vararg ts: String): String = "\u001B[46m" + ts.joinToString(separator = " ") + "\u001B[49m"
    fun bgWhite(vararg ts: String): String = "\u001B[47m" + ts.joinToString(separator = " ") + "\u001B[49m"
    fun bgBlackBright(vararg ts: String): String = "\u001B[100m" + ts.joinToString(separator = " ") + "\u001B[49m"
    fun bgRedBright(vararg ts: String): String = "\u001B[101m" + ts.joinToString(separator = " ") + "\u001B[49m"
    fun bgGreenBright(vararg ts: String): String = "\u001B[102m" + ts.joinToString(separator = " ") + "\u001B[49m"
    fun bgYellowBright(vararg ts: String): String = "\u001B[103m" + ts.joinToString(separator = " ") + "\u001B[49m"
    fun bgBlueBright(vararg ts: String): String = "\u001B[104m" + ts.joinToString(separator = " ") + "\u001B[49m"
    fun bgMagentaBright(vararg ts: String): String = "\u001B[105m" + ts.joinToString(separator = " ") + "\u001B[49m"
    fun bgCyanBright(vararg ts: String): String = "\u001B[106m" + ts.joinToString(separator = " ") + "\u001B[49m"
    fun bgWhiteBright(vararg ts: String): String = "\u001B[107m" + ts.joinToString(separator = " ") + "\u001B[4m"
}

fun main(args: Array<String>) {
    println(kalk.red("red string", "amazing", kalk.blue("does this work?")))
    println(kalk.yellow("woah!"))

    println(kalk.bgMagenta(kalk.greenBright("lol")))
    println("a bit from the last")
    println(kalk.reset("original"))
    println(kalk.bgBlackBright(kalk.whiteBright("white on black bby")))
    println(kalk.reset(kalk.bold(kalk.magenta("im", kalk.blue("fat")))))
}