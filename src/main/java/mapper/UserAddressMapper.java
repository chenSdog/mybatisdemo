package mapper;

import domain.UserAddress;

/**
 * @author ：chenchao06
 * @description： file name
 * @mobile ：18676838076
 * @date ：Created in 2019/9/12 16:34
 * @modified By：
 * @version: 1.0
 */
public interface UserAddressMapper {
    UserAddress getById(Long id);


    UserAddress getStepsById(Long id);

    UserAddress getStepsByIdMult(Long id);
}
