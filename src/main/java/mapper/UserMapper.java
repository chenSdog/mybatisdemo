package mapper;

import domain.User;

import java.util.List;

public interface UserMapper {
    public User getById(Long id);

    public User getStepsMultParams(Long id,String name);

    public User getUserIncludeAddress(Long id);

    public User getUserByType(Long id);
}
