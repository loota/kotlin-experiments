fun main(args: Array<String>) {
    val chars = mutableMapOf<String, Int>()
    var charTemp: Int?
    for (string in args) {
        for (char in string) {
            charTemp = chars.get("$char")
            when (charTemp) {
                is Int -> chars.set("$char", charTemp + 1)
                else -> chars["$char"] = 1
            }
        }
    }
    for ((key, value) in chars) {
        println("$key = $value")
    }
}
