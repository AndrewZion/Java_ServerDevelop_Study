# VS code编译运行Java程序时遇到的bug

==出现以下报错，并且复制代码到其他IDE或者用cmd命令行编译运行时没有问题==

```
The declared package "" does not match the expected package "java_work"

Hello.java is a non-project file, only syntax errors are reported

Exception in thread "main" java.lang.NoSuchMethodError: Cat.hi()V at VarScope.main(VarScope.java:4)

错误: 找不到或无法加载主类 java_work.Hello
```

诸如以上问题，可以通过以下途径解决：

vs code编写小项目——单文件项目时，最好是首先在文件夹里新建需要编写代码的Java文件；其次，右击通过vs code打开新建的Java文件，编写代码运行；

如果是打开项目文件夹的话，只要有一个子项目的文件存在语法错误，该项目编译时就会报错“build failed”，所以，以后用vs code建项目，最好以每个项目作为根目录创建，中大型多文件项目最好使用Idea创建。