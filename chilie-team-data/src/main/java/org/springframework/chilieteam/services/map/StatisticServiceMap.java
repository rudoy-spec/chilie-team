package org.springframework.chilieteam.services.map;

import org.springframework.chilieteam.model.Statistics;
import org.springframework.chilieteam.services.StatisticService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class StatisticServiceMap extends AbstractServiceMap<Statistics, Long> implements StatisticService {

    @Override
    public Set<Statistics> findAll() {
        return super.findAll();
    }

    @Override
    public Statistics findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Statistics save(Statistics object) {
        return super.save(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Statistics object) {
        super.delete(object);
    }
}
