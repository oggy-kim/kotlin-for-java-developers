package mastermind

data class Evaluation(val rightPosition: Int, val wrongPosition: Int)

fun evaluateGuess(secret: String, guess: String): Evaluation {
    var rightPosition = 0
    var wrongPosition = 0
    var check1 = BooleanArray(secret.length)
    var check2 = BooleanArray(secret.length)

    for (i in 0 until secret.length) {
        if (secret[i] == guess[i]) {
            rightPosition++
            check1[i] = true
            check2[i] = true
        }
    }
    for (j in 0 until secret.length) {
        for(k in 0 until secret.length) {
            if (guess[k] == secret[j] && !check1[j] && !check2[k] && k != j) {
                wrongPosition++
                check1[j] = true
                check2[k] = true
                continue
            }
        }
    }
    return Evaluation(rightPosition, wrongPosition)
}