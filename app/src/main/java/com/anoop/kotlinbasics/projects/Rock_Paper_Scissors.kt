package com.anoop.kotlinbasics.projects

fun main() {

    print("Enter your name: ")
    val name = readln()
    println("🥳$name V/S Computer🥳\n")

    var computerChoice = ""
    var playerChoice = ""

    println("Rock, Paper or Scissors? Enter your choice.")

    playerChoice = readln().lowercase()
    val randomNumber = (1..3).random()


    // To check if user has entered a valid option (still has bugs: For example, user may enter `rock paper`
    // and it would break the loop)
    // TODO: Make the conditioning more accurate
    while (playerChoice !in "rock paper scissors") {
        println("Please enter a valid option!")
        playerChoice = readln().lowercase()
    }


    if (randomNumber == 1) {
        computerChoice = "rock"
    } else if (randomNumber == 2) {
        computerChoice = "paper"
    } else {
        computerChoice = "scissors"
    }

    computerChoice = computerChoice.lowercase()

    println("You chose ${playerChoice.capitalize()}")
    println("Computer chose ${computerChoice.capitalize()}")

    val compWins = "😢Computer won!😢"
    val youWin = "😍You won!😍"


    val winner = when {
        playerChoice == computerChoice -> "Tie"
        playerChoice == "scissors" && computerChoice == "rock" -> "Computer"
        playerChoice == "paper" && computerChoice == "scissors" -> "Computer"
        playerChoice == "rock" && computerChoice == "paper" -> "Computer"
        else -> youWin
    }


    if (winner == "Tie") {
        println("😍It's a Tie!!!😍")
    } else if (winner == "Computer") {
        println(compWins)
    } else {
        println(youWin)
    }

}