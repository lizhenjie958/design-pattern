package com.jie.pattern.prototype;

import java.io.*;

public class DeepProtoType implements Serializable, Cloneable {

    private static final long serialVersionUID = 6570787850774781177L;

    public String name;
    public DeepCloneableTarget deepCloneableTarget;

    public DeepProtoType() {
        super();
    }

    public DeepProtoType(String name, DeepCloneableTarget deepCloneableTarget) {
        this.name = name;
        this.deepCloneableTarget = deepCloneableTarget;
    }

    /**
     * 深拷贝  方式1
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object deep = null;
        //这里完成对基本数据类型(属性)和String的克隆
        deep = super.clone();
        //对引用类型的属性，进行单独处理
        DeepProtoType deepProtoType = (DeepProtoType)deep;
        deepProtoType.deepCloneableTarget  = (DeepCloneableTarget)deepCloneableTarget.clone();
        return deepProtoType;
    }

    /**
     * 深拷贝 方式2 通过对象的序列化方式实现
     */
    public Object deepClone(){
        //创建流对象
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;

        try {
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            DeepProtoType deepProtoType = (DeepProtoType) ois.readObject();
            return deepProtoType;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            try {
                if(bos != null){
                    bos.close();
                }
                if(bis != null){
                    bis.close();
                }
                if(oos != null){
                    oos.close();
                }
                if(bis != null){
                    bis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
