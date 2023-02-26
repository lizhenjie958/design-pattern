package com.jie.pattern.template;

public abstract class SoyaMilk {
    // 模板方法，不让子类覆盖
    final void make(){
        select();
        // 这是一个钩子方法，控制某个方法在子类中是否要调用
        if(isAddComdiments()){
            addComdiments();
        }
        soak();
        beat();
    }

    // 选材料
    void select(){
        System.out.println("第一步，选好新鲜黄豆");
    }

    // 添加不同的材料
    abstract void addComdiments();

    // 浸泡
    void soak(){
        System.out.println("黄豆和配料开始浸泡");
    }

    // 打浆
    void beat(){
        System.out.println("黄豆和豆浆机配料放在豆浆机去打");
    }

    // 钩子方法
    Boolean isAddComdiments(){
        return Boolean.TRUE;
    }

}
