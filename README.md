# kalk
> Chalk for kotlin, Terminal string styling done right


### Why?
Everyone loves a good looking terminal output! 

This is just an example
```kotlin
fun main(args: Array<String>) {
    println(kalk.red("red string", "amazing", kalk.blue("I'm blue")))
    println(kalk.yellow("woah!"))
    println(kalk.bgMagenta(kalk.greenBright("lol")))
    println("a bit from the last")
    println(kalk.reset("original"))
    println(kalk.bgBlackBright(kalk.whiteBright("white on black baby")))
    println(kalk.reset(kalk.bold(kalk.magenta("im", kalk.blue("fat")))))
    println()
    println(kalk.reset("You have", kalk.red("7"), "lives left"))
    println(kalk.reset("Today will be", kalk.blue("windy"), "and the temperature will be", kalk.whiteBright("21°C")))
}
```

Will produce

![screenshot](https://lensert.com/HJA9kH2Zb)

## Styles

### Modifiers

- `reset`
- `bold`
- `dim`
- `italic` *(not widely supported)*
- `underline`
- `inverse`
- `hidden`
- `strikethrough` *(not widely supported)*

### Colors

- `black`
- `red`
- `green`
- `yellow`
- `blue` *(on Windows the bright version is used since normal blue is illegible)*
- `magenta`
- `cyan`
- `white`
- `gray`

### Background colors

- `bgBlack`
- `bgRed`
- `bgGreen`
- `bgYellow`
- `bgBlue`
- `bgMagenta`
- `bgCyan`
- `bgWhite`
