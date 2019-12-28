package com.wzy.desingpattern.A6proxy.cglibDynamicProxy;

import com.wzy.desingpattern.A6proxy.cglibDynamicProxy.impl.GamePlayer;
import net.sf.cglib.proxy.MethodInterceptor;
import org.omg.PortableInterceptor.Interceptor;

import java.lang.reflect.InvocationHandler;

/**


 */
public class Test {

    public static void main(String[] args) {

        IGamePlayer gamePlayer = new GamePlayer();
        MethodInterceptor methodInterceptor = new GamePlayerInterceptor(gamePlayer);
        IGamePlayer proxy = CglibDynamicProxy.createProxy(methodInterceptor, IGamePlayer.class);
        proxy.playGanme();
        /*
        cglib before.....
        play game .....
        cglib after....
         */

     //测试cglib的动态 代理类还能不能被代理
        MethodInterceptor methodInterceptor1 = new GamePlayerInterceptor(proxy);
        IGamePlayer proxy1 = CglibDynamicProxy.createProxy(methodInterceptor1, IGamePlayer.class);
        proxy1.playGanme();
        /*
        cglib before.....
        cglib before.....
        play game .....
        cglib after....
        cglib after....
         */
        //从输出结果来看，cglib的动态代理生成的类依旧是可以被代理的。
    }
}
