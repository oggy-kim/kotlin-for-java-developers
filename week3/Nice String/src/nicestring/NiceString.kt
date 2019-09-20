package nicestring

fun String.isNice(): Boolean {
    val excludedSubstring = !this.contains("bu") && !this.contains("ba") && !this.contains("be") // no.1 condition
    val vowels = listOf('a', 'e', 'i', 'o', 'u') // no.2 condition
    var containsDoubleLetter = false
    this.forEachIndexed {index, element ->
        if(index != 0) {
            if(this.get(index - 1) == element) {
                containsDoubleLetter = true
            }
        }
    }
    val containsThreeVowels = this.filter {it -> vowels.contains(it)}.count() >= 3 // no. 3 condition

    return listOf(excludedSubstring, containsDoubleLetter, containsThreeVowels).filter {it}.count() >= 2
}