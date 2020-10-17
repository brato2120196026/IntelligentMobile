## ImplicitIntents Homework Source Code
The Implicit Intents Homework app contains two activities.<br>
It uses an activity inside the app which can always be activated from inside or outside the app with an explicit Intent.<br>
To allow an activity to receive an implicit Intent. And also to take a picture from the app.

## Pre-requisites
- For this App you should have basic knowledge in Android App development with:
- Creating and running apps in Android Studio.

## The Homework app should contain the following features:
- Should displays a Take a Picture button at the bottom of the app.<br>
- When clicked, the button launches a camera app on the device.<br>
- Before sending the intent, the onClick() method for the Take a Picture Button ensures that an app is available on the device, using the resolveActivity() and getPackageManager() methods.

## Getting Started
Download and open the app in Android Studio.
## Some Basic Git Commands
### git init
<ul>
This command is used to start a new repository.
<ul>
<li>Usage: git init [repository name]</li> 
</ul>
</ul>
 
### git clone
<ul>
This command is used to obtain a repository from an existing URL.
<ul>
<li>Usage: git clone [url]</li> 
  </ul>
  </ul>

### git add

This command adds a file to the staging area.

- Usage: git add [file].

- This command adds one or more to the staging area.
- Usage: git add *


### git commit

This command records or snapshots the file permanently in the version history.

- Usage: git commit -m “[ Type in the commit message]”

- This command commits any files you’ve added with the git add command and also commits any files you’ve changed since then.

- Usage: git commit -a  

 
### git branch

- This command lists all the local branches in the current repository.

- Usage: git branch 

- This command creates a new branch.

- Usage: git branch [branch name] 

- This command deletes the feature branch.

- Usage: git branch -d [branch name]


### git checkout
- This command is used to switch from one branch to another.

- Usage: git checkout [branch name] 

- This command creates a new branch and also switches to it.

- Usage: git checkout -b [branch name]
 

### git push

- This command sends the committed changes of master branch to your remote repository.
- Usage: git push [variable name] master 
- This command sends the branch commits to your remote repository.
- Usage: git push [variable name] [branch] 
- This command pushes all branches to your remote repository.
- Usage: git push –all [variable name] 
- This command deletes a branch on your remote repository.
- Usage: git push [variable name] :[branch name] 
  

### git pull

- This command fetches and merges changes on the remote server to your working directory.
- Usage: git pull [Repository Link]


























