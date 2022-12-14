package wordsvirtuoso
import java.io.File
import kotlin.math.roundToLong

const val CHARLIMIT = 5

    fun fileValidation(a: String, b: String): Boolean {
        return when {
            !File(a).exists() -> {
                println("Error: The words file $a doesn't exist.")
                kotlin.system.exitProcess(-1)
                false
            }
            !File(b).exists() -> {
                println("Error: The candidate words file $b doesn't exist.")
                kotlin.system.exitProcess(-1)
                false
            }
            else -> true
        }
    }
    fun isWordValid(guessedWord: String, wordList: List<String>): Boolean {
        val nonEnglishRegex = Regex("""[^a-zA-Z]""")
        val duplicates = Regex("""(.)\1""")

        return when {
            guessedWord.length != CHARLIMIT -> {
                println("The input isn't a 5-letter word.")
                false
            }
            nonEnglishRegex.containsMatchIn(guessedWord) -> {
                println("One or more letters of the input aren't valid.")
                false
            }
            duplicates.containsMatchIn(guessedWord) -> {
                println("The input has duplicate letters.")
                false
            }
            !wordList.contains(guessedWord) -> {
                println("The input word isn't included in my words list.")
                false
            }
            else -> return true
        }
    }
    fun wordListValidation(list: List<String>): Int {
        val nonEnglishRegex = Regex("""[^a-zA-Z]""")
        val duplicates = Regex("""(.)\1""")

        var invalidCount = 0

        for (word in list) {
            if (word.length != CHARLIMIT) {
                invalidCount++
            } else if (nonEnglishRegex.containsMatchIn(word)) {
                invalidCount++
            } else if (duplicates.containsMatchIn(word)) {
                invalidCount++
            }
        }
        return invalidCount
    }
    fun checkInput(input: String, randomWord: String,candidateList: List<String>, wordsList: List<String>, tries: Int, time: Long, clues: MutableList<String>,wrongChars: MutableList<Char>) {
        if (input == "exit") {
            println("The game is over.")
            kotlin.system.exitProcess(-1)
        } else if (input == randomWord) {
            var end = System.currentTimeMillis()
            val totalSecs = (end - time) * 0.001
            if (tries == 1) {
                clues.add(printClueString(input,randomWord))
                clues.forEach {clue ->
                    println(clue) }
                println("Correct!")
                println("Amazing luck! The solution was found at once.")
            } else if (tries > 1) {
                clues.add(printClueString(input,randomWord))
                clues.forEach { clue ->
                    println(clue)
                }
                println("Correct!")
                println("The solution was found after $tries tries in ${totalSecs.roundToLong()} seconds.")
            }
            kotlin.system.exitProcess(-1)

        } else if (!isWordValid(input, wordsList)) {
            if (tries == 1) {
                startGame(candidateList,wordsList,randomWord,tries,time)
            } else if (tries > 1) {
                startGame(candidateList, wordsList,randomWord,tries,time,clues,wrongChars)
            }
        } else {
                clues.add(printClueString(input,randomWord))
                clues.forEach {clue ->
                    println(clue) }
            input.forEach { char ->
                if (!randomWord.contains(char)) {
                    wrongChars.add(char)
                }
            }
            println("\u001B[48:5:14m${wrongChars.toMutableSet().sorted().joinToString("").uppercase()}\u001B[0m")
            startGame(candidateList,wordsList,randomWord,tries,time,clues,wrongChars)
        }
}
    fun printClueString(input: String, randomWord: String): String {
        var clue = ""
        input.uppercase().toCharArray()
        randomWord.uppercase().toCharArray()
        for (i in input.indices) {
            if (input[i] == randomWord[i]) {
                clue += "\u001B[48:5:10m${input[i].uppercase()}\u001B[0m"
            } else if (randomWord.contains(input[i])) {
               clue += "\u001B[48:5:11m${input[i].uppercase()}\u001B[0m"
            } else {
               clue +=  "\u001B[48:5:7m${input[i].uppercase()}\u001B[0m"
            }
        }
        return clue
    }
    fun startGame(candidateList: List<String>, wordList: List<String>, randomWord: String = "",tries: Int, time: Long, clueList: MutableList<String> = mutableListOf(), wrongChars: MutableList<Char> = mutableListOf()) {
        var numberOfTries = tries
        if (randomWord != "" ) {
            var newRandomWord = randomWord
            //println(newRandomWord)
            println("Input a 5-letter word:")
            var guessedWord = readln().lowercase()
            numberOfTries++
            checkInput(guessedWord, newRandomWord, candidateList, wordList, numberOfTries, time, clueList, wrongChars)
        } else {
            var newRandomWord = candidateList.random()
            //println(newRandomWord)
            println("Input a 5-letter word:")
            var guessedWord = readln().lowercase()
            var start = System.currentTimeMillis()
            numberOfTries = 1
            checkInput(guessedWord, newRandomWord, candidateList, wordList, numberOfTries, start, clueList, wrongChars)
        }
    }
    fun missingWordCounter(wordList: List<String>, candidateList: List<String>): Int {
        var missingWordCount = 0
        for (candidate in candidateList) {
            if (!wordList.contains(candidate)) {
                missingWordCount++
            }
        }
        return missingWordCount
    }

fun main(args: Array<String>) {

    //take file names from passed arguments
    val fileName = args.first()
    val candidateFileName = args[args.lastIndex]
    //val fileName = "C://dev//Personal ProjectsTutorials//files//words.txt"
    //val candidateFileName = "C:/dev/Personal ProjectsTutorials/files/candidates.txt"

    val enoughArguments = args.size == 2

    //check if correct number of args passed

    if (!enoughArguments) {
    println("Error: Wrong number of arguments.")
    kotlin.system.exitProcess(-1) }

    //check whether files exist
    fileValidation(fileName, candidateFileName)

    //create file objects with given filenames
    val file = File(fileName)
    val candidateFile = File(candidateFileName)

    //create lists from the strings within the files
    val list1 = file.useLines { it.toMutableList() }
    var lines = list1.map { it.lowercase() }
    val list2 = candidateFile.useLines { it.toMutableList() }
    var candidates = list2.map { it.lowercase() }

    //check for invalid words or words missing from candidate file
    val invalidWords = wordListValidation(lines)
    val invalidCandidateWords = wordListValidation(candidates)
    var missingWords = missingWordCounter(lines, candidates)

    when {
        invalidWords != 0 -> {
            println("Error: $invalidWords invalid words were found in the $fileName file.")
            kotlin.system.exitProcess(-1)
        }

        invalidCandidateWords != 0 -> {
            println("Error: $invalidCandidateWords invalid words were found in the $candidateFileName file.")
            kotlin.system.exitProcess(-1)
        }
        missingWords != 0 -> {
            println("Error: $missingWords candidate words are not included in the $fileName file.")
        }
        else -> {
            println("Words Virtuoso")
            startGame(candidates, lines, "", 1, 0)
        }

    }

    fun isWordValid(guessedWord: String, wordList: List<String>): Boolean {
        val nonEnglishRegex = Regex("""[^a-zA-Z]""")
        val duplicates = Regex("""(.)\1""")

        return when {
            guessedWord.length != CHARLIMIT -> {
                println("The input isn't a 5-letter word.")
                false
            }
            nonEnglishRegex.containsMatchIn(guessedWord) -> {
                println("One or more letters of the input aren't valid.")
                false
            }
            duplicates.containsMatchIn(guessedWord) -> {
                println("The input has duplicate letters.")
                false
            }
            !wordList.contains(guessedWord) -> {
                println("The input word isn't included in my words list.")
                false
            }
            else -> return true
        }
    }
}



