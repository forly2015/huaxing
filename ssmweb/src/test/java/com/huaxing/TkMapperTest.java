package com.huaxing;

import com.huaxing.ssm.mapper.TKUserMapper;
import com.huaxing.ssm.pojo.UserPO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * 测试通用mapper
 */
@RunWith(SpringJUnit4ClassRunner.class) //使用junit4进行测试
@ContextConfiguration(locations={"classpath:spring/applicationContext-service.xml"}) //加载配置文件
public class TkMapperTest {
    @Resource
    private TKUserMapper mapper;

/*    @Before
    public void buildMapper() throws IOException {
        String resource = "mybatis/sqlMapConfig.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);

        MapperHelper mapperHelper = new MapperHelper();
        //特殊配置
        Config config = new Config();
        //设置配置
        mapperHelper.setConfig(config);
        // 注册自己项目中使用的通用Mapper接口，这里没有默认值，必须手动注册


        //这里出现了一点问题 要注意导包 不能使用mybatis的Mapper接口
        //使用tk的包
        mapperHelper.registerMapper(Mapper.class);

        //配置完成后，执行下面的操作
        mapperHelper.processConfiguration(sqlSession.getConfiguration());


        mapper = sqlSession.getMapper(TKUserMapper.class);

    }*/

    @Test
    public void test1(){
        List<UserPO> users = mapper.selectAll();
        for (int i=0;i<users.size();i++)
            System.out.println(users.get(i));
    }
}
