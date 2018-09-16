package vens.ai.graduate.design.notifaction.mapper;

import vens.ai.graduate.design.notifaction.entity.User;

import java.util.List;

/**
 * @author
 * @date 2018-05-12 17:27
 **/
public interface UserMapper {
    /**
     * 通过stuId寻找user
     * @param stuIds
     * @return
     */
    List<User> findByStuId(List<String> stuIds);

    /**
     * select all user
     * @return
     */
    List<User> findAll();

    /**
     * 通过部门寻找user
     * @param department
     * @return
     */
    List<User> findByDepartment(String department);

    /**
     * 通过职务查找user
     * @param position
     * @return
     */
    List<User> findByPosition(String position);

}
