package com.dmz;

import com.alibaba.dubbo.config.annotation.Service;
import com.dmz.facade.IAnnotationDubbo;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * Created by dmz on 2016/1/8.
 */
@Service(version = "1.0")
@Repository(value = "dmz")
public class AnnotationDubbo implements IAnnotationDubbo {

    @Resource(name="lazyInitDaoImpl")
    private LazyInitDao dmz;

    public AnnotationDubbo(){
        System.out.println("Annotation Construct");
    }
    public String annotation() {
        return dmz.sayLazyInitDao();
    }
}
