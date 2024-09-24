package tech.jony.filter;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;

import java.io.IOException;

/**
 * feat: 基础过滤器，拦截非网关传递的请求
 * 注：加上@EnableInnerCommunication注解，也接受openFeign调用的请求
 *
 * @author Jony
 */
public class GatewayFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest)servletRequest;
        String gateway = request.getHeader(GatewayFilterConstant.FILTER_KEY_NAME);
        if(gateway == null || gateway.equals("") || !gateway.equals(GatewayFilterConstant.FILTER_KEY_SECRET)){
            System.out.println("======外部请求无权直接访问内部服务=======");
            return;
        }
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }

}
