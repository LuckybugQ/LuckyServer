package com.zzq.webserver.core.servlet.impl;

import com.zzq.webserver.core.exception.base.ServletException;
import com.zzq.webserver.core.request.Request;
import com.zzq.webserver.core.response.Response;

import java.io.IOException;
import java.util.concurrent.ScheduledThreadPoolExecutor;

public class AsyncServlet extends HttpServlet {

    ScheduledThreadPoolExecutor userExecutor = new ScheduledThreadPoolExecutor(5);

    public void doGet(Request request, Response response) throws ServletException, IOException {
        userExecutor.execute(new AsyncHandler(request,response));
    }

    class AsyncHandler implements Runnable {

        private Request request;
        private Response response;

        public AsyncHandler(Request request,Response response) {
            this.request = request;
            this.response = response;
        }

        @Override
        public void run() {
            //耗时操作
        }
    }
}

