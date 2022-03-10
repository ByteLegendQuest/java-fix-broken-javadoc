# 下载项目代码并导入IntelliJ IDEA

> 我们深知在国内进行开发遇到的各种网络问题，因此为所有的服务设置了国内镜像，保证你即使完全没有魔法也能拥有极速的开发体验。
>
> 如果你是初学者，最好一步步按此文档操作，祝你好运！挫折常有，但请不要轻易放弃，不要让我们的努力付诸东流。:-)
>
> 有任何问题，请访问[ByteLegend](https://bytelegend.com)首页右下角的`联系 & 关于`菜单获取我们的联系方式。

因为你已经通过了之前的`git version`挑战，`git`应该已经正确安装，所以在你的终端（如macOS上的`Terminal`, Windows上的`cmd`(命令提示符)/`PowerShell`/`git-bash`等）输入：

`git clone https://git.bytelegend.com/ByteLegendQuest/java-fix-broken-javadoc`

这会在本地创建一个名为`java-fix-broken-javadoc`的项目文件夹，你可以把它移动到你喜欢的任何地方去。

打开`IDEA`，选择`File` - `Open`，选中刚刚创建`java-fix-broken-javadoc`的项目文件夹下的`pom.xml`并打开。
因为`pom.xml`是Maven项目的入口，IDEA会提示是否打开项目，点击`Open as Project`，如图所示。

![idea-open-project](https://raw.githubusercontent.com/ByteLegendQuest/java-clone-switch-branch/main/docs/idea-open-project.png)

如果你的IDEA第一次打开Java项目，它可能会报错没有配置JDK(`Project JDK is not defined`)。请打开`File` - `Project Structure`，如果显示"No JDK"，点击`Edit`按钮，
将之前下载的JDK添加到IDEA中。

![idea-project-structure](https://raw.githubusercontent.com/ByteLegendQuest/java-clone-switch-branch/main/docs/idea-project-structure.png)

![idea-add-jdk](https://raw.githubusercontent.com/ByteLegendQuest/java-clone-switch-branch/main/docs/idea-add-jdk.png)

如果你没有魔法，项目的导入可能会很慢，这是因为默认的Maven中央仓库在中国大陆没有CDN节点。
在你了解Maven原理之前，**请勿**贸然按照网上教程胡乱修改本地的Maven配置。
我们在项目中内置了阿里云镜像，一键开启，只对该项目生效，没有毒副作用。
如图所示，在IDEA的右上角的`Maven`工具栏中，选中`aliyun-maven`然后**按刷新按钮刷新项目结构**。

![switch-aliyun-maven-profile](https://raw.githubusercontent.com/ByteLegendQuest/java-clone-switch-branch/main/docs/zh/switch-aliyun-maven-profile.png)

请稍等片刻，待项目导入完成后，你就可以拥有极速的开发体验了！
