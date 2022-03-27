# Verify Code in VSCode Locally

After you submit your code, CI will run a few commands (usually `mvn verify`) to verify your code.
You can reproduce the check locally, which can substantially save your time.

At the left-bottom corner of your VSCode, select `Maven` - `Lifecycle` - `verify`, as follows:

![vscode-run-mvn-verify.png](https://raw.githubusercontent.com/ByteLegendQuest/java-clone-switch-branch/main/docs/vscode-run-mvn-verify.png)

Wait a sec, if any error occurs, that means you still need to polish your code.
If you see a green `BUILD SUCCESSFUL` message, that means your code is good to go and you can submit your code to CI!
