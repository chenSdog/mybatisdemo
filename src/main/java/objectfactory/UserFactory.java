package objectfactory;

import domain.BussOb;
import domain.User;
import org.apache.ibatis.reflection.factory.DefaultObjectFactory;

import java.util.List;

/**
 * @author ：chenchao06
 * @description： file name
 * @mobile ：18676838076
 * @date ：Created in 2019/9/20 15:03
 * @modified By：
 * @version: 1.0
 */
public class UserFactory extends DefaultObjectFactory {
    @Override
    public <T> T create(Class<T> type) {
        return super.create(type);
    }

    @Override
    public <T> T create(Class<T> type, List<Class<?>> constructorArgTypes, List<Object> constructorArgs) {
        T ret  = super.create(type, constructorArgTypes, constructorArgs);
        if(BussOb.class.isAssignableFrom(ret.getClass())){
            BussOb user = (BussOb)ret;
            user.init();
        }
        return ret;
    }
}
