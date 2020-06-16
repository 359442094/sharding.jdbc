package model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author CJ
 * @date 2020/6/12
 */
@ToString
@Getter
@Setter
@TableName(value = "user")
public class User {

    @TableId(value = "id",type = IdType.AUTO)
    private int id;

    private String name;

    private String pwd;

}
