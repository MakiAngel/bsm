package com.uestc.fff.information.mapper;

import com.uestc.fff.information.domain.ClassInfo;
import com.uestc.fff.information.domain.ClassInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClassInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table class
     *
     * @mbg.generated Thu Jun 11 21:56:49 CST 2020
     */
    long countByExample(ClassInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table class
     *
     * @mbg.generated Thu Jun 11 21:56:49 CST 2020
     */
    int deleteByExample(ClassInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table class
     *
     * @mbg.generated Thu Jun 11 21:56:49 CST 2020
     */
    int deleteByPrimaryKey(String cid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table class
     *
     * @mbg.generated Thu Jun 11 21:56:49 CST 2020
     */
    int insert(ClassInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table class
     *
     * @mbg.generated Thu Jun 11 21:56:49 CST 2020
     */
    int insertSelective(ClassInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table class
     *
     * @mbg.generated Thu Jun 11 21:56:49 CST 2020
     */
    List<ClassInfo> selectByExample(ClassInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table class
     *
     * @mbg.generated Thu Jun 11 21:56:49 CST 2020
     */
    ClassInfo selectByPrimaryKey(String cid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table class
     *
     * @mbg.generated Thu Jun 11 21:56:49 CST 2020
     */
    int updateByExampleSelective(@Param("record") ClassInfo record, @Param("example") ClassInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table class
     *
     * @mbg.generated Thu Jun 11 21:56:49 CST 2020
     */
    int updateByExample(@Param("record") ClassInfo record, @Param("example") ClassInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table class
     *
     * @mbg.generated Thu Jun 11 21:56:49 CST 2020
     */
    int updateByPrimaryKeySelective(ClassInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table class
     *
     * @mbg.generated Thu Jun 11 21:56:49 CST 2020
     */
    int updateByPrimaryKey(ClassInfo record);
}