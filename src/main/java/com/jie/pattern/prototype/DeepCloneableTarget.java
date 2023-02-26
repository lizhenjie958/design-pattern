package com.jie.pattern.prototype;

import java.io.Serializable;

public class DeepCloneableTarget implements Serializable, Cloneable {

    private static final long serialVersionUID = 8614671464410373671L;

    private String cloneName;

    private String cloneClass;

    public DeepCloneableTarget() {
    }

    public DeepCloneableTarget(String cloneName, String cloneClass) {
        this.cloneName = cloneName;
        this.cloneClass = cloneClass;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
