package cn.edu.jit.system.mapper;

import cn.edu.jit.system.bean.Employee;
import org.springframework.stereotype.Repository;

/**
 * @author: xutiankai
 * @date: 12/1/2021 1:15 PM
 * @version: 1.0
 */
@Repository
public interface UserMapper {
    /**
     * 向数据库中添加员工信息
     *
     * @param employee
     * @return 受影响的行数
     */
    int addEmployee(Employee employee);

    /**
     * 通过员工号查询员工
     *
     * @param EmployeeId 员工号
     * @return 员工对象
     */
    Employee queryEmployeeById(Integer EmployeeId);

    /**
     * 修改密码
     *
     * @param employee
     * @param password
     * @return
     */
    int updateEmployeePassword(Employee employee, String password);
}
