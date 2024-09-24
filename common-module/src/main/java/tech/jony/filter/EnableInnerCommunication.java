package tech.jony.filter;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Import({CommunicationInterceptor.class})
@Inherited
public @interface EnableInnerCommunication {
}
