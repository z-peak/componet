# 一、组件化使用的原因及好处
**原因**

	1、实际业务变化非常快，但是单一工程的业务模块耦合度太高，牵一发而动全身； 

    2、对工程所做的任何修改都必须要编译整个工程； 

    3、功能测试和系统测试每次都要进行

    4、团队协同开发存在较多的冲突.不得不花费更多的时间去沟通和协调，并且在开发过程中，任何一位成员没办法专注于自己的功能点，影响开发效率； 

    5、不能灵活的对业务模块进行配置和组装；

**好处**

	1、加快业务迭代速度，各个业务模块组件更加独立，不再出现业务耦合情况； 

    2、稳定的公共模块采用依赖库方式，提供给各个业务线使用，减少重复开发和维护工作量； 
    
    3、迭代频繁的业务模块采用组件方式，各业务研发可以互不干扰、提升协作效率，并控制产品质量；

    4、为新业务随时集成提供了基础，所有业务可上可下，灵活多变；

    5、降低团队成员熟悉项目的成本，降低项目的维护难度； 

    6、加快编译速度，提高开发效率； 

    7、控制代码权限，将代码的权限细分到更小的粒度；
  
#二、实现流程
> **1、组件模式与集成模式转换**

	AndroidStudio的Module主要有两种属性：application和library
	apply plugin: ‘com.android.application’  --可独立运行的独立进程
	apply plugin: ‘com.android.library’      --可被主项目依赖的组件，不可独立运行

属性是在build.gradle中配置的，为了方便切换组件模式与集成模式可在gradle.properties中配置一个全局属性：
    `

- 每次更改“isModule”的值后，需要点击 "`sync project`" 按钮进行同步
- **isModule=false**

然后在module的build.gradle中引用：

    if (isModule.toBoolean()) {
    	apply plugin: 'com.android.application'
    } else {
    	apply plugin: 'com.android.library'
    }

这样就可以做到**一次改变处处生效**

> **2、组件中AndroidManifest.xml合并问题**
	
	Android中每个Module都有一个AndroidManifest.xml文件，但是组件模式与集成模式的AndroidManifest.xml不同，这就需要我们根据不同的模式来配置不同的AndroidManifest.xml文件。
	
