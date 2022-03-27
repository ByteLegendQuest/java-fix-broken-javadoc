# 在IntelliJ IDEA中本地验证代码

> 我们深知在国内进行开发遇到的各种网络问题，因此为所有的服务设置了国内镜像，保证你即使完全没有魔法也能拥有极速的开发体验。
> 如果你碰到了项目导入、刷新缓慢的问题，请参考[这里](https://github.com/ByteLegendQuest/java-fix-broken-javadoc/blob/main/docs/zh_hans/clone-and-import.md#%E5%BC%80%E5%90%AF%E9%A1%B9%E7%9B%AE%E7%BA%A7%E7%9A%84maven%E4%BB%93%E5%BA%93%E9%95%9C%E5%83%8F)解决。
>
> 如果你是初学者，最好在本地验证完你的代码之后再提交，这会大大节约你的时间，祝你好运！挫折常有，但请不要轻易放弃，不要让我们的努力付诸东流。:-)
>
> 有任何问题，请访问[ByteLegend](https://bytelegend.com)首页右下角的`联系 & 关于`菜单获取我们的联系方式。

当你提交代码之后，CI会运行一些命令来检查你的代码，通常是`mvn verify`。你可以在本地重现这个过程，这样可以大大节约你解决问题的时间。

在你的IDEA右上角，选择`Maven` - `Lifecycle` - `verify`，如图所示。

![idea-run-mvn-verify.png](https://raw.githubusercontent.com/ByteLegendQuest/java-clone-switch-branch/main/docs/idea-run-mvn-verify.png)

稍等片刻，如果出现任何错误，说明你的代码仍需打磨。如果出现绿色的`BUILD SUCCESSFUL`提示，证明你的代码已经没有问题，可以提交给CI进行检查了！
