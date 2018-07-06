import com.wsl.ssm.model.Role;
import com.wsl.ssm.service.RoleService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * create by WSL_SILVA
 * 日期: 2018/7/6 0006
 * 用途：
 * 描述:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class TestMybatis {

    @Resource
    private RoleService roleService;

    @Test
    public void test(){
        List<Role> roles = roleService.selectAll();
    }
}
