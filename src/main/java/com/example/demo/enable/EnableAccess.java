package com.example.demo.enable;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * Created by Rick on 2019/8/28.
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
//@Import(AccessImportSelector.class)
@Import(AccessImportBeanDefinitionRegistrar.class)
public @interface EnableAccess {
    /**
     * 接入类型
     * @return
     */
    Access.Type type();
}
