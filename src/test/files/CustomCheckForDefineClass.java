package org.sonar.samples.java;

import sun.misc.Unsafe;

public class MyClass {

    private final Unsafe unsafe = Unsafe.getUnsafe();
    private final String className = this.getClass().getName();

    private Class defineClassImpl(byte[] code, boolean mustBeBootstrap) {
        ClassLoader loader = null;
        Class cl = unsafe.defineClass(className, code, 0, code.length, loader, null); // Noncompliant
        return cl;
    }

    private Class cls = Unsafe.getUnsafe().defineClass(className, null, 0, 0, null, null);// Noncompliant

}


