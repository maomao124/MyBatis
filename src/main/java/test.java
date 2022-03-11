import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

/**
 * Project name(项目名称)：MyBatis
 * Package(包名): PACKAGE_NAME
 * Class(类名): test
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/3/11
 * Time(创建时间)： 21:13
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class test
{
    public static void main(String[] args) throws IOException
    {
        // 读取配置文件mybatis-config.xml
        InputStream config = Resources.getResourceAsStream("mybatis-config.xml");
        // 根据配置文件构建SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(config);
        // 通过SqlSessionFactory创建SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        // SqlSession执行文件中定义的SQL，并返回映射结果
        // 添加网站
        Website website = new Website();
        website.setName("百度");
        website.setUrl("www.baidu.com");
        website.setAge(12);
        website.setCountry("CN");
        website.setCreatetime(new Date());
        sqlSession.insert("Website.addWebsite", website);
        // 查询所有网站
        List<Website> listWeb = sqlSession.selectList("Website.selectAllWebsite");
        for (Website site : listWeb)
        {
            System.out.println(site);
        }
        //提交事务
        sqlSession.commit();
        //关闭SqlSession
        sqlSession.close();
    }
}
