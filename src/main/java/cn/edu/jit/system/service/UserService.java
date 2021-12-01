package cn.edu.jit.system.service;

import cn.edu.jit.system.bean.Employee;

/**
 * @author: xutiankai
 * @date: 12/1/2021 1:46 PM
 * @version: 1.0
 */
public interface UserService {
    Employee queryEmployeeById(Integer employeeId);

    int changePassword(Employee employee, String password);


}
