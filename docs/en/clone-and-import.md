# Clone the Project Code and Import into IntelliJ IDEA

Since you have passed the `git version` challenge before, your `git` should be installed correctly.
Now open your terminal (`Terminal` on macOS, `cmd`/`powershell`/`git-bash` on Windows, etc.) and input:

`git clone https://github.com/ByteLegendQuest/java-fix-broken-javadoc`

A project directory named `java-fix-broken-javadoc` will be created, which can be moved wherever you like.

Open `IDEA`, `File` - `Open`, select and open the `pom.xml` in `java-fix-broken-javadoc` directory which is created just now.
Because `pom.xml` is the entrance of a Maven project, IDEA will ask you if you would like to open the project.
Click `Open as Project`:

![idea-open-project](https://raw.githubusercontent.com/ByteLegendQuest/java-clone-switch-branch/main/docs/idea-open-project.png)

If this is the first time for your IDEA to open a Java project, it might complain no JDK configured (`Project JDK is not defined`).
Please open `File` - `Project Structure`, if there's a "No JDK" error, click `Edit` button and
add the JDK that you have downloaded into IDEA.

![idea-project-structure](https://raw.githubusercontent.com/ByteLegendQuest/java-clone-switch-branch/main/docs/idea-project-structure.png)

![idea-add-jdk](https://raw.githubusercontent.com/ByteLegendQuest/java-clone-switch-branch/main/docs/idea-add-jdk.png)

Wait for the project to be imported. Enjoy coding in your IDE!
