package tech.jony.filter;

import feign.RequestInterceptor;
import feign.RequestTemplate;

/**
 * feat: 允许访问其它微服务
 * Feign拦截器，用于添加自定义请求头
 *
 * @author Jony
 */
public class CommunicationInterceptor implements RequestInterceptor {

    @Override
    public void apply(RequestTemplate template) {
        template.header(GatewayFilterConstant.FILTER_KEY_NAME,GatewayFilterConstant.FILTER_KEY_SECRET);
    }

}
