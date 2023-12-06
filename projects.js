/*
Rashid Warsajee
040946714
CST8285
Assignment 1
Due Nov 5th 2023
*/


let currentProject = 1; // variable declaration for currentProject
const totalProjects = 4; // declares the constant totalProjects and assigns it a value of 4

function showProject(projectNumber) {                         //Declares a function showProject, projectNumber is the parameter
    const projects = document.querySelectorAll('.project');  // Selects each project and stores them in a variable.
    projects.forEach((project) => {                            // for loop to go through each project
        project.style.display = 'none';                        // hides  projects in loop by setting display to none
    });
    document.getElementById(`project${projectNumber}`).style.display = 'block';    // Picks out a project with the right number and makes that specific one visible by setting display to block
}

function showNextProject() {                     // Declaring our showNextProject Function
    currentProject = (currentProject % totalProjects) + 1;            //Increments the number of projects, using modulo it wraps back around if we exceed the max of 4
    showProject(currentProject);       // displays current project using function showProject
}

function showPreviousProject() {                // declaring our function showPreviousProject, which shows the previous project 
    currentProject = ((currentProject - 2 + totalProjects) % totalProjects) + 1; // calculates index of prev proj, wraps around if index goes below 1
    showProject(currentProject); // calls on showProject to display currentProject 
}

// Display first project
showProject(currentProject);
