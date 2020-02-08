package com.zzq.webserver.core.listener.event;

import com.zzq.webserver.core.context.ServletContext;

/**
 * @author sinjinsong
 * @date 2018/5/3
 * servletContext相关的事件
 */
public class ServletContextEvent extends java.util.EventObject { 

 
    public ServletContextEvent(ServletContext source) {
        super(source);
    }
    
    public ServletContext getServletContext () { 
        return (ServletContext) super.getSource();
    }
}

