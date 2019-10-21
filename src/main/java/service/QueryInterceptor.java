package service;

import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.plugin.*;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;

import java.util.Properties;

/**
 * @author ：chenchao06
 * @description： file name
 * @mobile ：18676838076
 * @date ：Created in 2019/9/19 22:17
 * @modified By：
 * @version: 1.0
 */

@Intercepts(
        {
                @Signature(
                        type = Executor.class,
                        method="query",
                        args = {MappedStatement.class,Object.class,RowBounds.class,ResultHandler.class}
                )
        }
)

public class QueryInterceptor implements Interceptor {
    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        System.out.println("这里面是进行了一次拦截操作,主要是plugins起作用");
        return invocation.proceed();
    }

    @Override
    public Object plugin(Object target) {
        return Plugin.wrap(target,this);
    }

    @Override
    public void setProperties(Properties properties) {

    }
}
