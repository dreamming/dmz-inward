package com.dmz.web.advisor;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * Created by dmz on 2016/3/31.
 */
public class FrontInterceptor extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse httpServletResponse, Object o) throws Exception {
        System.out.println("Start The preHandle of Interceptor....");
        String addr = request.getRemoteAddr();
        int port = request.getRemotePort();
        System.out.println("Remote Address-->"+addr+":"+port);
        String laddr = request.getLocalAddr();
        int lport = request.getLocalPort();
        System.out.println("Local Address-->"+laddr+":"+lport);
        String saddr = request.getServerName();
        int sport = request.getServerPort();
        System.out.println("Server Info-->"+saddr+":"+sport);
        Map<String, String[]> mp = request.getParameterMap();
        System.out.println(mp);
//        HandlerMethod ha = (HandlerMethod) o;
//        MethodParameter[] par = ha.getMethodParameters();
//        for (MethodParameter pa:par){
//            System.out.println(pa.getMethod());
//        }

//        httpServletResponse.sendRedirect("http://www.baidu.com");
        System.out.println("End The preHandle of Interceptor...");
        return true;
    }

    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("Start The postHandle of Interceptor....");
        String addr = request.getRemoteAddr();
        int port = request.getRemotePort();
        System.out.println("Remote Address-->"+addr+":"+port);
        String laddr = request.getLocalAddr();
        int lport = request.getLocalPort();
        System.out.println("Local Address-->"+laddr+":"+lport);
        String saddr = request.getServerName();
        int sport = request.getServerPort();
        System.out.println("Server Info-->"+saddr+":"+sport);
        Map<String, String[]> mp = request.getParameterMap();
        System.out.println(mp);
//        HandlerMethod ha = (HandlerMethod) o;
//        MethodParameter[] par = ha.getMethodParameters();
//        for (MethodParameter pa:par){
//            System.out.println(pa.getMethod());
//        }
        Object json = modelAndView.getModel().get("org.springframework.validation.BindingResult.JSON");
        System.out.println(json);
        System.out.println("End The postHandle of Interceptor...");
    }

    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("Start The afterCompletion of Interceptor....");
        String addr = request.getRemoteAddr();
        int port = request.getRemotePort();
        System.out.println("Remote Address-->"+addr+":"+port);
        String laddr = request.getLocalAddr();
        int lport = request.getLocalPort();
        System.out.println("Local Address-->"+laddr+":"+lport);
        String saddr = request.getServerName();
        int sport = request.getServerPort();
        System.out.println("Server Info-->"+saddr+":"+sport);
        Map<String, String[]> mp = request.getParameterMap();
        System.out.println(mp);
//        HandlerMethod ha = (HandlerMethod) o;
//        MethodParameter[] par = ha.getMethodParameters();
//        for (MethodParameter pa:par){
//            System.out.println(pa.getMethod());
//        }
        System.out.println("End The afterCompletion of Interceptor...");
        response.sendRedirect("http://www.baidu.com");
    }

    public void afterConcurrentHandlingStarted(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("Start The afterConcurrentHandlingStarted of Interceptor....");
        System.out.println("End The afterConcurrentHandlingStarted of Interceptor...");
    }

}
