package com.huangdeyi.distribute.custom;

import com.huangdeyi.distributed.userservice.User;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

/**
 * 自定义参数转换器
 * SpringMvc在启动时会扫描这个组件到容器中。发现它实现了Converter接口，同时把它注册到参数转换器中？？？
 * 当控制器的参数类型为User（匹配）时，SpringMvc会找到这个转换器进行转换
 */
//@Component
public class UserConverter implements Converter<String, User> {
    public User convert(String source) {
        //在这里写转换规则
        return null;
    }
}
