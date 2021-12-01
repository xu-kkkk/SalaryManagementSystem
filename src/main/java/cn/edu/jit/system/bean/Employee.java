package cn.edu.jit.system.bean;

/**
 * 员工（职工号，姓名，密码）
 *
 * @author: xutiankai
 * @date: 12/1/2021 12:59 PM
 * @version: 1.0
 */
public class Employee {
    private Integer employeeId;
    private String name;
    private String password;

    public Employee() {

    }

    public Employee(Integer employeeId, String name, String password) {
        this.employeeId = employeeId;
        this.name = name;
        this.password = password;
    }
}
