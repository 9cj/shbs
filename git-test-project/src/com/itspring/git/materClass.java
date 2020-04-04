package com.itspring.git;

//本地分支和远程分支同步问题：
//dea创建一个本地分支，然后远程同步创建一个分支
//https://blog.csdn.net/guinailu/article/details/84766141
public class materClass {
    public static void main(String[] args) {
        System.out.println("master分支");
    }

    /**
     * 总结：
     * 建立的 分支 可以提交到本地仓库 也可以push到远程仓库
     * 都是可以merge到另一个分支的。
     *
     * 需要注意的是： 修改分支 后 如果想 切换分支， 必须先提交或者先push 再切换，否则，修改的内容都在切换后的分支中显示，即 暂存区
     *
     * */
}
