package com.example.smittetryk01;

import com.example.smittetryk01.model.County;
import com.example.smittetryk01.repository.CountyRepository;
import org.assertj.core.api.Assert;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Smittetryk01ApplicationTests {

    @Autowired
    CountyRepository countyRepository;

    @Test
    void testFunc() {
        List<County> counties = countyRepository.findAll();
        Assertions.assertThat(2).isEqualTo(counties.size());

    }

}
