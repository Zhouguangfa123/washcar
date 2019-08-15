package com.hope.springmvc.service;

import com.hope.springmvc.bean.Spittle;

import java.util.List;

/**
 * SpittleRepository
 *
 * @author zhougf
 * @date 2019/08/15
 */
public interface SpittleRepository {
    List<Spittle> findSpittles(long max, int count);
}
