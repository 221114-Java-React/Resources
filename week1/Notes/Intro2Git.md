# Git

Git is a distributed version control system designed to help manage your coding projects.

---

### Vocab terms

- **Version Control System**
  - Version control systems are a category of software tools that helps in recording changes made to files by keeping a track of modifications done to the code.
  - [What is VCS?](https://www.geeksforgeeks.org/version-control-systems/)
- **DVCS**
  - Stands for _distributed version control system_. This is a type of VCS that allows multiple users to have different versions of the code base at the same time with no clear version of truth.
  - In practice, there exists a stable version of the code that other versions branch from and eventually merge back into. This working version is the main product that is being developed by a team of devs.
- **Tracked files**
  - Files that you want tracked by git
  - Changes to these files are noticed by the system, and could potentially be saved in a commit
- **Untracked files**
  - These files are ignored by git
  - Changes to these files aren't noticed
  - If you have an untracked file not listed in your .gitignore,

---

### Tools of the trade

To get started with git, get git in your system by installing it in your machine. Use this link to dowload: [Download git](https://git-scm.com/downloads).

---

## Repository

This is where your coding project is stored. There are two kinds:

1. Local
   - Located in your machine.
2. Remote
   - Located somewhere on the interwebs. Usually accessed through some online repository webapp such as Github or Gitlab.

Locally speaking, a repository is nothing more than a special folder that you keep files you want to record changes to. What makes this folder special is a hidden .git folder that transforms a regular folder to a local git repo. (You can think of the hidden .git folder as the msg of repos) This means that every change in the folder gets noticed and could be recorded if you so choose.

### Creating a repository

1. Log in to github
2. Navigate to our organization
3. Click on the green button with the book icon that says `New`
4. Fill out the form. Name your repo following the format: `<LastName>-<FirstName>-Code`.
   - For example:
     - Nolasco-Marielle-Code
5. Don't add a readme.md
6. Click on the green create button to create your new repo!
7. Pat yourself on the back for creating your very first repository.

**Q**: But the repo is online? How do i get it on my machine???

**A**: Two ways:

1. You can create one locally using the cmd line or
2. You can clone a remote one and have a copy of that in your machine.

---

### Tools of the trade

**Github desktop** is a tool that allows you to manage your git repositories. It has features that integrate with github allowing you to easily clone remote repositories as well as drag and drop functionality for your local ones. Go get yourself a copy here: [Github Desktop](https://desktop.github.com/)

---

### Cloning a repository

1. Go to github
2. Navigate to the repository you want to clone
3. Click on the green `code` dropdown menu
4. Select `open with github desktop`
5. If you've successfully installed github desktop, it should open the application for you. If you haven't, please download and install it to access this feature.
6. When you've opened the github desktop application, it asks you where you want to save your cloned repository in the local path section. If you click on the browse button, you can easily choose a saving place using your file explorer. I suggest you pick a place that's easy to remember, like your desktop or a special folder for your work stuff.
7. Click the clone button when you're finished. Congratulations! You've successfully cloned a remote repository.

**Q**: What can I do with a cloned repository?

**A**: That repository is connected to a remote online repository somewhere on the interwebs. When you make changes to that repository, you can upload those changes online so you can access them from whatever machine. This feature also allows multiple people to collaborate on a single project and see the changes made by each team member.

## Saving changes

**Q**: How do I make git save the changes that I'm making?

**A**: It's a two step process if you're saving locally, 3 if you wanna upload your changes up on the interwebs

### `git add`

`git add` is a cmd you make on the command line to specify which files you want git to save the states of. You run `git add <file-name>` in your repo folder to add a certain file to the group of files you want to commit.

Using github desktop, this cmd is abstracted away from you with the use of the checkboxes beside the files you want to include in your commit.

### `git commit`

`git commit` is a cmd you write on the command line to bookmark the state/ take a snapshot of the current state of all edited files that are in staging.

**Q**: What is staging????

**A**: When you run `git add` you actually add files to staging. Staging is where you gather all the updated files you want to include in a commit.

**Q**: Why stage files???

**A**: So you can manage which files are committed together! You want to group together files that make logical sense. You want to think about your commit history as a story. You want to group files that contribute chapters to that story. Another analogy would be to think of your commit history as your game history and every commit is a checkpoint in your game. You want to have a checkpoint everytime you accomplish something big or you arrive at unfamiliar territory.

**Q**: What's a commit history?

**A**: A commit history is a list of your previous commits. When you rollback to a certain commit, you restore the files to the state they were in at the time of the commit. By implementing good commit practices, your commit history could be the saving grace to a feature development that has gone really bad.

---

In github desktop, to commit to your local repo, you can just write out your commit message in the summary section on the left of your github desktop app. And click on the commit to main button below the text area.

---

**Q**: What's a commit message?

**A**: A commit message is a message you attach to a commit to document what changes are being brought about by the commit. Practice writing out succint descriptions of your commits, it would be helpful if you ever need to rollback or begin working in a team environment.

### `git push`

`git push` is a cmd you write out to the console to upload files to a remote repo.

To push using github desktop, click on the push to origin button at the top ribbon on the screen.

### Big Picture

In summary, to save changes you've made to files:

1. `git add` files to staging. In github desktop, click on the checkboxes beside the files you want to include to the commit.
2. `git commit` the files in staging. In github desktop, fill out the summary section to include your commit message and click on the commit to main button.
3. `git push` the latest commits up to github. In github desktop, just press on the push to origin button at the top ribbon.

## Pulling some changes

`git pull` is a cmd you run to get the latest changes from a remote repository. It's a combination of two commands, `git fetch` and `git merge`. `git fetch` tries to match the commit history of the remote repo with the local repo. `git merge` would merge the changes from the remote repo to the local repo.

In github desktop, you would click the button to fetch any changes from origin, and if there are any, you can press the same button to pull from origin.

## gitignore

A .gitignore file lists out all the files and folders you wouldn't want git to be tracking.

**Q**: Why do you want to ignore files?

**A**: Some files, like your .class files and other build outputs are useless in a remote repo setting. You want only source code and other important documents that are supplementary to the code to make it. Furthermore, some files that contain certain sensitive information like database credentials are also best left in your local machine.

---

**Tools of the trade**

To get a nice premade template for you gitignore file, go to [gitignore.io](https://www.toptal.com/developers/gitignore) and input in the tech and IDEs you're working with, amd just copy & paste the result in your .gitignore file.

---

## Best Practices

1. **Don't be afraid of commitment!**
   - Commmit often and bookmark the changes you've made to your code with self documenting commit messages. An immaculate commit history will save you a lot of time if you want to rollback and help prep you for working in a group.
2. **Push and pull often**
   - Especially true when working in a group, don't forget to pull the latest updates from the remote repo you are tracking and to push the work you've done by the end of the day.
3. **Don't forget your .gitignore**
   - Don't forget to include your gitignore as one of your first commits!

---

**_Songs of the trade_**

The perfect playlist for learning git:
https://open.spotify.com/playlist/0MJBni0UzdnML1amikx0Rc?si=bba9e80737d24651
