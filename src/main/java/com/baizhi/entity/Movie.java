package com.baizhi.entity;


import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "m_movie")
public class Movie {
    @Id
    @Column(name = "f_mid")
    private Integer id;
    @Column(name = "f_mname")
    private String name;
    @Column(name = "f_director")
    private String director;
    @Column(name = "f_describe")
    private String describe;
    @Column(name = "f_opendate")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JSONField(format = "yyyy-MM-dd")
    private Date opendate;
}
