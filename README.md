## Implicit Intents Homework - Solution Code

The Implicit Intents app is created with one Activity and three options for actions, open a web site, open a location on a map, and share a snippet of text. And a "Take a Picture Button" when it is clicked, launches a camera app to take a picture.

## Pre-requisites
To run this app you should be familiar with creating and running apps in Android Studio.

## Getting Started

Download and open the app in Android Studio.

## The Homework app should contain the following features:

<li>It displays a Take a Picture button at the bottom of the app.
<li>When clicked, the button launches a camera app on the device.
<li>Before sending the intent, the onClick() method for the Take a Picture Button ensures that an app is available on the device, using the resolveActivity() and getPackageManager() methods.

## Result

#### ImplicitIntents Homework Screenshots

![](ImplicitAss1.png)


![](ImplicitAss2.png)


![](ImplicitAss3.png)


![](ImplicitAss4.png)


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
