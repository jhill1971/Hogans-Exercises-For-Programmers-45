// Exercises For Programmers by Brian P. Hogan
// Exercise 45: Word Finder
// James Hill, Houston, Texas, 2022
// GitHub: jhill1971 Twitter: @count_BASIC

import java.io.BufferedReader
import java.io.File
import java.io.FileReader
import java.io.FileWriter

/**
 * Given an input file, read the file and look for all occurrences of the word 'utilize'. Replace each
 * occurrence with 'use'. Write the modified file to a new file. Prompt for the name of the output file. Write the
 * output to the new file.
 */


/** Program entry point. Get name of target file. */
fun main() {
    print("What name do you want to give the updated file? ")
    val newFile: String = readLine().toString()
    fileActions(newFile)
    println("File actions completed.")

}

/** Carry out file operations*/
fun fileActions(newFile: String) {
    // Declare Variables
    val target: String = "utilize"
    val replacement: String = "use"
    var oldContent: String = ""
    val fileLocation: String  = "C:\\Users\\ikon1\\IdeaProjects\\Exercise45\\src\\main\\resources\\source.txt"
    val targetLocation: String = "C:\\Users\\ikon1\\IdeaProjects\\Exercise45\\src\\main\\resources\\${newFile}.txt"
    val fileToBeModified: File = File(fileLocation)
    val reader: BufferedReader = BufferedReader(FileReader(fileToBeModified))


    /* Reading the file line by line and adding it to the oldContent variable. */
    for (line in reader.lines()){
        oldContent = oldContent + line + System.lineSeparator()
        var line = reader.readLine()
    }

    /* Replacing the target word with the replacement word. */
    var newContent = oldContent.replace(target,replacement)

    /* Writing the new content to the new file. */
    var writer: FileWriter = FileWriter(targetLocation)
    writer.write(newContent)

    /* Closing the file. */
    reader.close()
    writer.close()
}