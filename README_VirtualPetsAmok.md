# VirtualPetsAMOK!
The Virtual Pets Amok game is a without frills application that was written as a means of practicing basic java principles: creating classes, methods, and loops, as well as, java object-oriented programming (OOP) concepts including abstraction, polymorphism, inheritance, and encapsulation using test driven development(TDD). 

## Introduction
The application consists of multiple classes including an abstract class of VirtualPet. 
- VirtualPet class allows for organic and robotic cats and dogs and set attributes common to all, such as, name, description, happiness, health, etc. Classes that extend VirtualPet are:
	-OrganicCat
	-OrganicDog
	-RoboticCat
	-RoboticDog
These classes set attributes that are unique to the type, i.e. hunger and thirst for organic pets and oil level for robotic pets. Instances of these classes are created initially and through user input. 
- VirtualPetShelter class initializes a map that will contain and interact with virtual pets. There is also methods that display status and information of all virtual pets in the shelter throughout the game.
- VirtualPetShelterApp class contains the main method and the game loop where user input is required and writes out to the console.
- The AllDogsInterface contains the walk method which increases happiness; the OrganicPetInterface contains methods for feeding and giving water to all organic pets; the RoboticPetInterface contains the oil pet method.

The game's objective is to maintain a virtual pet shelter by intaking pets to shelter, adopting them out and interacting with virtual pets without allowing any of their needs to exceed 10 points or allowing their happiness level to go below 5 points. All virtual pets start out with their happiness at 10 points and boredom at 0 points. Robotic pets start with an oil level of 5 points while organic pet's hunger and thirst start at the same. Users can interact with them by feeding, watering, playing with them, walking them, and oiling them. An interaction reduces that particular need by one point, but at the same time may increase another need. A tick method increases needs randomly.

The game is a balancing act of interactions to make sure none of the pet's needs reach 10 upon which they will be removed from the shelter. Users are able to give a pets up for adoption or take in a new pets. Once the shelter is empty, you are asked to leave the virtual pet shelter and the game ends.

## Instructions
1 - To feed the organic pets\
2 - To give the organic pets water\
3 - To play with a pet\
4 - To walk the dogs\
5 - To adopt a pet\
6 - To admit a pet\
7 - To oil the robotic pets\
8 - To clean the dog cages\
9 - To clean the litter box\
10 - To exit the game\
0 - To print instructions