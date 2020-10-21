<p align="center">
	<a href="https://tools.cn/"><img src="https://cdn.jsdelivr.net/gh/looly/tools-site/images/logo.jpg" width="45%"></a>
</p>
<p align="center">
	<strong>A set of tools that keep Java sweet.</strong>
</p>
<p align="center">
	<a href="https://tools.cn">https://tools.cn/</a>
</p>

<p align="center">
	<a target="_blank" href="https://search.maven.org/artifact/com.tools/tools-all">
		<img src="https://img.shields.io/maven-central/v/com.tools/tools-all.svg?label=Maven%20Central" />
	</a>
	<a target="_blank" href="https://license.coscl.org.cn/MulanPSL2/">
		<img src="https://img.shields.io/:license-MulanPSL2-blue.svg" />
	</a>
	<a target="_blank" href="https://www.oracle.com/technetwork/java/javase/downloads/index.html">
		<img src="https://img.shields.io/badge/JDK-8+-green.svg" />
	</a>
	<a target="_blank" href="https://travis-ci.org/looly/tools">
		<img src="https://travis-ci.org/looly/tools.svg?branch=v4-master" />
	</a>
	<a href="https://www.codacy.com/app/looly/tools?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=looly/tools&amp;utm_campaign=Badge_Grade">
		<img src="https://api.codacy.com/project/badge/Grade/3e1b8a70248c46579b7b0d01d60c6377"/>
	</a>
	<a href="https://codecov.io/gh/looly/tools">
		<img src="https://codecov.io/gh/looly/tools/branch/v4-master/graph/badge.svg" />
	</a>
	<a target="_blank" href="https://gitter.im/tools/Lobby?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge">
		<img src="https://badges.gitter.im/tools/Lobby.svg" />
	</a>
	<a target="_blank" href='https://gitee.com/loolly/tools/stargazers'>
		<img src='https://gitee.com/loolly/tools/badge/star.svg?theme=gvp' alt='star'/>
	</a>
	<a target="_blank" href='https://github.com/looly/tools'>
		<img src="https://img.shields.io/github/stars/looly/tools.svg?style=social" alt="github star"/>
	</a>
	<a target="_blank" href='https://app.netlify.com/sites/tools/deploys'>
		<img src="https://api.netlify.com/api/v1/badges/7e0824f9-5f9a-4df0-89dd-b2fccfbeccb1/deploy-status" alt="netlify"/>
	</a>
</p>

<br/>
<p align="center">
	<a href="https://qm.qq.com/cgi-bin/qm/qr?k=0wwldaU0E8r-ZzHl_wma33W7420zwXYi&jump_from=webapi"><img src="https://img.shields.io/badge/QQ%E7%BE%A4%E2%91%A4-956375658-orange"/></a>
</p>

-------------------------------------------------------------------------------

## 简介
tools是一个小而全的Java工具类库，通过静态方法封装，降低相关API的学习成本，提高工作效率，使Java拥有函数式语言般的优雅，让Java语言也可以“甜甜的”。

tools中的工具方法来自于每个用户的精雕细琢，它涵盖了Java开发底层代码中的方方面面，它既是大型项目开发中解决小问题的利器，也是小型项目中的效率担当；

tools是项目中“util”包友好的替代，它节省了开发人员对项目中公用类和公用工具方法的封装时间，使开发专注于业务，同时可以最大限度的避免封装不完善带来的bug。

### tools名称的由来

tools = Hu + tool，是原公司项目底层代码剥离后的开源库，“Hu”是公司名称的表示，tool表示工具。tools谐音“糊涂”，一方面简洁易懂，一方面寓意“难得糊涂”。

### tools如何改变我们的coding方式

tools的目标是使用一个工具方法代替一段复杂代码，从而最大限度的避免“复制粘贴”代码的问题，彻底改变我们写代码的方式。

以计算MD5为例：

- 【以前】打开搜索引擎 -> 搜“Java MD5加密” -> 打开某篇博客-> 复制粘贴 -> 改改好用
- 【现在】引入tools -> SecureUtil.md5()

tools的存在就是为了减少代码搜索成本，避免网络上参差不齐的代码出现导致的bug。

-------------------------------------------------------------------------------

## 包含组件
一个Java基础工具类，对文件、流、加密解密、转码、正则、线程、XML等JDK方法进行封装，组成各种Util工具类，同时提供以下组件：

| 模块                |     介绍                                                                          |
| -------------------|---------------------------------------------------------------------------------- |
| tools-aop         |     JDK动态代理封装，提供非IOC下的切面支持                                              |
| tools-bloomFilter |     布隆过滤，提供一些Hash算法的布隆过滤                                                |
| tools-cache       |     简单缓存实现                                                                     |
| tools-core        |     核心，包括Bean操作、日期、各种Util等                                               |
| tools-cron        |     定时任务模块，提供类Crontab表达式的定时任务                                          |
| tools-crypto      |     加密解密模块，提供对称、非对称和摘要算法封装                                          |
| tools-db          |     JDBC封装后的数据操作，基于ActiveRecord思想                                         |
| tools-dfa         |     基于DFA模型的多关键字查找                                                         |
| tools-extra       |     扩展模块，对第三方封装（模板引擎、邮件、Servlet、二维码、Emoji、FTP、分词等）            |
| tools-http        |     基于HttpUrlConnection的Http客户端封装                                            |
| tools-log         |     自动识别日志实现的日志门面                                                         |
| tools-script      |     脚本执行封装，例如Javascript                                                     |
| tools-setting     |     功能更强大的Setting配置文件和Properties封装                                        |
| tools-system      |     系统参数调用封装（JVM信息等）                                                      |
| tools-json        |     JSON实现                                                                       |
| tools-captcha     |     图片验证码实现                                                                   |
| tools-poi         |     针对POI中Excel和Word的封装                                                       |
| tools-socket      |     基于Java的NIO和AIO的Socket封装                                                   |

可以根据需求对每个模块单独引入，也可以通过引入`tools-all`方式引入所有模块。

-------------------------------------------------------------------------------

## 文档 

[中文文档](https://www.tools.cn/docs/)

[参考API](https://apidoc.gitee.com/loolly/tools/)

[视频介绍](https://www.bilibili.com/video/BV1bQ4y1M7d9?p=2)

-------------------------------------------------------------------------------

## 安装

### Maven
在项目的pom.xml的dependencies中加入以下内容:

```xml
<dependency>
    <groupId>com.tools</groupId>
    <artifactId>tools-all</artifactId>
    <version>5.4.5</version>
</dependency>
```

### Gradle
```
compile 'com.tools:tools-all:5.4.5'
```

### 非Maven项目

点击以下任一链接，下载`tools-all-X.X.X.jar`即可：

- [Maven中央库1](https://repo1.maven.org/maven2/cn/tools/tools-all/5.4.5/)
- [Maven中央库2](http://repo2.maven.org/maven2/cn/tools/tools-all/5.4.5/)

> 注意
> tools 5.x支持JDK8+，对Android平台没有测试，不能保证所有工具类或工具方法可用。
> 如果你的项目使用JDK7，请使用tools 4.x版本

### 编译安装

访问tools的Gitee主页：[https://gitee.com/loolly/tools](https://gitee.com/loolly/tools) 下载整个项目源码（v5-master或v5-dev分支都可）然后进入tools项目目录执行：

```sh
./tools.sh install
```

然后就可以使用Maven引入了。

-------------------------------------------------------------------------------

## 添砖加瓦

### 分支说明

tools的源码分为两个分支，功能如下：

| 分支       | 作用                                                          |
|-----------|---------------------------------------------------------------|
| v5-master | 主分支，release版本使用的分支，与中央库提交的jar一致，不接收任何pr或修改 |
| v5-dev    | 开发分支，默认为下个版本的SNAPSHOT版本，接受修改或pr                 |

### 提供bug反馈或建议

提交问题反馈请说明正在使用的JDK版本呢、tools版本和相关依赖库版本。

- [Gitee issue](https://gitee.com/loolly/tools/issues)
- [Github issue](https://github.com/looly/tools/issues)


### 贡献代码的步骤

1. 在Gitee或者Github上fork项目到自己的repo
2. 把fork过去的项目也就是你的项目clone到你的本地
3. 修改代码（记得一定要修改v5-dev分支）
4. commit后push到自己的库（v5-dev分支）
5. 登录Gitee或Github在你首页可以看到一个 pull request 按钮，点击它，填写一些说明信息，然后提交即可。
6. 等待维护者合并

### PR遵照的原则

tools欢迎任何人为tools添砖加瓦，贡献代码，不过维护者是一个强迫症患者，为了照顾病人，需要提交的pr（pull request）符合一些规范，规范如下：

1. 注释完备，尤其每个新增的方法应按照Java文档规范标明方法说明、参数说明、返回值说明等信息，必要时请添加单元测试，如果愿意，也可以加上你的大名。
2. tools的缩进按照Eclipse（~~不要跟我说IDEA多好用，维护者非常懒，学不会~~，IDEA真香，改了Eclipse快捷键后舒服多了）默认（tab）缩进，所以请遵守（不要和我争执空格与tab的问题，这是一个病人的习惯）。
3. 新加的方法不要使用第三方库的方法，tools遵循无依赖原则（除非在extra模块中加方法工具）。
4. 请pull request到`v5-dev`分支。tools在5.x版本后使用了新的分支：`v5-master`是主分支，表示已经发布中央库的版本，这个分支不允许pr，也不允许修改。

-------------------------------------------------------------------------------

## 捐赠

如果你觉得tools不错，可以捐赠请维护者吃包辣条~，在此表示感谢^_^。

点击以下链接，将页面拉到最下方点击“捐赠”即可。

[前往捐赠](https://gitee.com/loolly/tools)
