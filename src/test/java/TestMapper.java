import com.tmall.mapper.CategoryMapper;
import com.tmall.pojo.Category;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit spring配置文件
@ContextConfiguration("classpath:spring-mybatis.xml")
public class TestMapper {
    @Autowired
    private CategoryMapper categoryMapper;
    @Test
    public void testCategory() {
        Category category = new Category();
        category.setName("ww");
        categoryMapper.insert(category);
    }
}
