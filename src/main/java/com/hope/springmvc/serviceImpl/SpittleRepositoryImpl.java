package com.hope.springmvc.serviceImpl;

import com.hope.springmvc.bean.Spittle;
import com.hope.springmvc.service.SpittleRepository;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * SpittleRepositoryImpl
 *
 * @author zhougf
 * @date 2019/08/15
 */
@Component
public class SpittleRepositoryImpl implements SpittleRepository {
    @Override
    public List<Spittle> findSpittles(long max, int count) {
        List<Spittle> spittles = new ArrayList<>(32);
        for (int i = 0; i < count; i++) {
            spittles.add(new Spittle("Spittle" + i, new Date()));
        }
        return spittles;
    }
}
