package com.itheima.prize.commons.db.mapper;

import com.itheima.prize.commons.db.entity.SysRoleBtn;
import com.itheima.prize.commons.db.entity.SysRoleBtnExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface SysRoleBtnMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_btn
     *
     * @mbg.generated
     */
    long countByExample(SysRoleBtnExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_btn
     *
     * @mbg.generated
     */
    int deleteByExample(SysRoleBtnExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_btn
     *
     * @mbg.generated
     */
    @Delete({
        "delete from sys_role_btn",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_btn
     *
     * @mbg.generated
     */
    @Insert({
        "insert into sys_role_btn (role_id, btn_id, ",
        "create_time)",
        "values (#{roleId,jdbcType=INTEGER}, #{btnId,jdbcType=INTEGER}, ",
        "#{createTime,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(SysRoleBtn record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_btn
     *
     * @mbg.generated
     */
    int insertSelective(SysRoleBtn record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_btn
     *
     * @mbg.generated
     */
    List<SysRoleBtn> selectByExample(SysRoleBtnExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_btn
     *
     * @mbg.generated
     */
    @Select({
        "select",
        "id, role_id, btn_id, create_time",
        "from sys_role_btn",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("com.itheima.prize.commons.db.mapper.SysRoleBtnMapper.BaseResultMap")
    SysRoleBtn selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_btn
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") SysRoleBtn record, @Param("example") SysRoleBtnExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_btn
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") SysRoleBtn record, @Param("example") SysRoleBtnExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_btn
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(SysRoleBtn record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_btn
     *
     * @mbg.generated
     */
    @Update({
        "update sys_role_btn",
        "set role_id = #{roleId,jdbcType=INTEGER},",
          "btn_id = #{btnId,jdbcType=INTEGER},",
          "create_time = #{createTime,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(SysRoleBtn record);
}