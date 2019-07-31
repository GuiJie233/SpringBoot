package com.qianfeng.demo.listener;

import org.springframework.stereotype.Component;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;


/**
 *
 */
@Component
public class MyListener implements ServletRequestListener {

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        System.out.println("监听器销毁操作");
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        System.out.println("监听器初始化操作");
    }
}
