package org.xman.jeefw.web.service;

import org.xman.jeefw.web.model.Strategy;

import java.util.List;

public interface StrategyService {

    public void addStrategy(Strategy strategy);

    public Strategy getStrategy(int id);

    public void updateStrategy(Strategy strategy);

    public void deleteStrategy(int id);

    public List<Strategy> getStrategies();

}
