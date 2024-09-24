package teck.jony;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.http.server.PathContainer;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * feat: 给经过gateway网关的请求添加请求头，允许路由到下游服务
 */
@Component
public class BaseFilter implements GlobalFilter {

    private static final String FILTER_KEY_NAME = "gateway_filter_key_name";
    private static final String FILTER_KEY_SECRET = "gateway_filter_key_secret";

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        ServerHttpRequest request = exchange.getRequest();
        PathContainer pathContainer = request.getPath().pathWithinApplication();
        // 添加gatewayKey，防止下游接口直接被访问
        ServerHttpRequest.Builder mutate = request.mutate();
        mutate.header(FILTER_KEY_NAME, FILTER_KEY_SECRET);
        return chain.filter(exchange.mutate().request(mutate.build()).build());
    }
}
