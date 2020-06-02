//import com.lyh.ssm.crud.bean.Department;
//import com.lyh.ssm.crud.bean.Employee;
//import com.lyh.ssm.crud.dao.DepartmentMapper;
//import com.lyh.ssm.crud.dao.EmployeeMapper;
//import org.apache.ibatis.session.SqlSession;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//import java.util.UUID;
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = "classpath:applicationContext.xml")
//public class TestCodeEnvironment {
//    @Autowired
//    EmployeeMapper employeeMapper;
//
//    @Autowired
//    DepartmentMapper departmentMapper;
//
//    @Autowired
//    SqlSession sqlSession;
//
//    @Test
//    public void testDept() {
//        departmentMapper.insertSelective(new Department(null, "开发部"));
//        departmentMapper.insertSelective(new Department(null, "测试部"));
//    }
//
//    @Test
//    public void testEmp() {
//        // 批量执行 sql 语句
//        EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);
//        for (int i = 0; i < 2; i++){
//            String name = UUID.randomUUID().toString().substring(0, 5) + i;
//            employeeMapper.insertSelective(new Employee(null, name, 1000.0, 20, "jarry@163.com",1));
//        }
//    }
//}
