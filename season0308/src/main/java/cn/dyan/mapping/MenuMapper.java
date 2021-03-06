package cn.dyan.mapping;

import cn.dyan.domain.Menu;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface MenuMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_menu
     *
     * @mbg.generated
     */
    @Delete({
        "delete from tb_menu",
        "where menu_id = #{menuId,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String menuId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_menu
     *
     * @mbg.generated
     */
    @Insert({
        "insert into tb_menu (menu_id, menu_name, ",
        "url, ord)",
        "values (#{menuId,jdbcType=VARCHAR}, #{menuName,jdbcType=VARCHAR}, ",
        "#{url,jdbcType=VARCHAR}, #{ord,jdbcType=TINYINT})"
    })
    int insert(Menu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_menu
     *
     * @mbg.generated
     */
    @Select({
        "select",
        "menu_id, menu_name, url, ord",
        "from tb_menu",
        "where menu_id = #{menuId,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="menu_id", property="menuId", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="menu_name", property="menuName", jdbcType=JdbcType.VARCHAR),
        @Result(column="url", property="url", jdbcType=JdbcType.VARCHAR),
        @Result(column="ord", property="ord", jdbcType=JdbcType.TINYINT)
    })
    Menu selectByPrimaryKey(String menuId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_menu
     *
     * @mbg.generated
     */
    @Select({
        "select",
        "menu_id, menu_name, url, ord",
        "from tb_menu"
    })
    @Results({
        @Result(column="menu_id", property="menuId", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="menu_name", property="menuName", jdbcType=JdbcType.VARCHAR),
        @Result(column="url", property="url", jdbcType=JdbcType.VARCHAR),
        @Result(column="ord", property="ord", jdbcType=JdbcType.TINYINT)
    })
    List<Menu> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_menu
     *
     * @mbg.generated
     */
    @Update({
        "update tb_menu",
        "set menu_name = #{menuName,jdbcType=VARCHAR},",
          "url = #{url,jdbcType=VARCHAR},",
          "ord = #{ord,jdbcType=TINYINT}",
        "where menu_id = #{menuId,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(Menu record);
}