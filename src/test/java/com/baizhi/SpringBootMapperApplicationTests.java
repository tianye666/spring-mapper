package com.baizhi;

import com.baizhi.entity.Movie;
import com.baizhi.mapper.MovieMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootMapperApplicationTests {
    @Autowired
    MovieMapper movieMapper;

    @Test
    public void contextLoads() {
        List<Movie> movies = movieMapper.selectAll();
        for (Movie movie : movies) {
            System.out.println(movie);
        }

    }

}

