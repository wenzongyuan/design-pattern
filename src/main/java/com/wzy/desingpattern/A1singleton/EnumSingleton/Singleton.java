package com.wzy.desingpattern.A1singleton.EnumSingleton;

/**
 * 枚举单例，使用枚举实现单例，其实是利用了枚举的加载原理，类似于饿汉模式。
 *
 * 特点：线程安全、效率高、但是不可延时。
 */
public enum Singleton {

    INSTANCE;

    public static void doSomething(){
        System.out.println("do someting");
    }

    /** 枚举类反编译后的代码，由此可以看出枚举的实例是单例的，而且在类加载的时候就会创建对象，因此枚举实现单例：
     * （线程安全，调用效率高，不能延时加载，可以天然的防止反射和反序列化调用）
     * public final class DemoEnum extends Enum {
     *     private DemoEnum(String s, int i) {
     *         super(s, i);
     *     }
     *     public static DemoEnum[] values() {
     *     	DemoEnum at[];
     *         int i;
     *         DemoEnum at1[];
     *         System.arraycopy(at = ENUM$VALUES, 0, at1 = new T[i = at.length], 0, i);
     *         return at1;
     *     }
     *
     *     public static DemoEnum valueOf(String s) {
     *         return (DemoEnum)Enum.valueOf(demo/DemoEnum, s);
     *     }
     *
     *     public static final DemoEnum FIRST;
     *     public static final DemoEnum SECOND;
     *     public static final DemoEnum THIRD;
     *     public static final DemoEnum FOURTH;
     *     private static final DemoEnum ENUM$VALUES[];
     *     static {
     *         SPRING = new T("FIRST", 0);
     *         SUMMER = new T("SECOND", 1);
     *         AUTUMN = new T("THIRD", 2);
     *         WINTER = new T("FOURTH", 3);
     *         ENUM$VALUES = (new T[] {
     *         	FIRST, SECOND, THIRD, FOURTH
     *         });
     *     }
     * }
     */
}
