# Clone and Import Maven Project into VSCode


Since you have passed the `git version` challenge before, your `git` should be installed correctly.
Now open your terminal (`Terminal`, `git-bash`, `cmd`, etc.) and input:

`git clone https://github.com/ByteLegendQuest/java-fix-broken-javadoc`

A project directory named `java-clone-switch-branch` will be created, which can be moved wherever you like.

Open `VSCode` - `File` - `Open` and select the directory you just cloned.
Install [Extension Pack for Java](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack) if you haven't installed it.

![install-extension-pack-for-java.png](https://raw.githubusercontent.com/ByteLegendQuest/java-clone-switch-branch/main/docs/install-extension-pack-for-java.png)

If you haven't configured JDK, click gear button in the side bar, select `Settings`,
search `Runtime` and select `Extensions` - `Java` - `Configuration: Runtimes`.
Click `Edit in settings.json`

![edit-settings-json.png](https://raw.githubusercontent.com/ByteLegendQuest/java-clone-switch-branch/main/docs/edit-settings-json.png)

Configure the JDK as follows:

```json
{
  ...add the following configuration at the end. Note that you may need an extra comma.
  "java.configuration.runtimes": [
    {
      "name": "JavaSE-17", // name of JDK
      "path": "~/.sdkman/candidates/java/17.0.2-tem", // path to your JDK installation
      "default": true // whether the JDK should be set as default
    }
  ]
}
```

Note that you may need to add an extra comma at position ① below.

Now wait a few seconds you can start develop this project in your VSCode!
