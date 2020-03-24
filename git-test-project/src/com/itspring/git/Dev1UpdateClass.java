package com.itspring.git;

public class Dev1UpdateClass {
    public void dev1Update() {
        System.out.println("测试master 有没有");//注意：修改分支之后先提交 或者push，再切换分支
    }

    public void dev1MergeMaster() {
        System.out.println("我是分支1，（只提交到本地了）合并到master");
    }
}
