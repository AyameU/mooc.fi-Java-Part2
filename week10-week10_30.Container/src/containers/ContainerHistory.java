package containers;

import java.util.ArrayList;
import java.util.Collections;

public class ContainerHistory {

    private ArrayList<Double> historyList;

    public ContainerHistory() {
        historyList = new ArrayList<Double>();
    }

    public void add(double situation) {
        historyList.add(situation);
    }

    public void reset() {
        historyList.clear();
    }

    public double maxValue() {
        if(historyList.isEmpty()) {
            return 0.0;
        }
        else {
            Collections.sort(historyList, Collections.reverseOrder());
            return historyList.get(0);
        }
    }

    public double minValue() {
        if(historyList.isEmpty()) {
            return 0.0;
        }
        else {
            Collections.sort(historyList);
            return historyList.get(0);
        }
    }

    public double average() {
        if(historyList.isEmpty()) {
            return 0.0;
        }
        else {
            Double sum = 0.0;
            for(Double d : historyList) {
                sum += d;
            }
            return sum / historyList.size();
        }
    }

    @Override
    public String toString() {
        return historyList.toString();
    }
}
