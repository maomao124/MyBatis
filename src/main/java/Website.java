import java.util.Date;

/**
 * Project name(项目名称)：MyBatis
 * Package(包名): PACKAGE_NAME
 * Class(类名): Website
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/3/11
 * Time(创建时间)： 21:03
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Website
{
    private int id;
    private String name;
    private String url;
    private int age;
    private String country;
    private Date createtime;

    public Website()
    {
    }

    public Website(int id, String name, String url, int age, String country, Date createtime)
    {
        this.id = id;
        this.name = name;
        this.url = url;
        this.age = age;
        this.country = country;
        this.createtime = createtime;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getUrl()
    {
        return url;
    }

    public void setUrl(String url)
    {
        this.url = url;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public String getCountry()
    {
        return country;
    }

    public void setCountry(String country)
    {
        this.country = country;
    }

    public Date getCreatetime()
    {
        return createtime;
    }

    public void setCreatetime(Date createtime)
    {
        this.createtime = createtime;
    }

    @Override
    @SuppressWarnings("all")
    public String toString()
    {
        final StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("id：").append(id).append('\n');
        stringbuilder.append("name：").append(name).append('\n');
        stringbuilder.append("url：").append(url).append('\n');
        stringbuilder.append("age：").append(age).append('\n');
        stringbuilder.append("country：").append(country).append('\n');
        stringbuilder.append("createtime：").append(createtime).append('\n');
        return stringbuilder.toString();
    }
}
