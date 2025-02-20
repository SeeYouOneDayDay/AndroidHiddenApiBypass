/*
 * Copyright (C) 2021 LSPosed
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.lsposed.hiddenapibypass;

import java.lang.invoke.MethodHandleInfo;
import java.lang.invoke.MethodType;
import java.lang.reflect.Member;

@SuppressWarnings("unused")
public class Helper {
    //http://aospxref.com/android-12.0.0_r3/xref/libcore/ojluni/src/main/java/java/lang/invoke/MethodHandle.java
    static public class MethodHandle {
        private final MethodType type = null;
        private MethodType nominalType;
        private MethodHandle cachedSpreadInvoker;
        protected final int handleKind = 0;

        // The ArtMethod* or ArtField* associated with this method handle (used by the runtime).
        protected final long artFieldOrMethod = 0;
    }

    //http://aospxref.com/android-12.0.0_r3/xref/libcore/ojluni/src/main/java/java/lang/invoke/MethodHandleImpl.java
    //public class MethodHandleImpl extends MethodHandle implements Cloneable
    static final public class MethodHandleImpl extends MethodHandle {
        private final MethodHandleInfo info = null;
    }

    //http://aospxref.com/android-12.0.0_r3/xref/libcore/ojluni/src/main/java/java/lang/invoke/MethodHandleImpl.java
    // MethodHandleImpl$HandleInfo
    static final public class HandleInfo {
        private final Member member = null;
        private final MethodHandle handle = null;
    }

    //http://aospxref.com/android-12.0.0_r3/xref/libcore/ojluni/src/main/java/java/lang/Class.java
    static final public class Class {
        private transient ClassLoader classLoader;
        private transient java.lang.Class<?> componentType;
        private transient Object dexCache;
        private transient Object extData;
        private transient Object[] ifTable;
        private transient String name;
        private transient java.lang.Class<?> superClass;
        private transient Object vtable;
        private transient long iFields;
        private transient long methods;
        private transient long sFields;
        private transient int accessFlags;
        private transient int classFlags;
        private transient int classSize;
        private transient int clinitThreadId;
        private transient int dexClassDefIndex;
        private transient volatile int dexTypeIndex;
        private transient int numReferenceInstanceFields;
        private transient int numReferenceStaticFields;
        private transient int objectSize;
        private transient int objectSizeAllocFastPath;
        private transient int primitiveType;
        private transient int referenceInstanceOffsets;
        private transient int status;
        private transient short copiedMethodsOffset;
        private transient short virtualMethodsOffset;
    }

    //http://aospxref.com/android-12.0.0_r3/xref/libcore/ojluni/src/main/java/java/lang/reflect/Executable.java
    //      public abstract class Executable extends AccessibleObject implements Member, GenericDeclaration
    //http://aospxref.com/android-7.1.2_r39/xref/libcore/libart/src/main/java/java/lang/reflect/AbstractMethod.java
    //      public abstract class AbstractMethod extends AccessibleObject
    static public class AccessibleObject {
        private boolean override;
    }

    // Before Oreo, it is: java.lang.reflect.AbstractMethod
    // After Oreo, it is: java.lang.reflect.Executable
    static final public class Executable extends AccessibleObject {
        private Class declaringClass;
        private Class declaringClassOfOverriddenMethod;
        private Object[] parameters;
        private long artMethod;
        private int accessFlags;
    }

    @SuppressWarnings("EmptyMethod")
    public static class NeverCall {
        private static void a() {
        }

        private static void b() {
        }

        private static int s;
        private static int t;
        private int i;
        private int j;
    }

    public static class InvokeStub {
        private static Object invoke(Object... args) {
            throw new IllegalStateException("Failed to invoke the method");
        }

        private InvokeStub(Object... args) {
            throw new IllegalStateException("Failed to new a instance");
        }
    }
}
