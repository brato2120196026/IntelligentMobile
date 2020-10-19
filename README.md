## Hello Constraint Homework - Solution Code

The Hello Toast app is a simple app that consists of three button elements and one TextView. An activity_main.xml, activity_main.xml (land), and activity_main.xml (xlarge). When the user taps the first button, it displays a short message (a Toast) on the screen. 

 
## Pre-requisites

For this app you should be familiar with creating and running apps in Android Studio.

## Getting Started

Download and open the app in Android Studio.

## The Homework app should contain the following features:

<li>It should display the Zero button.

<li>The Zero button is between the Toast and Count buttons.

<li>Tapping the second button increases a "click" counter displayed in the TextView, which starts at zero.

<li>The app includes an implementation of the click handler method for the Zero button to reset the count to 0.

<li>The method must show the zero count in the show_count TextView.

<li>The click handler must also reset the Zero button's own background color to gray.

<li>The click handler method for the Count button has been updated to change its own background color depending on whether the new count is odd or even.

<li>This method must use the view parameter to access the button.
This method must also change the background of the Zero button to a color other than gray.


## Result

### Codelab 1.2 Part B: The layout editor  

#### HelloConstraint Homework Snapshots

![](HelloConstraint1.png)


![](HelloConstraint2.png)



## Some Basic Git Commands

### git init

This command is used to start a new repository.

<li>Usage: git init [repository name]
 
### git clone

This command is used to obtain a repository from an existing URL.
<li>Usage: git clone [url]

### git add

This command adds a file to the staging area.

<li>Usage: git add [file].

This command adds one or more to the staging area.
<li>Usage: git add 


### git commit

This command records the file permanently in the version history.

<li>Usage: git commit -m “[ Type in the commit message]”

This command commits any files you have added with the git add command and also commits any files you have changed.

<li>Usage: git commit -a  

 
### git branch

This command lists all the local branches in the current repository.

<li>Usage: git branch 

This command creates a new branch.

<li>Usage: git branch [branch name] 

This command deletes the feature branch.

<li>Usage: git branch -d [branch name]


### git checkout
This command is used to switch from one branch to another.

<li>Usage: git checkout [branch name] 

This command creates a new branch and also switches to it.

<li>Usage: git checkout -b [branch name]
 

### git push

This command sends the committed changes of master branch to your remote repository.

<li>Usage: git push [variable name] master
 
This command sends the branch commits to your remote repository.

<li>Usage: git push [variable name] [branch] 

This command pushes all branches to your remote repository.

<li>Usage: git push –all [variable name]

This command deletes a branch on your remote repository.

<li>Usage: git push [variable name] :[branch name] 
  

### git pull

This command fetches and merges changes on the remote server to your working directory.

<li>Usage: git pull [Repository Link]
