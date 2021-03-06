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
            return Collections.max(historyList);
        }
    }

    public double minValue() {
        if(historyList.isEmpty()) {
            return 0.0;
        }
        else {
            return Collections.min(historyList);
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

    public double greatestFluctuation() {
        if (historyList.isEmpty() || historyList.size() == 1) {
            return 0.0;
        } else {
            ArrayList<Double> maxList = new ArrayList<Double>();
            double max = 0.0;
            for (int i = 0; i < historyList.size() - 1; i++) {
                double result = Math.abs(historyList.get(i) - historyList.get(i + 1));

                if(result > max) {
                    max = result;
                }
            }
            return max;
        }
    }

    public double variance() {
        if(historyList.isEmpty() || historyList.size() == 1) {
            return 0.0;
        }
        else {
            Double sum = 0.0;
            for(Double d : historyList) {
                sum += Math.pow(d - this.average(), 2);
            }
            return sum / (historyList.size() - 1);
        }
    }

    @Override
    public String toString() {
        return historyList.toString();
    }
}
