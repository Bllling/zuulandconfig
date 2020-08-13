package com.lin.user_client.pojo;

import lombok.Data;
import java.io.Serializable;

@Data
public class User implements Serializable {
    private Integer id;
    private String name;
    private String sex;
    private Integer age;
}
