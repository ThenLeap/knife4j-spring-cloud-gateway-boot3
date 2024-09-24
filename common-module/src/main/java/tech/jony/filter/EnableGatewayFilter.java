package tech.jony.filter;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Import({GatewayFilter.class})
@Inherited
public @interface EnableGatewayFilter {
}
