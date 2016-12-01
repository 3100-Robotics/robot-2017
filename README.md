# Project Setup

Navigate to directory to create the new robot repository.

    $ cd <path>
    
Create and initilialize the new repository.

    $ mkdir <repo name>
    $ cd <repo name>
    $ git init
    
Add this repository as a remote and pull its contents down.

    $ git remote add template https://github.com/Sibley-Robotics/robot-template.git
    $ git pull template master
    
Remove the template remote.

    $ git remote remove template
    
Build out the project for Intellij

    $ ./gradlew idea
    
Open this directory in Intellij and when prompted import the Gradle project. Be sure to check the box to `Create directories for empty content roots automatically.`