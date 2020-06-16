package mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import model.User;
import org.springframework.stereotype.Component;

@Component
public interface UserMapper extends BaseMapper<User> {
}
