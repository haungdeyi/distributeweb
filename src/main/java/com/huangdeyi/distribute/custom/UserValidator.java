package com.huangdeyi.distribute.custom;

import com.huangdeyi.distributed.userservice.User;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

/**
 * 自定义参数验证器
 * 通过@InitBinder得到WebDataBinder对象，然后通过WebDataBinder将它添加到
 * 验证器集中，WebDataBinder也可以添加参数转化器，这样SpringMvc就可以发现它
 * 在参数转换完成之后可以对转换出来的参数进行验证，SpringMvc在验证时会遍
 * 历所有的验证器，当发现supports方法返回true时就会使用这个验证器进行验证
 *
 */
public class UserValidator implements Validator {
    /**
     * 参数clazz是控制器对应参数的类型的Class对象
     * @param clazz
     * @return
     */
    public boolean supports(Class<?> clazz) {
        return User.class.equals(clazz);
    }

    public void validate(Object target, Errors errors) {
         //在这里写验证逻辑
    }
}
