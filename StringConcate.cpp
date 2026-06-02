#include <iostream>
#include <string>

int main() {
    int count;

    // Ask the user how many strings they want to combine
    std::cout << "Enter the number of strings you want to add: ";
    if (!(std::cin >> count) || count <= 0) {
        std::cout << "Please enter a valid positive number." << std::endl;
        return 1;
    }

    // Clear the input buffer so std::getline works correctly afterward
    std::cin.ignore();

    std::string finalString = "";
    std::string currentString;

    // Loop to take user input for each string
    for (int i = 0; i < count; ++i) {
        std::cout << "Enter string #" << (i + 1) << ": ";
        
        // std::getline reads the entire line, including spaces
        std::getline(std::cin, currentString); 
        
        // The '+' operator concatenates (adds) the strings together
        finalString += currentString; 
    }

    // Print the final concatenated result
    std::cout << "\n--- Combined Result ---" << std::endl;
    std::cout << "Result: " << finalString << std::endl;

    return 0;
}
