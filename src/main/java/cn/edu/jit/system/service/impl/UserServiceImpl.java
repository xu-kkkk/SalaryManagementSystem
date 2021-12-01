package cn.edu.jit.system.service.impl;

import cn.edu.jit.system.bean.Employee;
import cn.edu.jit.system.mapper.UserMapper;
import cn.edu.jit.system.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author: xutiankai
 * @date: 12/1/2021 1:48 PM
 * @version: 1.0
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {
    private final UserMapper userMapper;

    @Autowired
    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public Employee queryEmployeeById(Integer employeeId) {
        return userMapper.queryEmployeeById(employeeId);
    }

    @Override
    public int changePassword(Employee employee, String password) {
        return userMapper.updateEmployeePassword(employee, password);
    }
}
