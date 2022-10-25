# Welcome to Note





## 1. 项目简介



AIM : 这个项目主要用来记录算法学习的笔记



### 目录

TODO - li的形式后续改成[doc tree]

* Note
  * algorithm
    * Acwing
      * Level1
        * Basic
        * DataStructure
        * Graph
        * Math
        * DP
        * Greed
    * LeetCode
    * LuoGu

目前正在完善Acwing的模块



### 分支

两个不同的分支区分不同环境

1. 家里 -- master
2. 公司 -- feature(根据功能/模块新增和修改)





## 2. git flow



```bash
------------- 初始化项目 --------------------



git clone -b master git@github.com:xxx/xxx.git

git branch -b my-feature #my-feature: 自己做的功能/模块




------------- 更新本地仓库代码 ---------------



######### 写代码 ########

balabala

######### 提交代码 ######

git diff

git add [file] #将磁盘的代码提交到暂存区

git commit -m "xxx" #将暂存区的代码提交到本地git仓库

git push origin my-feature #将本地该分支git仓库的代码提交到远程git仓库




---------- 处理远程仓库代码冲突 -------------



################ 拉取master分支最新的代码并reabse ##

git checkout master

git pull origin master

git checkout my-feature

git rebase master #rebase是把自己的commit放到master分支上,而merge是把合并后的结果生成一个新的commit放到my-feature分支

################ rebase手动选择,处理冲突 ########


===============================================
手动解决冲突                                     | 
											   |
git add                                        |
                                               |
git rebase --continue #解决一个冲突后继续rebase   |
===============================================

git rebase --abort #终止rebase操作,回到rebase开始状态


################ rebase后重新提交到远程仓库 #######

git push -f origin xxx // 把rebase后并更新后的代码再push到远程仓库上

原项目的主人采用pull request(PR)中的squash and merge方式合并不同的commit




------------------ 远端完成更新后 ------------------------

git branch -d my-feature 删除本地git分支

git pull origin master 再把远端的最新代码拉到本地


-------------------------------------------------------
重复该流程

```







## 3. 相关文档



算法网校: [ACWING](https://www.acwing.com/)



刷题网站: [LEETCODE](https://leetcode.cn/problemset/all/)







